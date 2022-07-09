package Iniciante;

public class TestLacosEncadeadosFernando {
    public static void main(String[] args) {

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna <= linha ; coluna++) {
                System.out.printf(String.valueOf(coluna+1));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

