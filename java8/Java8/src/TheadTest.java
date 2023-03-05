public class TheadTest {

    public static void main(String[] args) {


//        antigo
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Executando um Runnable");
//            }
//        }).start();

        // novo lambad faz msm recurso de cima
        new Thread(()-> System.out.println("Executando um Runnable")
        ).start();
    }
}
