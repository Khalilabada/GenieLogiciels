package com.boky.PFE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService
{
    @Autowired
    private JavaMailSender emailSender;
    
    @Override
    public void SendSimpleMessage(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noreply@boky.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        try {
            emailSender.send(message);
            System.out.println("[EmailService] Email envoyé avec succès à: " + to);
        } catch (MailException e) {
            System.err.println("[EmailService] Erreur lors de l'envoi d'email à: " + to + " - " + e.getMessage());
        }
    }
}