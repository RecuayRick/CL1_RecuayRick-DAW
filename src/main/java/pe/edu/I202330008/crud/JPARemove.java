package pe.edu.I202330008.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.I202330008.entity.country;

public class JPARemove {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_JD");
        EntityManager em = emf.createEntityManager();

        country country = em.find(country.class, "RCY");

        em.getTransaction().begin();
        em.remove(country);
        em.getTransaction().commit();
    }
}