

import javax.swing.*;

public class OperadoresAritmetico {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;//==hacerlos por separado
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j));

        int resta = i - j;
        System.out.println("i - j = " + (i - j));

        int div = i / j;
        float div2 = (float) i / j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        if (numero % 2 == 0) {
            System.out.println("Numero es par");
        } else {
            System.out.println("numero es impar");
    }

    }
}

