package org.example.ender.controls;

import jakarta.validation.Valid;
import org.example.ender.model.entities.Produto;
import org.example.ender.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(@RequestParam String nome) {
        Produto produto = new Produto(nome);
        produtoRepository.save(produto);
        return produto;
    }

    @PostMapping("/preco")
    public @ResponseBody Produto novoProdutoPreco(@RequestParam String nome, @RequestParam Double preco, @RequestParam Double desconto) {
        Produto produto = new Produto(nome, preco, desconto);
        produtoRepository.save(produto);
        return produto;
    }

    @PostMapping("/objeto")
    public @ResponseBody Produto novoProdutoPrecoObj(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }
}
