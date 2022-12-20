public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5,1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5,1.2);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);

        long    enteroPi = Math.round(Math.PI);
        System.out.println("enteroPi = " + enteroPi);

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potnecia = Math.pow(10,3);
        System.out.println("potnecia = " + potnecia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

    double grados = Math.toDegrees(1.57);
        System.out.println("Convertir de radianes a grados = " + Math.round(grados));

        double radianes = Math.toRadians(90.00);
        System.out.println("Converitr de grados a radianes = " + radianes);

        System.out.println("sin(90) = " + Math.sin(radianes));
        System.out.println("cos(90) = " + Math.round(Math.cos(radianes)));

        radianes = Math.toRadians(180);
        System.out.println("cos(180) = " + Math.round(Math.cos(radianes)));
    }
}
