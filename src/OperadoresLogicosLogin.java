

import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

       /* String[] usernames = new String[3];
        String[] paswords = new String[3];
        usernames[0] = "david";
        paswords[0] = "12345";
        usernames[1] = "admin";
        paswords[1] = "12345";
        usernames[2] = "pepe";
        paswords[2] = "12345"; */

        String[] usernames = {"david","admin","pepe"};
        String[] paswords = {"12345","12345","12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario");
        String usuario = scanner.nextLine();

        System.out.println("Ingrese la contraseña");
        String contraseña = scanner.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){
            esAutenticado = (( usernames[i].equals(usuario) && paswords[i].equals(contraseña)))? true : esAutenticado;

         /* if( usernames[i].equals(usuario) && paswords[i].equals(contraseña)) {
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado == true ? "Bienvenido usuario ".concat(usuario) :
                "Usuario o contraseña incorrecta \n El sistema requierre autenticacion";
        System.out.println( mensaje);
        /*if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(usuario));
        }else {
            System.out.println("Usuario o contraseña incorrectos");
            System.out.println("Lo siento, requiere autenticazion");
        } */

    }
}
