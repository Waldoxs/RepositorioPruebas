public class PasarPorValor {
    public static void main(String[] args) {
        Integer i = 5;
        int i2 = 10;

        System.out.println("iniciamos el método main con 'i' e 'i2' = " + i + " , " + i2);
        test(i, i2);
        //Se mantiene igual el valor debido a que son inmutables
        //Esto aplica para todos los primitivos float, short, string,double
        System.out.println("Finaliza el método main con el valor de 'i' e 'i2' = " + i + " , " + i2);
    }

    //void no devuelve ningun valor
    public static void test(Integer a, int b) {
        System.out.println("Iniciamos el método test con 'a' y 'b' = " + a + " , " + b);
        a = 35;
        b = 50;
        System.out.println("Finaliza el método test con 'a' y 'b' = " + a + " , " + b);
    }


}

