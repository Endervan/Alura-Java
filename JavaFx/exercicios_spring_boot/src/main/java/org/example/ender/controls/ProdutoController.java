package org.example.ender.controls;

import jakarta.validation.Valid;
import org.example.ender.model.entities.Produto;
import org.example.ender.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
    public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
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

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/nome/{parteNome}")
    public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
        return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
    }

    @GetMapping(path = "paginas/{numeroPagina}")
    public Iterable<Produto> obterProdutosPaginacao(@PathVariable int numeroPagina) {
        Pageable page = PageRequest.of(numeroPagina, 3);
        return produtoRepository.findAll(page);
    }

    @GetMapping("/{id}")
    public Optional<Produto> obterPorId(@PathVariable int id) {
        return produtoRepository.findById(id);
    }

//    @PutMapping // Atualiza um produto existente inteiro  ou ´parcial  , patch alterar somente parcial
//    public Produto alterProduto(@Valid Produto produto) {
//        produtoRepository.save(produto);
//        return produto;
//    }

    @DeleteMapping(path = "/{id}")
    public void deletarProduto(@PathVariable int id) {
        produtoRepository.deleteById(id);
    }
}
