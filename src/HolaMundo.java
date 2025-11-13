public class HolaMundo {
    public static void main(String[] args) {
        //Definicion de variables
        String saludar = "Hola mundo desde Java! :)";

        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        //Variable primitivo int
        int numero = 11;

        System.out.println("numero = " + numero);
        boolean valor = true;
        int numero2 = 5;
        if(valor){
            numero2 = 11;
            System.out.println("valor = " + valor);
        }
        System.out.println("numero2 = " + numero2);

        //Variable dinámica es como los #DEFINE en el que debes definir el tipo de variable de acuerdo a la asignación que corresponda
        var numero3 = 15;

        String nombre;
        nombre = "Oswaldo";
        if(numero > 10){
            nombre = "Piojo";
        }

        System.out.println("nombre = " + nombre);

        int edadPersona = 6;
    }
}
