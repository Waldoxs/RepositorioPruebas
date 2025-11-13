public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Oswaldo";  //La posicion de los caracteres en string va desde 0 a n
        //   0123456  ; Total de posiciones = 7
        //Los metodos mas importantes se veran aqui
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toUpperCase() = " + nombre.toLowerCase());

        //Comparacion pero a nivel de valor de string 
        System.out.println("nombre.equals(\"Oswaldo\") = " + nombre.equals("Oswaldo"));
        System.out.println("nombre.equals(\"oswaldo\") = " + nombre.equals("oswaldo"));
        System.out.println("nombre.equalsIgnoreCase(\"oswaldo\") = " + nombre.equalsIgnoreCase("oswaldo"));

        //La comparacion sera en orden numero del UNICODE con .compareTo("");, conocido como orden lexicográfico
        System.out.println("nombre.compareTo(\"Oswaldo\") = " + nombre.compareTo("Oswaldo"));
        System.out.println("nombre.compareTo(\"Oswaldo\") = " + nombre.compareTo("Andres"));

        //Es como convertir un string en caracteres
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0)); //Muestra de acuerdo al índice de posiciones
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1)); //Muestra de acuerdo al índice de posiciones
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5)); //Muestra de acuerdo al índice de posiciones
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1)); //Muestra de acuerdo al índice de posiciones
        //Es para obtener parte del String asignando desde donde comienza de acuerdo de la posición de indice hasta el ultimo valor, es decir es ascendente el conteo de posiciones //El desde x se incluye
        System.out.println("nombre.substring(2) = " + nombre.substring(2));
        //El desde x se incluye (es el primer valor) pero el hasta no se incluye
        System.out.println("nombre.substring(2,6) = " + nombre.substring(2,6));
        System.out.println("nombre.substring(5,6) = " + nombre.substring(5,7));

        String trabalenguas = "trabalenguas pollo";
        System.out.println("trabalenguas = " + trabalenguas.replace("a","."));
        //Indica la posicion en la que se encuentra el primer carácter o palabra (primer ocurrencia)
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.indexOf(\"pollo\") = " + trabalenguas.indexOf("pollo"));


        //Indica la posicion en la que se encuentra el último carácter o palabra (último ocurrencia)
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        //En caso de que no se encuentre la palabra o caracter como resultado dara un -1
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("z"));
        //Otra manera de saber si un string esta dentro de otro es con .contains retorna un valor booleano
        System.out.println("trabalenguas.contains(\"z\") = " + trabalenguas.contains("a "));

        //Inicia con... retorna en un valor booleano
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"t\") = " + trabalenguas.startsWith("t"));
        //Termina con... retorna en un valor booleano
        System.out.println("trabalenguas.endsWith(\"pollo\") = " + trabalenguas.endsWith("pollo"));

        System.out.println("  trabalenguas pollo ");
        //.trim unicamente quita espacios a las orillas, NO QUITA ESPACIOS EN NINGUN OTRO Lugar
        System.out.println("  trabalenguas pollo ".trim());
    }
}
