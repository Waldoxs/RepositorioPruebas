import java.util.Scanner;

public class EjercicioSistemaNotasAlumnos {
    public static void main(String[] args) {
        /*
        Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double). Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, ademas mostrar el promedio total.

        Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).

        Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
         */

        Scanner scanner = new Scanner(System.in);

        double nota;
        double promedioTotal = 0;
        int numeroTotalNotas = 20;
        double notasMayores5 = 0;
        double notasMenor4= 0;
        int notas1 = 0;
        int notas4 = 0;
        int notas5 = 0;

        for (int i = 0; i < numeroTotalNotas; i++) {
            System.out.println("[" + (i + 1) + "] Ingrese la nota: ");
            nota = scanner.nextDouble();

            if (nota >= 1.0 && nota <= 7) {
                promedioTotal += nota;
                if (nota > 5.0) {
                    notasMayores5 += nota;
                    notas5++;

                } else if (nota < 4.0) {
                    notasMenor4 += nota;
                    notas4++;

                    if (nota == 1) {
                        notas1++;
                    }

                }

            } else if (nota <= 0 || nota > 7) {
                System.out.println("Error finalizando el programa!");
                System.exit(1);
                break;

            }

        }
        System.out.println("Promedio total  de las notas > 5 : " + (notasMayores5 / notas5));
        System.out.println("contador >5 = " + notas5);
        System.out.println("Promedio total  de las notas < 4 : " + (notasMenor4 / notas4));
        System.out.println("contador < 4 = " + notas4);
        System.out.println("Cantidad de notas con valor 1: " + notas1);

        System.out.println("Promedio total  de las notas = " + (promedioTotal / numeroTotalNotas));


        /*
        double nota; // la nota a ingresar
        int contNotas1 = 0; // el contador de notas 1
        int contNotasMayoresA5 = 0; // contador de notas mayores a 5
        int contNotasMenoresA4 = 0; // contador de notas menores a 4
        double sumaNotasMayoresA5 = 0; // suma de notas mayores a 5
        double sumaNotasMenoresA4 = 0; // suma de notas menores a 4
        double sumaTotal = 0; // suma total de notas

        double promedioNotasMayoresA5, promedioNotasMenoresA4; // los promedios de notas mayores a 5 y menores a 4

        boolean error = false;

        for (int i = 0; i < 20; i++) {
            System.out.println("Introduce una nota (entre 1 y 7) N" + (i + 1) + ": ");
            nota = scanner.nextDouble();

            if (nota == 0) {
                error = true;
                break;
            }

            if (nota == 1) {
                contNotas1++;
            } else {
                if (nota > 5) {
                    contNotasMayoresA5++;
                    sumaNotasMayoresA5 += nota;
                } else if (nota < 4) {
                    contNotasMenoresA4++;
                    sumaNotasMenoresA4 += nota;
                }
            }
            sumaTotal += nota;
        }
        if (error) {
            System.err.println("Error: No pueden haber notas con valor 0, ha finalizado la ejecución del programa.");
            System.exit(1);
        }
        // mostramos la cantidad de notas 1
        System.out.println("El número de notas 1 es de: " + contNotas1);
        //trabajamos con las notas superiores a 5
        if (contNotasMayoresA5 == 0) {
            System.out.println("No se puede calcular el promedio de notas sobre 5");
        } else {
            promedioNotasMayoresA5 = sumaNotasMayoresA5 / contNotasMayoresA5;
            System.out.println("Promedio de notas mayores a 5: " + promedioNotasMayoresA5);
        }

        // trabajamos con las notas inferiores a 4
        if (contNotasMenoresA4 == 0) {
            System.out.println("No se puede calcular el promedio de notas bajo 4");
        } else {
            promedioNotasMenoresA4 = sumaNotasMenoresA4 / contNotasMenoresA4;
            System.out.println("Promedio de notas menores a 3: " + promedioNotasMenoresA4);
        }

        // promedio total de las notas
        double promedioTotalNotas = sumaTotal / 20;
        System.out.println("Promedio total de notas: " + promedioTotalNotas);
         */
    }
}
