package br.com.lista;

import java.util.*;

public class Curso {
    //    private final Long tempoTotal
    private final String nome;
    private final String instrutor;
    private final List<Aula> aulas = new LinkedList<Aula>();
    private final Set<Aluno> alunos = new HashSet<Aluno>();

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


    public int getTempoTotal() {
//        int tempoTotal = 0;
//        for (Aula aula : aulas) {
//            tempoTotal += aula.getTempo();
//        }
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
    }

//    public Set<Aluno> getAlunos() {
//        return Collections.unmodifiableSet(alunos);
//    }
    public Set<Aluno> getAlunos() {
        return Collections.synchronizedSet(alunos);
//        synchronizedSet ..monta lista em ordem alfabetica
    }


}

