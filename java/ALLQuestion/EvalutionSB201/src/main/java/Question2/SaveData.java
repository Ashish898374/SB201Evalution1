package Question2;




///
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;
import java.security.Timestamp;


public class SaveData {
    public static void main(String[] args) {

        EntityManagerFactory sp= Persistence.createEntityManagerFactory("BlueDart");
        EntityManager em=sp.createEntityManager();
        Date date = new Date();
        Shipment bd=new Shipment();
        bd.setContent("mario basket");
        bd.setCreated_timestamp(new Timestamp(date.getTime()));
        bd.setPackageNumber("Df5988768");
        bd.setWeight(54.8);
        bd.setRecipientAddress("Chennai");
        bd.setSenderAddress("Banglore");
        em.getTransaction().begin();
        em.persist(bd);
        em.getTransaction().commit();
        em.close();
        System.out.println("data saved...");
    }
}
