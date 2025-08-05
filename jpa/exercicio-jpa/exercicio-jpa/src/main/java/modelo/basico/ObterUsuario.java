package modelo.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class ObterUsuario {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicio-jpa");
        EntityManager em = emf.createEntityManager();

        // Obter o usuário com ID 1
        Usuario usuario = em.find(Usuario.class, 6L);

        if (usuario != null) {
            System.out.println("Usuário encontrado: " + usuario.getNome() + ", Email: " + usuario.getEmail());
        } else {
            System.out.println("Usuário não encontrado.");
        }

        em.close();
        emf.close();
    }
}
