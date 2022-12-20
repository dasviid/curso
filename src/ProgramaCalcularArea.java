import java.util.Scanner;

public class ProgramaCalcularArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio como un numero decimal");
        try {
            double radio = scanner.nextDouble();
            if (radio <= 0) {
                System.err.println("Ingrese un radio valido");
                main(args);
                System.exit(1);
            }
            double area = Math.PI * Math.pow(radio, 2);
            System.out.println("El area calculada es = " + area);
        } catch (Exception e) {
            System.err.println("Ingrese un radio valido");
            main(args);
            System.exit(1);
        }
    }
}