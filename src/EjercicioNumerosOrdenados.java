import java.util.Scanner;

public class EjercicioNumerosOrdenados {
    public static void main(String[] args) {
        //En este ejercicio se deben ordenar los numero de mayor a menor valor, ingresando el valor desde la terminal

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        short num1 = scanner.nextShort();

        System.out.println("Ingresa otro número: ");
        short num2 = scanner.nextShort();

//        short resultadoMayor = (num1 > num2)? num1: num2;
//        short resultadoMenor = (num1 > num2)? num2: num1;
//
//        String numsOrdenados = "Número mayor: ".concat(String.valueOf(resultadoMayor).concat("\nNúmero menor: ").concat(String.valueOf(resultadoMenor)));

        String resultado = (num1 > num2) ? num1 + " y " + num2 : num2 + " y " + num1;

        System.out.println(resultado);
    }
}
