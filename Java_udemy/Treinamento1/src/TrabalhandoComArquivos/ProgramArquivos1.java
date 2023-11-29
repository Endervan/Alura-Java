package TrabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramArquivos1 {

    public static void main(String[] args) {
//        FileReader => stream de leitura de caracteres a partir de um arquivos
//        BufferedReader=> mais rapido

        // processo manual
        String path = "C:\\temp\\in.txt1";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // BufferedReader e uma abstracao maior do FileReader
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }  finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
        }

    }
}
