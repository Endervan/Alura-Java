package modelo.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class RemoveUsuario1 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicio-jpa");
        EntityManager em = emf.createEntityManager();

        // estando dentro transação, o objeto e gerenciado
        em.getTransaction().begin();
        Usuario usuario = em.find(Usuario.class, 7L);

        if (usuario != null) {
            em.remove(usuario);
        }
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
