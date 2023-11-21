package datas;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class operacoesComDatas {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int minuntes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);
        System.out.println("Pegando so os MInuntos " + minuntes);
        System.out.println("Pegando so os Mes " + month);

    }
}
