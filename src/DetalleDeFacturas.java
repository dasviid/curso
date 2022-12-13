import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class DetalleDeFacturas {
    public static void main(String[] args) {
        try {


        //obtenemos el nombre de la factura
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el nombre");
        String nombreDeLaFactura = scanner.nextLine();
        System.out.println("nombreDeLaFactura = " + nombreDeLaFactura);
        // obtenemos los precios de los productos
        System.out.println("ingrese el precio del primer producto");
        Double precioProductoUno = scanner.nextDouble();
        System.out.println("ingrese el precio del segundo producto");
        Double precioProductoDos = scanner.nextDouble();
        System.out.println("precioProductoUno = " + precioProductoUno);
        System.out.println("precioProductoDos = " + precioProductoDos);
        //calcular el total
        Double totalSinImpuestos = (precioProductoUno + precioProductoDos);
        // calcular el impuesto
        Double impuesto = totalSinImpuestos * 0.19;
        // calcular la suma del total y el impuesto
        Double totalConImpuesto = impuesto + totalSinImpuestos;
        System.out.println("La factura " + nombreDeLaFactura + " tiene un total bruto = " + totalSinImpuestos + ", con impuesto de " + impuesto + " y el monto despues de impuesto es " + totalConImpuesto);
    } catch (Exception e){
            System.out.println("Me pusiste cualquier verdura asi que cierro el programa" );
            main(args);
            System.exit(  0);
        }
    }
}
