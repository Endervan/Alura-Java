package infra;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;


public class DAO<E> {

    private static EntityManagerFactory emf;
    private final EntityManager em;
    private Class<E> classe;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("exercicio-jpa");
        } catch (Exception e) {

        }
    }


    public DAO(Class<E> classe) {
        this.classe = classe;
        em = emf.createEntityManager();
    }

    public DAO() {
        this(null);
    }

    public DAO<E> abrirT() {
        em.getTransaction().begin();
        return this;
    }

    public DAO<E> fecharT() {
        em.getTransaction().commit();
        return this;
    }

    public DAO<E> incluir(E entidade) {
        em.persist(entidade);
        return this;
    }

    public DAO<E> incluirAtomico(E entidade) {
        return this.abrirT().incluir(entidade).fecharT();
    }

    // usando sobrecarga de obterTodos para permitir a obtenção de todos os registros
    // com ou sem limites e deslocamento
    public List<E> obterTodos() {
        return this.obterTodos(10, 0);
    }

    public List<E> obterTodos(int limit, int offset) {
        if (classe == null) {
            throw new UnsupportedOperationException("Classe não definida para o DAO.");
        }

        String jpql = "SELECT e FROM " + classe.getName() + " e";
        return em.createQuery(jpql, classe)
                .setMaxResults(limit)
                .setFirstResult(offset)
                .getResultList();
    }

    public DAO<E> fechar() {
        em.close();
        return this;
    }

}
