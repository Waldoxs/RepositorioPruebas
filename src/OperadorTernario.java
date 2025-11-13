import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //El OpTernario es -->    variable = condicion ? si es verdadero : si es falso;

        String variable = 7 == 5 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nota en matemáticas: ");
        matematicas = scanner.nextDouble();

        System.out.println("Nota en ciencias: ");
        ciencias = scanner.nextDouble();

        System.out.println("Nota en historia: ");
        historia = scanner.nextDouble();

        promedio = (matematicas + historia + ciencias) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.95 ? "Aprobado" : "Reprobado";
        System.out.println("estado = " + estado);

//        if (promedio >= 5.95) {
//            estado = "Aprobado";
//        } else {
//            estado = "Reprobado";
//        }
//        System.out.println("estado = " + estado);



    }
}
