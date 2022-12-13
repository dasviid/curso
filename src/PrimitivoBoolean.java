public class PrimitivoBoolean {
    public static void main(String[] args) {
        boolean datoLogico = true;
        boolean datoLogico2 = false;
        System.out.println("datoLogico = " + datoLogico);
        System.out.println("datoLogico2 = " + datoLogico2);

        double  d= 987.62e-2; //9.8762
        System.out.println("d = " + d);

        float f =123e2F; //12300
        System.out.println("f = " + f);

        datoLogico = d<f;
        System.out.println("datologico = " + datoLogico);

        boolean esIgual = (3-2==2);
        System.out.println("esIgual = " + esIgual);


    }
}
