package infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class DAO<E> {

    private static EntityManagerFactory emf;
    private EntityManager em;
    private Class<E> classe;

    static {
        try {
            emf = Persistence
                    .createEntityManagerFactory("exercicio-jpa");
        } catch (Exception e) {
            System.err.println("Erro ao inicializar o EntityManagerFactory: " + e.getMessage());
        }
    }

    public DAO(Class<E> classe) {
        this.classe = classe;
        this.em = emf.createEntityManager(); // Inicialização do EntityManager
    }

    public E obterPorId(Object id) {
        return em.find(classe, id);
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

    public void fechar() {
        em.close();
    }

}
