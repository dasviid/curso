import javax.swing.*;

public class SistemasNumeros {
    public static void main(String[] args) {

        String numeroStr    = JOptionPane.showInputDialog(null,"Ingrese un numero entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
           String error = "El elemento ingresado no es un numero entero";
            JOptionPane.showMessageDialog(null,error );
            main(args);
            System.exit(  0);

        }
        System.out.println("numeroDecimal es = " + numeroDecimal);

        String resultadoBinario   =   "numero binario de = " + numeroDecimal+" =  " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);


        int numeroBinario =0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de   " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);

        int numeroOctal = 036;
        System.out.println("numeroOctal  " + numeroOctal);

        String resultadoHexadecimal = "numero hexadecimal de " + numeroDecimal+ " = " +Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);

        int numeroHex   =  0x1e;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
                mensaje += "\n"+ resultadoOctal ;
                mensaje += "\n"+ resultadoHexadecimal;
        JOptionPane.showMessageDialog(null,mensaje );

    }
}
