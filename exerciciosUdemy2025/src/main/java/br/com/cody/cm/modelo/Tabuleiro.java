package br.com.cody.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Tabuleiro {

    private final List<Campo> campos = new ArrayList<>();
    private final int linhas;
    private final int colunas;
    private final int minas;

    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;
        gerarCampos();
        associarVizinhos();
        sortiarMinas();
    }

    public void abrir(int linha, int coluna) {
        campos.parallelStream()
                .filter(campo -> getLinhas() == linha && getColunas() == coluna)
                .findFirst()
                .ifPresent(Campo::abrir);
    }

    private void gerarCampos() {
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < colunas; coluna++) {
                campos.add(new Campo(linha, coluna));
            }
        }
    }

    public void alternarMarcado(int linha, int coluna) {
        campos.parallelStream()
                .filter(campo -> getLinhas() == linha && getColunas() == coluna)
                .findFirst()
                .ifPresent(Campo::alternarMarcado);
    }

    private void associarVizinhos() {
        for (Campo campo : campos) {
            for (Campo campo2 : campos) {
                campo.adicionarVizinho(campo2);
            }
        }
    }

    private void sortiarMinas() {
        long minasArmadas = 0;
        Predicate<Campo> minado = Campo::isMinado;
        do {
            minasArmadas = campos.stream().filter(minado).count();
            int aleatorio = (int) (Math.random() * campos.size());
            campos.get(aleatorio).minar();
        } while (minasArmadas < minas);
    }

    public int getLinhas() {
        return linhas;
    }


    public int getColunas() {
        return colunas;
    }


    public boolean objetivoAlcancado() {
        return campos.stream().allMatch(Campo::objetivoAlcancado);
    }

    public void reiniciar() {
        campos.stream().forEach(Campo::reiniciar);
        sortiarMinas();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                sb.append(" ");
                sb.append(campos.get(i));
                sb.append(" ");
                i++;
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
