import java.util.Scanner;

public class ProgramaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // creo una variable donde voy a ir guardando la suma de las notas
        double notas = 0;
        // creo una variable donde voy a ir guardando la suma de las notas mayores a 5 y otra la cantidad de veces que paso eso
        double notasMayorACinco = 0;
        double contadorNotasMayorACinco = 0;
        // creo una variable donde voy a ir guardando la suma de las notas menores a 4 y otra que guarde la cantidad de veces que paso eso
        double notasMenorACuatro = 0;
        double contadorNotasMenorACuatro = 0;
        // creo una variable donde voy a ir guardando la cantidad de notas igual a 1
        double notasIgualAUno = 0;

        // uso el lazo for para iterar y obtener todas las notas
        for (int i = 0; i < 20; i++){
            System.out.println("Ingrese la nota "+(i+1)+" entre 1-7");
            // guardo las notas en una nueva variable para chequearla
            double nuevaNota = scanner.nextDouble();
            // finaliza el programa si una de las notas es 0
            if (nuevaNota == 0){
                System.out.println("Error, el programa se finaliza");
                return;
            }
            // voy sumando todas las notas mayores a 5 y la cantidad de notas que cumplen la condicion
            if (nuevaNota > 5){
                notasMayorACinco = notasMayorACinco + nuevaNota;
                contadorNotasMayorACinco++;
            }
            // voy sumando todas las notas menores a 4 y la cantidad notas que cumplen la condicion
            if (nuevaNota < 4){
                notasMenorACuatro = notasMenorACuatro + nuevaNota;
                contadorNotasMenorACuatro++;
            }
            // voy sumando la cantidad de veces que aparece una nota igual 1
            if (nuevaNota == 1){
                notasIgualAUno++;
            }
            // sumo la nota que acabo de ingresar con las anteriores
        notas = nuevaNota + notas;
        }
        double promedio = notas/20;
        System.out.println("Promedio general = " + promedio);
        double promedioMayorACinco = notasMayorACinco/contadorNotasMayorACinco;
        System.out.println("Promedio de las notas mayores a 5 = "+ promedioMayorACinco);
        double promedioMenorACuatro = notasMenorACuatro/contadorNotasMenorACuatro;
        System.out.println("Promedio de las notas menores a 4 = "+promedioMenorACuatro);
        System.out.println("La cantidad de notas = 1 fueron: "+notasIgualAUno);
    }
}
