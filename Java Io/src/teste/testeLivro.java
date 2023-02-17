package teste;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class testeLivro {


        public static void main(String[] args) throws Exception {
            Autor autor = new Autor();
            autor.setNome("Joana");

            Livro livro = new Livro();
            livro.setTitulo("Serialização com Java IO");
            livro.setAutor(autor);


            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("livro.bin"));
            oos.writeObject(livro);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("livro.bin"));
            Livro livroSerializado = (Livro) ois.readObject();
            ois.close();
            System.out.println(livroSerializado);
        }


}

