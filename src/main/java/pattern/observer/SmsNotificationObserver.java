package pattern.observer;

import com.boky.PFE.entite.Reservation;
import org.springframework.stereotype.Component;

@Component
public class SmsNotificationObserver implements ReservationObserver {
    
    @Override
    public void update(Reservation reservation, String evenementType) {
        if ("CREATE".equals(evenementType)) {
            System.out.println("[SmsObserver] Envoi de SMS au client pour confirmation");
            // Iui tu intègrerais un vrai service SMS (Twilio, etc.)
            // smsService.send(client.getTelephone(), "Votre réservation est confirmée");
        }
    }
}