package weekend_1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateMain {
    public static void main(String[]args)
    {
        final Date now = new Date();
        final SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
        final SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        final SimpleDateFormat format3 = new SimpleDateFormat("yyyy-dd",Locale.KOREA);
        System.out.println(format.format(now));
        System.out.println(format2.format(now));
        System.out.println(format3.format(now));
    }
}
