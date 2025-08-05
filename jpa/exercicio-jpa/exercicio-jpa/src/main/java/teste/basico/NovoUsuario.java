package teste.basico;

import modelo.basico.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class NovoUsuario {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicio-jpa");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = new Usuario("joao", "joao@email.com");
//        usuario.setId(1L); // Definindo o ID do usuário, necessário para persistir


        em.getTransaction().begin(); // begin => iniciar a transação
        em.persist(usuario); // persist => inserir no banco um novo registro como objeto
        em.getTransaction().commit(); // commit => confirmar a transação
        em.close();
        emf.close();

    }
}
