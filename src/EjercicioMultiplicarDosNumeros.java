import java.util.Scanner;

public class EjercicioMultiplicarDosNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a: ");
        int a = scanner.nextInt();

        System.out.println("Ingrese el numero b: ");
        int b = scanner.nextInt();
        int resultado = 0;

        // verificamos los signos de cada uno, si es positivo o negativo
        boolean positivoB = b > -1;
        boolean positivoA = a > -1;

        // calculamos el valor absoluto de a
        int absolutoA = positivoA ? a : -a; // equivalente a Math.abs(a);

        // sumamos tantas veces el valor de b, segun el valor de a.
        for (int i = 0; i < absolutoA; i++) {
            resultado += b;
        }

        // si ambos son negativos o si solo a es negativo damos vuelta el signo
        if ((!positivoA && !positivoB) || !positivoA) {
            resultado = -resultado;
        }

        System.out.println("el resultado es " + resultado);



 /*       Este es el ejercicio como lo fui resolviendo
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.println("Ingrese un numero: ");
        num1 = scanner.nextInt();
        System.out.println("Ingrese un numero: ");
        num2 = scanner.nextInt();

        int sumatoria = 0;

        if (num1 > 0 && num2 > 0 || num1 < 0 && num2 < 0) {
            for (int i = 0; i < num2; i++) {
                sumatoria += num1;
            }
            System.out.println("Multiplicación de " + num1 + "*" + num2 + " = " + sumatoria);

        } else if (num1 == 0 || num2 == 0) {
            System.out.println("Multiplicación de " + num1 + "*" + num2 + " = 0");
        } else {
            System.out.println("num 1 y num2 negativos ");
        }

*/
    }
}
