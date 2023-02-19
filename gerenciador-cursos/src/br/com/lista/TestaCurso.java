package br.com.lista;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Domindoa as coleçoes java ","Ender");

//        List<Aula> aulas = javaColecoes.getAulas();

        javaColecoes.adicionar(new Aula("Trabalhando com ArrayList",21));
        javaColecoes.adicionar(new Aula("Criando aula ",20));
        javaColecoes.adicionar(new Aula("Modelando com coleções ",22));
        System.out.println(javaColecoes.getAulas());
    }

   // ArrayList
    // pos trabalha internamente buscar dados com array  forma muito rapida
    // contra ... adiconar itens na lista consome muita memoria pq modifica


    //LinkedList
    // pos -> trabalhar muito rapido em add e remove itens numa lista atravez de ponterios
    // contra ->

}


