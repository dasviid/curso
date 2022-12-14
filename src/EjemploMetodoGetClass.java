import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola luis";

        Class strClass = texto.getClass();
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackage());
        System.out.println("strClass.getName() = " + strClass);

        for (Method metodo : strClass.getMethods()) {
            System.out.println("metodo = " + metodo.getName());
        }
        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass());
        System.out.println("objClass = " + objClass);

        for (Method metodo : objClass.getMethods()) {
            System.out.println("metodo = " + metodo.getName());
        }
    }
}
