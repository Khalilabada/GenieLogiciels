package com.boky.PFE.service;

public interface EmailService {
    void SendSimpleMessage(String to, String subject, String text);
}