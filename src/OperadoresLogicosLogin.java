import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        // El uso de arreglos se emplea para contener elementos string, char, primitivos

        /*
        String[] usernames = new String[3];     //Dentro de los corchete va la cantidad de usuarios, porque reserva la cantidad N de espacio en memoria

        String[] passwords = new String[3];

        usernames[0] = "Oswaldo";
        passwords[0] = "123a";

        usernames[1] = "admin";
        passwords[1] = "123a";

        usernames[2] = "pepe";
        passwords[2] = "123a";
        */

        String[] usernames = {"Oswaldo", "admin", "pepe"};

        String[] passwords = {"123a", "a123", "b123"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario: ");
        String u = scanner.next();  //toma el primer valor del string

        System.out.println("Ingrese la contraseña: ");
        String p = scanner.next();  //toma el primer valor del string

        boolean esAutenticado = false;

        /*
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(u) && passwords[i].equals(p)) {   //Comparamos los valores de los strings
                esAutenticado = true;
                break; //Es para detener las iteraciones del for

            }
        }
        */

        //Nota en caso de tener muchos mas usuarios y contrasenas es mas eficiente usar el if junto con el break;

        //solo para ejemplo pero no es eficiente, se usara un ternario
        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;
        }

        String mensaje = esAutenticado? "Bienvenido ".concat(u).concat("!"): "Usuario o contraseña incorrecto.\nLo siento, requiere autenticación";
        System.out.println(mensaje);

        //Lo de aqui ya seria mas privado
        /*
        if (esAutenticado) {

            System.out.println("Bienvenido ".concat(u).concat("!"));
        } else {
            System.out.println("Usuario o contraseña incorrecto");
            System.out.println("Lo siento, requiere autenticación ");
        }
        */
    }
}