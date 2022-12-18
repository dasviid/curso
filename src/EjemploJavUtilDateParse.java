import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavUtilDateParse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una fecha con formato \"yyyy-MM-dd\"");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date fecha = format.parse(scanner.nextLine());
            System.out.println("fecha = " + fecha);
            System.out.println("format.format(fecha) = " + format.format(fecha));

            Date fecha2 = new Date();
            if (fecha.after(fecha2)) {
                System.out.println("Fecha del usuario es despues que fecha actual");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha del usuario es antes que fecha actual");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Las fechas son iguales");
            }


            if (fecha.compareTo(fecha2) > 0) {
                System.out.println("Fecha del usuario es despues que fecha actual");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("Fecha del usuario es antes que fecha actual");

            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("Las fechas son iguales");
            }


        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
