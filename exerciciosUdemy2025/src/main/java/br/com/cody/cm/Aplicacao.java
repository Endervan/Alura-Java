package br.com.cody.cm;

import br.com.cody.cm.modelo.Tabuleiro;

public class Aplicacao {

    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);

        System.out.println("Bem-vindo ao Campo Minado!");
        tabuleiro.alternarMarcado(4, 4);
        tabuleiro.alternarMarcado(4, 5);
        tabuleiro.abrir(3,3);
        System.out.println(tabuleiro);
    }
}
