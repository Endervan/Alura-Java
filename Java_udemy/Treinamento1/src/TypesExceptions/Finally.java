package TypesExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finally {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\endva\\Desktop\\Alura\\java\\Alura-Java\\Java_udemy\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro open file " );
            System.out.print( e.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }
        }

    }


}


