import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        // formatando data LocalDate
        LocalDate olimpiadasRio = LocalDate.of(2025, Month.MARCH,5);

        int anos = olimpiadasRio.getYear() - hoje.getYear();

        System.out.println("qnts anos falta pra olimpidas = " + anos);


        Period periodo = Period.between(hoje,olimpiadasRio);
        System.out.println(periodo.getDays());


        LocalDate proximasOlimpidasRio = olimpiadasRio.plusYears(4);

        System.out.println(proximasOlimpidasRio);


        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String valorFormatado = proximasOlimpidasRio.format(formatador);
        System.out.println("Data Formatado "+valorFormatado);


        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        DateTimeFormatter formatadorMesAno = DateTimeFormatter.ofPattern("MM--yyyy");


        // LocalDateTime tei HH:MM:SS
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        YearMonth mesEAnoEspecifico = YearMonth.now();
        System.out.println(mesEAnoEspecifico.format(formatadorMesAno));
    }
}
