package org.example.forEach;

import java.util.Scanner;

import java.util.Scanner;

public class DesafioNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas deseja digitar? ");
        int quantidadeNotas = 0;

        try {
            quantidadeNotas = Integer.parseInt(scanner.nextLine());
            if (quantidadeNotas <= 0) {
                System.out.println("Erro: a quantidade deve ser um número inteiro positivo.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: digite um número inteiro válido.");
            return;
        }

        double soma = 0;
        int notasValidas = 0;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            String entrada = scanner.nextLine().replace(",", ".");

            try {
                double nota = Double.parseDouble(entrada);
                if (nota < 0) {
                    System.out.println("Nota inválida: não pode ser negativa.");
                    i--; // repete a mesma nota
                } else {
                    soma += nota;
                    notasValidas++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida: digite apenas números positivos.");
                i--; // repete a mesma nota
            }
        }

        double media = soma / notasValidas;
        System.out.printf("Média das notas: %.2f%n", media);
    }
}

