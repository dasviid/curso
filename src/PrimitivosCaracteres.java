public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0041' ;
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("decimal = simbolo " + (decimal == simbolo));
        
        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char retornoCarro = '\r';
        char nuevaLinea = '\n';




        var arroba = '\u0042';
        System.out.println("arroba = " + arroba);
        System.out.println("Char corresponde en byte:"+ retroceso+ tabulador+ espacio + Character.BYTES);
        System.out.println("Char corresponde en bites a= " + Character.SIZE);
        System.out.println("El valor maximo que puede tomar char = " + Character.MAX_VALUE);
        System.out.println("El valor minimo que puede tomar char = " + Character.MIN_VALUE);

    }
}
