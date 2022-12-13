public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion Java";
        String profesor = "Andres Guzman";

        String resultado = curso.concat(profesor);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

       String resultado2 = curso.transform(c ->{
        return c + " con " + profesor;
        });
        System.out.println("resultado2 = " + resultado2);
        String resultadoNuevo = resultado.replace("a","A");
        System.out.println("resultadoNuevo = " + resultadoNuevo);
    }
}
