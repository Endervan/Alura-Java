package br.com.lista;

public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Domindoa as coleçoes java ", "Ender");


        javaColecoes.adicionar(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adicionar(new Aula("Criando aula ", 20));
        javaColecoes.adicionar(new Aula("Modelando com coleções ", 22));

        Aluno a1 = new Aluno("Rodrigo Turiri",34672);
        Aluno a2 = new Aluno("Ender Alves",5617);
        Aluno a4 = new Aluno("louise ",5617);
        Aluno a3 = new Aluno("Manuela Ximenes",5312);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);

        System.out.println("Quem e o aluno com matricula 5617??");
        System.out.println(javaColecoes.buscaMatriculado(5617));
    }
}
