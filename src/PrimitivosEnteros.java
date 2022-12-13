public class PrimitivosEnteros {
    public static void main(String[] args) {

        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a = " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a = " + Byte.SIZE);
        System.out.println("valor maximo de un byte "+Byte.MAX_VALUE);
        System.out.println("valor minimo de un byte " +Byte.MIN_VALUE);

        System.out.println(" ");
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a = " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a = " + Short.SIZE);
        System.out.println("valor maximo de un byte "+Short.MAX_VALUE);
        System.out.println("valor minimo de un byte " +Short.MIN_VALUE);

        System.out.println(" ");
        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a = " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a = " + Integer.SIZE);
        System.out.println("valor maximo de un byte "+ Integer.MAX_VALUE);
        System.out.println("valor minimo de un byte " +Integer.MIN_VALUE);

        System.out.println(" ");
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a = " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a = " + Long.SIZE);
        System.out.println("valor maximo de un byte "+ Long.MAX_VALUE);
        System.out.println("valor minimo de un byte " +Long.MIN_VALUE);

        System.out.println(" ");
        float numeroFloat = 9223372036854775817F;
        System.out.println("numeroFloat= " + numeroFloat);
        System.out.println("tipo float corresponde en byte a = " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a = " + Float.SIZE);
        System.out.println("valor maximo de un byte "+ Float.MAX_VALUE);
        System.out.println("valor minimo de un byte " +Float.MIN_VALUE);

        var numeroVar = 9223372036854775818D;
    }
}
