import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        //calendario.set(1928,Calendar.SEPTEMBER,25,26, 20, 25);
        calendario.set(Calendar.YEAR, 2022);
        calendario.set(Calendar.MONTH, Calendar.MARCH);
        // calendario.set(Calendar.DAY_OF_MONTH, 25);
        calendario.set(Calendar.HOUR, 10);
        calendario.set(Calendar.AM_PM, Calendar.PM);

        calendario.set(Calendar.HOUR_OF_DAY, 22);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 16);
        calendario.set(Calendar.MILLISECOND, 381);


        Date fecha = calendario.getTime();
        System.out.println("Fecha sin formato = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("Fecha sin formato = " + fechaConFormato);
    }
}
