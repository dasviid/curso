
import java.util.Scanner;

public class TanqueDeGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los litros de gasolina");
        double nivelGasolina = scanner.nextDouble();

        if (70 == nivelGasolina){
            System.out.println("Estanque lleno");
        } else if (60 < nivelGasolina && 70 > nivelGasolina) {
            System.out.println("Estanque casi lleno");
        } else if (40 < nivelGasolina && 60 > nivelGasolina) {
            System.out.println("Estanque 3/4");
        } else if (35 < nivelGasolina && 40 > nivelGasolina) {
            System.out.println("Medio estanque");
        } else if (20 < nivelGasolina && 35 > nivelGasolina) {
            System.out.println("Suficiente");
        } else if (1 < nivelGasolina && 20 > nivelGasolina) {
            System.out.println("Insuficiente");
        } else {
            System.out.println("El valor ingresado no corresponde a un valor permitido");
        }


    }
}
