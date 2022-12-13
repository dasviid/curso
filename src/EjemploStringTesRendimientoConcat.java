public class EjemploStringTesRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long    inicio = System.currentTimeMillis();

        for (int i=0; i<100000; i=i + 1){
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms 1000 => 4ms 10000 => 124ms 100000 => 5364
            //c = c + a + b + "\n"; // 500 => 17 ms 1000 => 17 ms 10000 => 63ms 100000=>2357
            sb.append(a).append(b); //500 => 0 ms 1000 => 0ms 10000 => 2ms 100000 => 12ms
        }
        long  fin = System.currentTimeMillis();
        System.out.println("c= " + c);
        System.out.println("sb = " + sb.toString());
        System.out.println(fin - inicio);
    }
}
