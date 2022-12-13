public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primeBoolean = num1 > num2; //false
        Boolean objetoBoolean = Boolean.valueOf(primeBoolean);
        Boolean objetoBoolean2 = Boolean.valueOf("false");
        Boolean objetoBoolean3 = true;

        System.out.println("primeBoolean = " + primeBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);

        System.out.println("Comparando dos objetos boolean = " + (objetoBoolean2 == objetoBoolean));
        System.out.println("Comparando dos objetos boolean = " + (objetoBoolean2.equals(objetoBoolean)));
        System.out.println("Comparando dos objetos boolean = " + (objetoBoolean2 == objetoBoolean3));
        System.out.println("Comparando dos objetos boolean = " + (objetoBoolean3 == objetoBoolean));

        boolean primBoolean2 = objetoBoolean2.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);

    }
}
