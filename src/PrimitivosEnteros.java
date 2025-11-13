public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde al tamano de byte a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde al tamano de bites a " + Byte.SIZE);
        System.out.println("El valor máximo de un byte " + Byte.MAX_VALUE);
        System.out.println("El valor mínimo de un byte " + Byte.MIN_VALUE + "\n");

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde al tamano de byte a " + Short.BYTES);
        System.out.println("Tipo short corresponde al tamano de bites a " + Short.SIZE);
        System.out.println("El valor máximo de un short " + Short.MAX_VALUE);
        System.out.println("El valor mínimo de un short " + Short.MIN_VALUE + "\n");

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde al tamano de byte a " + Integer.BYTES);
        System.out.println("Tipo int corresponde al tamano de bites a " + Integer.SIZE);
        System.out.println("El valor máximo de un int " + Integer.MAX_VALUE);
        System.out.println("El valor mínimo de un int " + Integer.MIN_VALUE + "\n");

        long numeroLong = 9223372036854775807L;  //Se debe definir con una "L" que el valor es de tipo long
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde al tamano de byte a " + Long.BYTES);
        System.out.println("Tipo long corresponde al tamano de bites a " + Long.SIZE);
        System.out.println("El valor máximo de un long " + Long.MAX_VALUE);
        System.out.println("El valor mínimo de un long " + Long.MIN_VALUE + "\n");

        var numeroVar = 127;    //Esta carácteristica no se soporta en java 8, solo soporta desde java jdk 10
        // "var" siempre que se defina sera un entero es decir un Integer (int)
        // De esta misma manera se debe definir si sera long o float con las letras al final "L" "F" "D"

    }
}
