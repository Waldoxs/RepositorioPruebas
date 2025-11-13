public class PrecedenciaOperadores {
    public static void main(String[] args) {
//P
        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = (i + j + k) / 3d;//Se debe hacer el cast pero al poner el "3d" significa que es 3 double

        System.out.println("promedio = " + promedio);

        promedio = i + j + k / 3d * 10;
        System.out.println("promedio = " + promedio);

        promedio = ++i + j-- + k / 3d * 10;
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        promedio = --i + j++ + k / 3d * 10;
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);



    }
}
