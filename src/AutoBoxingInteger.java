public class AutoBoxingInteger {
    public static void main(String[] args) {

        Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int suma = 0;

        for (Integer i = 0; i < enteros.length; i++) {
            if (!(enteros[i] % 2 == 0)) {
                continue;
            }
            suma = suma + enteros[i];
        }
        System.out.println("suma = " + suma);
        suma = 0;
        for (Integer i : enteros) {
            if (i.intValue() % 2 == 0) {
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);
    }
}
