package modelo.basico;

import infra.ProdutoDAO;

import java.util.List;

public class ObterProdutos {

    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        for (Produto produto : produtos) {
            System.out.println("id " + produto.getId() + ",nome " + produto.getNome());
        }

        double precoTotal = produtos.stream()
                .mapToDouble(Produto::getPreco)
                .sum();

        System.out.println("Total dos produtos: " + precoTotal);
        System.out.println("Quantidade de produtos: " + produtos.size());
        System.out.println("Média dos preços: " + (precoTotal / produtos.size()));
        System.out.println("Maior preço: " + produtos.stream().mapToDouble(Produto::getPreco).max().orElse(0.0));
        System.out.println("Menor preço: " + produtos.stream().mapToDouble(Produto::getPreco).min().orElse(0.0));
        System.out.println("Produtos com preço maior que 100: " +
                produtos.stream()
                        .filter(p -> p.getPreco() > 100)
                        .count());


    }
}
