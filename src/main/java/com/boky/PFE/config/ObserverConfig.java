package com.boky.PFE.config;

import com.boky.PFE.service.ReservationServiceImpl;
import pattern.observer.AdminNotificationObserver;
import pattern.observer.EmailNotificationObserver;
import pattern.observer.LogObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ObserverConfig {
    
    @Autowired
    private ReservationServiceImpl reservationService;
    
    @Autowired
    private EmailNotificationObserver emailObserver;
    
    @Autowired
    private AdminNotificationObserver adminObserver;
    
    @Autowired
    private LogObserver logObserver;
    
    @EventListener(ApplicationReadyEvent.class)
    public void attachObservers() {
        reservationService.attach(emailObserver);
        reservationService.attach(adminObserver);
        reservationService.attach(logObserver);
        
        System.out.println("\n╔════════════════════════════════════════════════════════════╗");
        System.out.println("║     PATTERN OBSERVER - CONFIGURATION RÉUSSIE              ║");
        System.out.println("╠════════════════════════════════════════════════════════════╣");
        System.out.println("║  Observateurs attachés:                                   ║");
        System.out.println("║    • EmailNotificationObserver (MailHog)                  ║");
        System.out.println("║    • AdminNotificationObserver                            ║");
        System.out.println("║    • LogObserver                                          ║");
        System.out.println("║                                                          ║");
        System.out.println("║  Total: 3 observateur(s)                                  ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");
    }
}