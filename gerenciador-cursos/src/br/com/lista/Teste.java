package br.com.lista;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Teste {

    public static void main(String args[]) {

        Funcionario f1 = new Funcionario("Barney", 12);
        Funcionario f2 = new Funcionario("Jonatan", 9);
        Funcionario f3 = new Funcionario("Guaraciara", 13);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        Iterator<Funcionario> iterador = funcionarios.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next().getNome());
        }
    }

//    Provavelmente, caso a modelagem do sistema ainda não esteja bem definida, o desenvolvedor irá utilizar a interface Collection<E>. Dessa maneira, terá acesso aos métodos básicos de todas as implementações, como size(), add(), remove() e contains(). Conforme for sentindo necessidade em algo específico, o desenvolvedor fará poucas mudanças em seu código.
//    Caso sinta necessidade de fazer uma requisição a um elemento específico através da sua posição, trocará de Collection<E> para List<E>. Caso perceba que ordem não importa, porém é necessária uma busca bem rápida (e sem repetições), um Set<E> é mais apropriado.
//    Enquanto não sentir essa necessidade, provavelmente a Collection<E> será a melhor escolha.
}