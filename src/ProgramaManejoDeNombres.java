import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // muestro para que el usuario ingrese el primer nombre
        System.out.println("Ingrese el nombre del primer integrante = " );
        // obtengo el primer nombre
        String nombre1 = scanner.nextLine();
        // obtengo la segunda letra en mayuscula
        String sg1 = nombre1.toUpperCase().substring(1,2);
        // obtengo las ultimas dos letras en minuscula
        String final1 = nombre1.toLowerCase().substring(nombre1.length()-2);
        // creo una variable vacia y concateno lo que fui obtuviendo
        String c = "";
        c = c.concat(sg1).concat(".").concat(final1).concat("_");


        System.out.println("Ingrese el nombre del segundo integrante = " );
        String nombre2 = scanner.nextLine();
        String sg2 = nombre2.toUpperCase().substring(1,2);
        String final2 = nombre2.substring(nombre2.length()-2);
        c = c.concat(sg2).concat(".").concat(final2).concat("_");


        System.out.println("Ingrese el nombre del tercer integrante = " );
        String nombre3 = scanner.nextLine();
        String sg3 = nombre3.toUpperCase().substring(1,2);
        String final3 = nombre3.substring(nombre3.length()-2);
        c = c.concat(sg3).concat(".").concat(final3);

        System.out.println("Respuesta = " + c);

        }
    }

