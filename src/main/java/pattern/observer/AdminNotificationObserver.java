package pattern.observer;

import com.boky.PFE.entite.Reservation;
import org.springframework.stereotype.Component;

@Component
public class AdminNotificationObserver implements ReservationObserver {
 
    @Override
    public void update(Reservation reservation, String evenementType) {
        switch(evenementType) {
            case "CREATE":
                System.out.println("========================================");
                System.out.println("[ADMIN ALERTE] Nouvelle réservation créée !");
                System.out.println("  ID réservation: " + reservation.getId());
                System.out.println("  Annonce: " + reservation.getAnnonce().getTitre());
                System.out.println("  Montant: " + reservation.getMontant_paye() + "€");
                System.out.println("  Client: " + reservation.getUtilisateur().getNom());
                System.out.println("========================================");
                break;
                
            case "DELETE":
                System.out.println("[ADMIN ALERTE] Réservation annulée - ID: " + reservation.getId());
                break;
                
            case "CONFIRM":
                System.out.println("[ADMIN INFO] Réservation confirmée - ID: " + reservation.getId());
                break;
        }
    }
}