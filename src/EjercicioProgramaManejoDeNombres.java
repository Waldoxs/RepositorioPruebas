import java.util.Scanner;

public class EjercicioProgramaManejoDeNombres {
    public static void main(String[] args) {
        /*
        La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es

Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

N.es_A.ia_E.pe
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre de tu mamá: ");
        String nombreMama = scanner.nextLine();
        System.out.println("Nombre de tu papá: ");
        String nombrePapa = scanner.nextLine();
        System.out.println("Nombre de tu hermano: ");
        String nombreHermano = scanner.nextLine();

        int l = nombreMama.length();
        String nombreCompuestoMama = nombreMama.toUpperCase().charAt(1) + "." + nombreMama.substring(l - 2);
        l = nombrePapa.length();
        String nombreCompuestoPapa = nombrePapa.toUpperCase().charAt(1) + "." + nombrePapa.substring(l - 2);
        l = nombreHermano.length();
        String nombreCompuestoHermano = nombreHermano.toUpperCase().charAt(1) + "." + nombreHermano.substring(l - 2);
        String resultado = nombreCompuestoMama + "_" + nombreCompuestoPapa + "_" + nombreCompuestoHermano;
        System.out.println(resultado);
    }
}
