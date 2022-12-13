import javax.swing.*;

public class ProgramaMultiplicacion {
    public static void main(String[] args) {
        // pido el primer valor, lo almaceno en una variable que es un String y lo transformo en un int
        String numeroA = JOptionPane.showInputDialog(null, "Ingrese el primer numero");
        int numeroIntA = Integer.parseInt(numeroA);
        // pido el primer valor, lo almaceno en una variable que es un String y lo transformo en un int
        String numeroB = JOptionPane.showInputDialog(null, "Ingrese el segundo numero");
        int numeroIntB = Integer.parseInt(numeroB);

        // creo una variable para ir guardando la suma
        int multiplicacion = 0;
        // creo el lazo for para sumar numeroIntA veces el numeroIntB
        for (int i = 0; i < Math.abs(numeroIntA); i++) {
            multiplicacion = multiplicacion + numeroIntB;
        }
        // calculo el valor absoluto de multiplicacion para que sea mas facil trabajar
        multiplicacion = Math.abs(multiplicacion);
        // pongo las restricciones de signo para saber con que signo tiene que terminar multiplicacion
        if ((numeroIntA > 0 && numeroIntB > 0) || (numeroIntA < 0 && numeroIntB < 0)) {
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: ".concat(String.valueOf(multiplicacion)));
        } else {
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: ".concat(String.valueOf(-multiplicacion)));
        }
    }
}
