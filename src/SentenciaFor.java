public class SentenciaFor {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println();

        for (int i = 10; i >= 0; i--) {
            System.out.println("i = " + i);
        }

        System.out.println();

        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.println(i + " " + j);
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                //Si "i" es par se salta la iteración actual a la siguiente iteración con:
                continue;
            }
            System.out.println("i impar = " + i);

        }


        //Otra manera de usar el for con el break;
        /*
        int i = 0;
        for (; ; ) {
            if (i > 5) {
                break;
            }
            System.out.println("i = " + i);
            i++;
        }
         */


    }
}
