import java.util.Map;

public class EjemplosVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String,String> varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema = " + varEnv);

        System.out.println("Listando variables de entorno");

        for (String key: varEnv.keySet()){
            System.out.println(key+" => "+ varEnv.get(key));
        }

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);

        String path = System.getenv("Path");
        System.out.println("path = " + path);

        String path2 = varEnv.get("Path");
        System.out.println("path = " + path2);

        String saludar = varEnv.get("SALUDAR_HOLA");
        System.out.println("saludar = " + saludar);

        String saludar2 = System.getenv("SALUDAR_HOLA");
        System.out.println("saludar = " + saludar2);
    }
}
