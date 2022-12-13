public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + (numeroInt+20));

    String realString = "3.5";

            double realDouble= Double.parseDouble(realString);
        System.out.println("realDouble = " + (realDouble*2));

    String logicoStr    =   "false";

    boolean realBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("realBoolean = " + realBoolean);


        int otroNumeroNumeroInt = 3;
        System.out.println("otroNumeroNumeroInt = " + otroNumeroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroReal = 5.5;
        System.out.println("otroReal = " + otroReal);

        String otroRealStr  =   Double.toString(otroReal);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr  = String.valueOf(1.23f);
        System.out.println("otroRealStr = " + otroRealStr);

        int i=100000;
        short   s   = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);


    }
}
