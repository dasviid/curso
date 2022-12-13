public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 2.12E3F; //2120F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("tipo float corresponde en byte a = " + Float.BYTES);
        System.out.println("tipo float corresponde en bites a = " + Float.SIZE);
        System.out.println(" maximo valor para float = " + Float.MAX_VALUE);
        System.out.println(" minimo valor para float = " + Float.MIN_VALUE);

        double realDouble   = 2.12E3F; //2120F;
        System.out.println("realDouble  = " + realDouble);
        System.out.println("tipo double corresponde en byte a = " + Double.BYTES);
        System.out.println("tipo double corresponde en bites a = " + Double.SIZE);
        System.out.println("maximo valor para float = " + Double.MAX_VALUE);
        System.out.println("minimo valor para float = " + Double.MIN_VALUE);

        var varFlotante = 3.14;
        System.out.println("varFlotante = " + varFlotante);

    }
}
