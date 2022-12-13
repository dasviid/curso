public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "David";

        System.out.println("Largo del nombre = " + nombre.length());
        System.out.println("Nombre en mayusculas = " + nombre.toUpperCase());
        System.out.println("Nombre en minusculas = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"David\") = " + nombre.equals("David"));
        System.out.println("nombre.equals(\"david\") = " + nombre.equals("david"));
        System.out.println("equalsIgnoreCase(\"david\") = " + nombre.equalsIgnoreCase("david"));
        System.out.println("nombre.compareTo(\"David\") = " + nombre.compareTo("David"));
        System.out.println("nombre.compareTo(\"Nisman\") = " + nombre.compareTo("Nisman"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        //System.out.println("nombre.charAt(10) = " + nombre.charAt(10));
        
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(0) = " + nombre.substring(nombre.length()-1));

        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.replace(\"a\",\"2\") = " + trabalengua.replace("a","2"));
        System.out.println("trabalengua.indexOf(\"a\") = " + trabalengua.indexOf("a"));
        System.out.println("trabalengua.lastIndexOf(a) = " + trabalengua.lastIndexOf("lenguas"));
        System.out.println("trabalengua.startsWith(\"tra\") = " + trabalengua.startsWith("tra"));
        System.out.println("trabalengua.endsWith(\"guas\") = " + trabalengua.endsWith("guas"));
        System.out.println(" trabalengua  " );
        System.out.println("  trabalenguas ".trim());

    }
}

