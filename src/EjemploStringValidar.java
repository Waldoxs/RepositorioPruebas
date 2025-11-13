public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;
        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);
//        if (!esNulo) {        //Si es nulo o podria ser esNulo == false
//            System.out.println(curso.toUpperCase());
//        }

        if (esNulo) {
            curso = " "; //Programación Java
        }
        //Para validar que cualquier string tenga un tamaño es:
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty(); //El .isEmply evalua justo a legth para saber si es 0
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();     //Valida si es nulo el string, asi como valida si es diferente de .isEmpty asi como valida que tenga contenido diferente de un space en blanco
        System.out.println("esBlanco = " + esBlanco);

        //if (!esVacio2) { //Tambien puede ser if(curso.legth() > 0)
        if (!esBlanco) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso de ".concat(curso));
            //El metodo concat solo se usa cuando el objeto String tiene una estancia y no es nulo
        }
/*
Por lo tanto, la manera más estricta y segura de evaluar es con: .isBlank esta aplicado el metodo desde Java 11
 */

    }
}
