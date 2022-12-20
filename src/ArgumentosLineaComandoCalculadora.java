public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Ya hiciste cagadas, ingresa bien las cosas");
            System.exit(-1);
        }

        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.00;
        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);

        } catch (Exception e) {
            System.err.println("Escribi numeros pelotudo");
        }

        switch (operacion) {
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multiplicacion":
                resultado = a * b;
                break;
            case "div":
                if (b == 0) {

                    System.out.println("NO SE PUEDE DIVIDIR POR 0 PERKIN");
                    System.exit(-1);
                }
                resultado = (double) a / b;
                break;
            default:
                System.err.println("Defina bien la operacion");
                System.exit(-1);
        }
        System.out.println("resultado = " + resultado);
    }
}
