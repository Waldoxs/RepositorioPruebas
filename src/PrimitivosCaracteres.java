public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';        //basado en los caracteres UNICODE
        // en windows poner "Mapa de caracteres" y sale su código de c/u de los caracteres
        char decimal = 64;      //casado en el valor de HTML
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("decimal = caracter = simbolo: " + ((decimal == caracter) && (simbolo == caracter)));

        // También se puede usar un var para definir un char
        var caracter1 = '\u0040';
        System.out.println("caracter1 = " + caracter1 + "\n");

        char espacio = '\u0020'; //El space se representa en UNICODE como \u0020
        char retroceso = '\b'; //back space, retroceder un espacio quitando el simbolo anterior
        char tabulador = '\t';
        char nuevaLinea = '\n';     //Salto de linea
        char retornoCarro = '\r';   //Elimina lo anterior de la misma linea
//        System.out.println("char corresponde a byte:" + espacio + Character.BYTES);
//        System.out.println("char corresponde a byte:" + retroceso + retroceso + Character.BYTES);
//        System.out.println("char corresponde a \tbyte:" + tabulador + Character.BYTES);

//        System.out.println("char corresponde a byte:" + retornoCarro + Character.BYTES);
//        System.out.println("char corresponde a byte:" + nuevaLinea + retornoCarro + Character.BYTES);

//        System.out.println("char corresponde a byte:" + System.getProperty("line.separator") + Character.BYTES);
        System.out.println("char corresponde a byte:" + System.lineSeparator() + Character.BYTES);
        System.out.println("char correspondiente en bites = " + Character.SIZE);
        System.out.println("Máximo valor para char = " + Character.MAX_VALUE);
        System.out.println("Mínimo valor para char = " + Character.MIN_VALUE);


    }
}
