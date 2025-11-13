import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre de tu factura: ");
        String nombreFactura = scanner.nextLine().toLowerCase();


        double precioProducto1, precioProducto2;
        try {
            System.out.println("Ingresa el producto 1: ");
            precioProducto1 = scanner.nextDouble();

            System.out.println("Ingresa el producto 2: ");
            precioProducto2 = scanner.nextDouble();

            double totalBruto = precioProducto1 + precioProducto2;
            double impuesto = totalBruto * 0.19;
            double totalNeto = totalBruto + impuesto;
            String detalle = "La factura " + nombreFactura + " tiene un total bruto de $" + totalBruto + ", con impuesto de $" + impuesto + " y el monto después de impuestos es de $" + totalNeto;

            System.out.println(detalle);

        } catch (Exception e) {
            System.out.println("Por tarugo tendrás que iniciar de nuevo!");
            main(args);
            System.exit(0);
        }

    }
}
