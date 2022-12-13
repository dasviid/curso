import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // imprimo un cartel para que me ingresen un numero y lo guardo en una variable
        System.out.println("Ingrese un numero");
        int numeroA = scanner.nextInt();

        // imprimo un cartel para que me ingresen un numero y lo guardo en una variable
        System.out.println("Ingrese otro numero");
        int numeroB = scanner.nextInt();


        //comparo las dos variables para ver cual alaceno como valor maximo
        int max = (numeroA > numeroB) ? numeroA : numeroB;

        // comparo una de las variables con el valor maximo, asi puedo asignar a la otra variable el valor maximo
        int min = (numeroA == max) ? numeroB : numeroA;

        //imprimo los valores en orden decreciente
        System.out.println(max + " " + min);
    }
}