public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";     //Esto es un objeto de referencia
        String profesor = "Andrés Guzmán";

        String resultado = curso.concat(profesor);  //Se crea un nuevo objeto (instancia)

        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        //Se modifica el valor de curso con .transform
        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });

        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a","A");
        System.out.println("resultado = " + resultado3);
    }
}
