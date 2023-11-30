package TrabalhandoComArquivos.Buscando;

import java.io.File;
import java.util.Scanner;

public class ProgramBuscandoFile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("Pegando somente o nome do arquivo: " + path.getName());

        System.out.println("Pegando somente o caminho do arquivo: " + path.getParent());
        sc.close();
    }
}
