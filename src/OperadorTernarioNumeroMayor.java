
import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numA = s.nextInt();

        System.out.println("Ingrese un segundo numero");
        int numB = s.nextInt();

        System.out.println("Ingrese un tercer numero");
        int numC = s.nextInt();

        System.out.println("Ingrese un cuarto numero");
        int numD = s.nextInt();

        max = (numA > numB) ? numA : numB;
        max = (max > numC) ? max : numC;
        max = (max > numD) ? max: numD;

        System.out.println("numA = " + numA);
        System.out.println("numB = " + numB);
        System.out.println("numC = " + numC);
        System.out.println("numD = " + numD);
        System.out.println("El numero mayor es = " + max);


    }
}
