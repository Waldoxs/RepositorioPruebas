public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java";     //Esto es un objeto de referencia
        String curso2 = new String("Programación Java"); //Crea un objeto dentro del constructor

        boolean esIgual = curso == curso2;      //Son dos instancias diferentes porque una es implicita y la otra explicita
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equals(curso2); //Compara el valor de string sin embargo se compara que este sea identico
        //esIgual =curso.equalsIgnoreCase(curso2); //Compara el valor sin considerar mayus o minusculas
        System.out.println("curso.equals(curso2) = " + esIgual);
        
        String curso3 = "Programación Java";
        esIgual = curso == curso3;      //No se recomiendar hacer las comparación con ==
        System.out.println("curso == curso3 = " + esIgual);
    }
}
