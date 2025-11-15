public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {


        /*
         * En JAVA hasta 127 como máximo va a comparar de forma automatica
         * por el valor, apesar de ser una instancia
         * Asi que es igual o menor a 127 va a comparar por valor primitivo y no por instancia
         * Pero si es >= 128 ya compara por instancia
         * */

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        //es un OBJETO que contienen un valor encapsulado dentro de la instancia del Integer
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));
        System.out.println();

        num2 = 1000;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("Son el mismo objeto? " + (num1 == num2));


        // equals es para comparar valor en tipos de referencias
        System.out.println("Tiene el mismo valor? " + (num1.equals(num2)));

        // == es para comparar primitivos por valor
        System.out.println("Tiene el mismo valor primitivo? " + (num1.intValue() == num2.intValue()));


        num2 = 500;
        //Los tipos de referencia se puede usar sin ningun problema los operadores de logicos
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        //Es la forma explicita de la misma sentencia de arriba
        boolean condicion2 = num1.intValue() < num2.intValue();
        System.out.println("condicion2 = " + condicion2);

    }
}
