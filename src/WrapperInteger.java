public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32123;
        Integer intObjetoB = Integer.valueOf(intPrimitivo);
        Integer intObjeto = Integer.valueOf(32768);
        Integer intObjetoA = 32768;

        int num = intObjetoA;
        int numA = intObjeto.intValue();

        String valorTvLcd = "67000";
        Integer valorNumerico = Integer.valueOf(valorTvLcd);
        System.out.println("valorNumerico = " + valorNumerico);

        Short shorObjeto = intObjetoA.shortValue();
        System.out.println("shorObjeto = " + shorObjeto);

        Byte byteObjeto = intObjetoA.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjetoB.longValue();
        System.out.println("longObjeto = " + longObjeto);
    }
}
