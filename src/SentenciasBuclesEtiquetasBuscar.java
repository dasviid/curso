

public class SentenciasBuclesEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes trigres tragan trigotrigo en un trigal entrigo";
        String palabra = "trigo";


        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;


        int cantidad = 0;
        buclefrase:
        for (int i = 0; i <= maxFrase; ) {
            int k = i;
            buclepalabra:
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;/**/
                    continue buclefrase;
                }
            }
            i = i + maxPalabra;
            cantidad++;
        }
        System.out.println("Se encontro  " + cantidad + " veces la palabra " + "\"" + palabra + "\"");
    }
}   
