public class WrapperInteger {
    public static void main(String[] args) {

        //Entero primitivo
        int intPrimitivo = 32768;

        //Esta es la forma explicita de crea un objeto tipo Integer
        Integer intObjeto = Integer.valueOf(32768);

        //Forma directa es decir el autopopsin
        Integer intObjeto2 = 32768;
        //Asi se convierte un primitivo en un objeto referencia de la clase wrapper Integer
        //Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        //Asi se convierte un objeto referencia de la clase wrapper Integer en un primitivo
        int num = intObjeto;                //Forma implicita
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();    //Forma explicita
        System.out.println("num2 = " + num2);


        String valorTvLcd = "67000";
        //Para convertir un String a un valor entero
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        //Para convertir un Integer mayor a la capacidad que soporta el short(32767) a un valor entero(short)
        //Por lo que al ser mayor hay una perdida de información
        //Mientras el valor sea <= 32767 no hay perdida de información
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        //Para convertir un Integer mayor a la capacidad que soporta el byte a un valor entero(byte)
        //Por lo que al ser mayor hay una perdida de información
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        /*
            NOTA:
        No se puede convertir un objeto con mayor capacidad a un objeto con menor capacidad O EN SU DEFECTO SI SE PUEDE siempre y cuando el objeto de mayor capacidad mientras este dentro de los rangos del objeto de menor capacidad.

        PERO si se puede convertir un objeto de menor capacidad a un objeto de mayor capacidad.

        */

        //Para convertir un Integer a un Long
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}
