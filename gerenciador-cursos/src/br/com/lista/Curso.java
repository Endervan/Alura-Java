package br.com.lista;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
    private final String nome;
    private final String instrutor;
    private final List<Aula> aulas = new LinkedList<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas); // lista randonly
    }

    public void adicionar(Aula aula) {
        this.aulas.add(aula);
    }
}

