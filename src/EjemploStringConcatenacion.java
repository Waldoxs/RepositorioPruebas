public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";     //Esto es un objeto de referencia
        String profesor = "Andrés Guzmán";
        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        //System.out.println(detalle + numeroA + numeroB); forma incorrecta si vamos a usar operaciones aritmetic
        System.out.println(detalle + (numeroA + numeroB));

        //Se debe considerar la presedencia de operacion y como estas van de izquierda a derecha ejecutandose

        //String detalle2 =  curso.concat(" ".concat(profesor));
        String detalle2 =  curso.concat(" con ").concat(profesor);      //Forma mas eficiente de concatenar
        System.out.println("detalle2 = " + detalle2);
    }
}
