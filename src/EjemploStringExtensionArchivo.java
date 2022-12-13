public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo  =   "alguna_imagen.js";
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo = " + archivo);
        int posicionPunto = archivo.lastIndexOf(".");
        System.out.println("Tipo de archivo = " + archivo.substring(posicionPunto+1));

    }
}
