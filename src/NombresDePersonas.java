import javax.swing.*;

public class NombresDePersonas {
    public static void main(String[] args) {

        // Solicito que ingresen los tres nombres
        String nombreA    = JOptionPane.showInputDialog(null,"Ingrese un nombre completo");
        String nombreB   = JOptionPane.showInputDialog(null,"Ingrese un segundo nombre nombre completo");
        String nombreC    = JOptionPane.showInputDialog(null,"Ingrese un tercer nombre completo");

        // Creo tres arreglos para guardar el nombre y el apellido por separados
        String[] partsA = nombreA.split(" ");
        String[] partsB = nombreB.split(" ");
        String[] partsC = nombreC.split(" ");

        // Comparo el largo del primer nombre y el segundo nombre y lo guardo en una variable que cree "max"
        String max = partsA[0].length() > partsB[0].length() ? nombreA : nombreB;
        // Creo un nuevo arreglo para separar el nombre que quedo en la variable max y poder seguir comparandolo
        String[] partsMax  = max.split(" ");
        // Comparo el largo del nombre que quedo en la variable max y el nombre que faltaba.
        max = partsMax[0].length() > partsC[0].length() ? max : nombreC;
        // Imprimo el resultado
        System.out.println("El nombre mas largo es  = " + max);
    }
}
