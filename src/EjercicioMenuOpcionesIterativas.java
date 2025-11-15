import java.util.Scanner;

public class EjercicioMenuOpcionesIterativas {
    public static void main(String[] args) {
        /*
        Tarea: Menu de opciones iterativo
        Menú de opciones iterativo y con una opción para salir del programa
        */
        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("[1] Actualizar\n[2] Eliminar\n[3] Agregar\n[4]Listar\n[5] Salir");
            System.out.println("Seleccione opción: ");
            menu = scanner.nextInt();

        } while (menu < 1 || menu > 5);

        switch (menu) {
            case 1:
                System.out.println("Usuario actualizado correctamente");
                break;
            case 2:
                System.out.println("Usuario eliminado correctamente");
                break;
            case 3:
                System.out.println("Usuario agregado con éxito");
                break;
            case 4:
                System.out.println("Listado de usuarios");
                break;
            case 5:
                System.out.println("Haz salido con exito!");
                break;
        }

    }
}
