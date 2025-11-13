import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);    //Se crea la instancia de la clase
        System.out.println("Ingrese un número entero : ");
        //String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;
        try {
            //parseIn es para convertir de string a int   Integer.parseInt(numeroStr);
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);

            //catch (Exception e) //Es una excepcion de manera generica que maneja todo
        } catch (InputMismatchException e) {        // la letra "e" significa de exception
            System.out.println("Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }


        System.out.println("numero Decimal = " + numeroDecimal);
        String resultadoBinario = "numero binario = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "numero octal de = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHexadecimal = "numero hexadecimal de = " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;
        System.out.println(mensaje);
    }
}
