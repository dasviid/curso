import java.util.Scanner;

public class ProgramaNumeroMayoores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de valores a comparar");
        int valores = scanner.nextInt();

        int max = 0;
        if (valores < 10){
            System.out.println("Ingrese mas numeros");
            main(args);
            System.exit(  0);
        }else{
            for (int i = 0; valores > i; i++){
                System.out.println("Ingrese el valor "+(i+1)+": ");
                int valor = scanner.nextInt();
                max = (valor>max) ? valor : max;
            }
            System.out.println("El valor maximo es = " + max);
        }
        if(max<10){
            System.out.println("El numero es menor a 10");
        }else {
            System.out.println("El numero es mayoro igual que  10");
        }
    }
}