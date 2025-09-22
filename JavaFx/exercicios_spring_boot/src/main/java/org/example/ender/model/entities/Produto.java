package org.example.ender.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // alterado para private

    private String nome; // alterado para private

    public Produto() {
    }

    public Produto(String nome) {
        super();
        this.nome = nome;
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
}
