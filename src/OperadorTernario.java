

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 5 == 7 ? "Si es verdadero" : "Si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su nota de matematicas");
        matematicas =  s.nextDouble();

        System.out.println("Ingrese su nota de ciencias");
        ciencias =  s.nextDouble();

        System.out.println("Ingrese su nota de historia");
        historia =  s.nextDouble();


        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);


        estado = promedio >= 5.49 ? "Esta aprobado" : "Esta desaprobado";
        System.out.println("estado = " + estado);
    }
}
