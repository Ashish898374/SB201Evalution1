package Question2;

import com.google.protobuf.Timestamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;


public class SaveData {
    public static void main(String[] args) {

        EntityManagerFactory T= Persistence.createEntityManagerFactory("BlueDart");
        EntityManager em=T.createEntityManager();
        Date date = new Date();
        Shipment sp=new Shipment();
        sp.setContent("Buscuit basket");
        sp.setCreated_timestamp(new Timestamp(date.getTime()));
        sp.setPackageNumber("Df5988768");
        sp.setWeight(54.8);

        sp.setRecipientAddress("Chennai");
        sp.setSenderAddress("Banglore");
        em.getTransaction().begin();
        em.persist(sp);
        em.getTransaction().commit();
        em.close();
        System.out.println("data saved...");
    }
}
