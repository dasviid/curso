public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10;

        System.out.println("iniciamos el metodo main con i = " + i);
        test(i);
        System.out.println("finaliza el metodo test i (se mantiene igual) = " + i);
    }

    public static void test(int i) {
        System.out.println("iniciamos el metodo test = " + i);
        i = 35;
        System.out.println("finaliza el metodo test  = " + i);
    }
}
