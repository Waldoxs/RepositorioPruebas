public class PasarPorReferencia {
    public static void main(String[] args) {

        //Por se de referencia es posible que se pueda hacer un cambio en su valor de salida
        int[] edad = {10, 11, 12, 13};

        System.out.println("iniciamos el método main con edad");

        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Antes de llamar al método test");
        test(edad);
        System.out.println("Después de llamar al método test");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }
        System.out.println("Finaliza el método main con los datos del arreglo modificados!");
    }

    //void no devuelve ningún valor
    public static void test(int[] edadArreglo) {
        System.out.println("Iniciamos el método test con edad");

        for (int i = 0; i < edadArreglo.length; i++) {
            edadArreglo[i] += 20;
        }

        System.out.println("Finaliza el método test con edad");
    }


}

