package TrabalhandoComArquivos.ManipulandoPastas;

import java.io.File;
import java.util.Scanner;

public class ProgramManipulandoPastas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // percorrendo pastas e subpastas: isDirectory
        File[] folders = path.listFiles(File::isDirectory);

        System.out.println("Folders");

        for (File folder : folders) {
            System.out.println(folder);
        }

        // percorrendo Arquivos : isFile
        File[] files = path.listFiles(File::isFile);

        System.out.println("Files");

        for (File file : files) {
            System.out.println(file);
        }

        System.out.println("Criando Subpast");
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory Created with successfuly: " + success);

        sc.close();
    }
}
