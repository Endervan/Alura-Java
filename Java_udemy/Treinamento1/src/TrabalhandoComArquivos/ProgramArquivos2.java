package TrabalhandoComArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramArquivos2 {

    public static void main(String[] args) {

        String[] lines = new String[]{"rrrrrrrr", "aaaa", "wwwwwwww"};

        // cria arquivos
        String path = "C:\\temp\\out.txt";

        // new FileWriter(path,true) paramts true nao recriar arquivos somente concatena
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
