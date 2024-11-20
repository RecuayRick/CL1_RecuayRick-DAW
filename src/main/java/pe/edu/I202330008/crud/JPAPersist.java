package pe.edu.I202330008.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.I202330008.entity.country;

public class JPAPersist {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_JD");
        EntityManager em = emf.createEntityManager();

        country country = new country("RCY","rickcity","Asia","Desert",7800.00,1740,20780,77.5,71.38,83.81,"rickmain","Democrático","Rory",116679,"RY",null,null);

        em.getTransaction().begin();
        em.persist(country);
        em.getTransaction().commit();
    }
}
