package pattern.observer;

import com.boky.PFE.entite.Reservation;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class LogObserver implements ReservationObserver {
    
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    @Override
    public void update(Reservation reservation, String evenementType) {
        String timestamp = LocalDateTime.now().format(FORMATTER);
        
        String logMessage = String.format(
            "[LOG] %s - Réservation #%d - Événement: %s - Montant: %d€ - Annonce: %s",
            timestamp,
            reservation.getId(),
            evenementType,
            reservation.getMontant_paye(),
            reservation.getAnnonce().getTitre()
        );
        
        System.out.println(logMessage);
    }
}