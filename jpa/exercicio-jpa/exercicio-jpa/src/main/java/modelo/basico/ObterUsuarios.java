package modelo.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;


public class ObterUsuarios {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicio-jpa");
        EntityManager em = emf.createEntityManager();

//        String jpql = "SELECT u FROM Usuario u"; // JPQL para obter todos os usuários
//        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
//        query.setMaxResults(10); // Limitar a 10 resultados


        List<Usuario> usuarios = em.createQuery("SELECT u FROM Usuario u", Usuario.class)
                .setMaxResults(10) // Limitar a 10 resultados
                .getResultList();


        for (Usuario u : usuarios) {
            System.out.println("Usuário: " + u.getNome() + ", Email: " + u.getEmail());
        }

        em.close();
        emf.close();
    }
}
