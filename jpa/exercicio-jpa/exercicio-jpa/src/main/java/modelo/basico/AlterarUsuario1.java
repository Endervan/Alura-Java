package modelo.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class AlterarUsuario1 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicio-jpa");
        EntityManager em = emf.createEntityManager();

        // estando dentro transação, o objeto e gerenciado
        em.getTransaction().begin();
        Usuario usuario = em.find(Usuario.class, 1L);

        usuario.setNome("louise223311555");
//        usuario.setEmail("louise@email.com");

//        em.merge(usuario); // busca usuario no banco e atualiza os dados
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
