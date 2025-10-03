package org.example.ender.model.repositories;

import org.example.ender.model.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    // Usando nome containing para buscar produtos que contenham uma string no nome
    public Iterable<Produto> findByNomeContainingIgnoreCase(String nome);
}
