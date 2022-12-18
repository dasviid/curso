import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramaEdad {
    public static void main(String[] args) {

        // utilizo la clase scanner para que el usuario pueda ingresar la fecha de nacimiento
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una fecha con formato \"yyyy-MM-dd\"");
        // le doy el formato que necesito a la fecha que ingreso el usuario
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            double milisegundosEnUnDia = 86400000;
            Date fechaNacimiento = format.parse(scanner.nextLine());
            Date fechaActual = new Date();
            if (fechaNacimiento.after(fechaActual)) {
                System.out.println("Esta persona todavia no nacio");
                main(args);
                System.exit(0);
            }
            double edad = ((fechaActual.getTime() - fechaNacimiento.getTime()) / (milisegundosEnUnDia * 365));
            System.out.println("Edad de la persona = " + edad);
        } catch (ParseException e) {
            main(args);
            System.exit(0);
        }
    }
}

