package modelo.basico;

import infra.DAO;

public class NovoProduto {

    public static void main(String[] args) {

        Produto produto = new Produto("Monitor 23", 788.99);
        DAO<Produto> dao = new DAO<>(Produto.class);

//        dao.abrirT().incluir(produto).fecharT().fechar();
        dao.incluirAtomico(produto).fechar();

    }
}
