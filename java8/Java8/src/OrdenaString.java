import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaString {
    // usando versão antiga ante 1.8
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();

        palavras.add("alura online");
        palavras.add("Editora online");
        palavras.add("Casa do Codigo online");
//        Comparator<String> comparator = new ComparadorPorTamanho();
        //Collections.sort(palavras,comparator);

        // novo
//        palavras.sort((s1, s2) -> {
//            if (s1.length() > s2.length()) return -1;
//            if (s1.length() < s2.length()) return 0;
//            return 0;
//        });

        // melhorado
        palavras.sort((s1,s2)->Integer.compare(s1.length(),s2.length()));
        System.out.println(palavras);

        // velho
//        for (String p: palavras) {
//            System.out.println(p);
//        }

        // novo
//        Consumer<String> consumir = new ImprimirLinha();
//        palavras.forEach(consumir);

        // melhorando codigo com lambdas
        palavras.forEach(System.out::println);
    }
}

//class ImprimirLinha implements Consumer<String>{
//    @Override
//    public void accept(String s) {
//        System.out.println(s);
//    }
//}

// metodo antigo
class ComparadorPorTamanho implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if (s1.length() > s2.length()) return -1;
        if (s1.length() < s2.length()) return 0;

        return 0;
    }
}


