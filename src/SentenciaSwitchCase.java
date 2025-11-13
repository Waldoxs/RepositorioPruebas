import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        //Es la seleccion por interruptor
        //Soporta int, char, short, String

        char num = 'z';
        switch (num) {
            case 0:
                System.out.println("Caso 0");
                break;

            case 1:
                System.out.println("Caso 1");
                break;

            case 2:
                System.out.println("Caso 2");
                break;

            case 3:
                System.out.println("Caso 3");
                break;

            case 'a':
                System.out.println("Caso a");
                break;

            default:
                System.out.println("Caracter o numero desconocido ");
        }

        String nombre = "Oswaldo";
        switch (nombre) {
            case "Piojoso":
                System.out.println("Caso 0");
                break;

            case "Oswao":
                System.out.println("Caso 1");
                break;

            case "Oswaldo":
                System.out.println("Caso 2");
                break;

            case "jiuan":
                System.out.println("Caso 3");
                break;

            default:
                System.out.println("Caracter o numero desconocido ");
        }

/// ///////////////////////////////////
        //Es muy importante siempre usar el break;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un mes de 1 al 12:");

        int mes = scanner.nextInt();
        String nombreMes = null;

        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;

            default:
                System.out.println("Carácter o número desconocido ");
        }
        System.out.println("nombreMes = " + nombreMes);

    }
}
