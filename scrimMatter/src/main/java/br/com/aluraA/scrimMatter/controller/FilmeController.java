package br.com.aluraA.scrimMatter.controller;

import br.com.aluraA.scrimMatter.model.filme.DadosCadastraFilme;
import br.com.aluraA.scrimMatter.model.filme.Filme;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    private final List<Filme> filmes = new ArrayList<>();

    @GetMapping("/formulario")
    public String carregaPaginaFormulario() {
        return "filmes/formulario";
    }


    @GetMapping
    public String carregaPaginaListagem(Model model) {
        model.addAttribute("lista",filmes);
        return "filmes/listagem";
    }

    @PostMapping
    public String cadastraFilme(DadosCadastraFilme dados) {
        var filme = new Filme(dados);
        filmes.add(filme);

        System.out.println(filmes);
        return "filmes/formulario";
    }


}

//    Lançado oficialmente no Java 16, mas disponível desde o Java 14 de maneira experimental, o Record é um recurso que permite representar uma classe imutável, contendo apenas atributos, construtor e métodos de leitura, de uma maneira muito simples e enxuta.
//
//        Esse APAGAR código se encaixa perfeitamente quando precisamos representar os dados enviados em um formulário, já que o foco é apenas nos dados em si que serão recebidos, sem nenhum tipo de comportamento adicional.
//
//        Para se criar uma classe de dados imutável, sem a utilização do Record, era necessário escrever muito código. Vejamos um exemplo de uma classe que representa um telefone:
