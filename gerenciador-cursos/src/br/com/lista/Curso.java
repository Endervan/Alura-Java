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

//        Uma das características mais interessantes de JVM é que ela sabe trabalhar em paralelo. Internamente isso é feito por meio de Threads que funcionam como pequenos processos dentro da JVM.
//
//        O problema é que as coleções que estamos usando até agora não foram feitas para serem manipuladas em paralelo. No entanto, nada impede que usemos um método da classe Collections para transformar uma coleção comum em uma coleção para threads. É justamente isso que o método faz, retorna um nova coleção que pode ser compartilhada entre threads sem perigos.
//
//                O tópico de Threads é importante pois elas são muito utilizadas dentro das bibliotecas que rodam no mundo Java. Na Alura, temos dois treinamentos dedicados a threads:
    }


    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }
}

