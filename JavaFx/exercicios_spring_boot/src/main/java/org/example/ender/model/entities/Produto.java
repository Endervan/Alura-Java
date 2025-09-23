package org.example.ender.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank // nao aceita nulo ou vazio
    private String nome;

    @Min(0) // valor minimo 0
    private Double preco;

    @Min(0)
    @Max(1) // valor maximo 1
    private Double desconto;

    public Produto() {
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(String nome, Double preco, Double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public Integer getId() { // Alterado de int para Integer
        return id;
    }

    public void setId(Integer id) { // Alterado de int para Integer
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }
}
