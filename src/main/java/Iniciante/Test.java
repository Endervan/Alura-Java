package Iniciante;

public class Test {


    public static void main(String[] args) {

//        boolean foiPromovido = true;
//
//        if (foiPromovido) {
//            double salario = 4200.0;
//        } else {
//            double salario = 3800.0;
//        }
//
//        System.out.println(salario);
        double salario = 1000.00;

        if (salario <= 2800.00 ){
            System.out.println("Vc pagara de Importo de renda um total de 7,5% == "+ salario*(7.5/100));
        }else if (salario <=3751.00){
            System.out.println("Vc pagara de Importo de renda um total de 15% == "+ salario*(15/100));
        }else if (salario >=4664.00){
            System.out.println("Vc pagara de Importo de renda um total de 22,5% ==  "+ salario*(22.5/100));
        }


                int mes = 10;

                switch (mes) {
                    case 1:
                        System.out.println("O mês é Janeiro");
                        break;
                    case 2:
                        System.out.println("O mês é Fevereiro");
                        break;
                    case 3:
                        System.out.println("O mês é Março");
                        break;
                    case 4:
                        System.out.println("O mês é Abril");
                        break;
                    case 5:
                        System.out.println("O mês é Maio");
                        break;
                    case 6:
                        System.out.println("O mês é Junho");
                        break;
                    case 7:
                        System.out.println("O mês é Julho");
                        break;
                    case 8:
                        System.out.println("O mês é Agosto");
                        break;
                    case 9:
                        System.out.println("O mês é Setembro");
                        break;
                    case 10:
                        System.out.println("O mês é Outubro");
                        break;
                    case 11:
                        System.out.println("O mês é Novembro");
                        break;
                    case 12:
                        System.out.println("O mês é Dezembro");
                        break;
                    default:
                        System.out.println("Mês inválido");
                        break;
        }
    }
}
