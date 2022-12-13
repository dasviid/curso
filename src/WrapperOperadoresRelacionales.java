public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {


        Integer numA = Integer.valueOf(1000);
        Integer numB = numA;

        System.out.println("numA = " + numA);
        System.out.println("numB = " + numB);
        System.out.println("Son el mismo objeto? " + (numA ==numB));

        System.out.println();

        numB = 1000;
        System.out.println("numA = " + numA);
        System.out.println("numB = " + numB);
        System.out.println("Son el mismo objeto? " + (numA ==numB));

        System.out.println("Tienen el mismo valor? " + numA.equals(numB));
        System.out.println("Tienen el mismo valor ? " + (numA.intValue()== numB.intValue()));


        boolean condicion = numA.intValue() >= numB.intValue();
        System.out.println("condicion = " + condicion);
    }
}
