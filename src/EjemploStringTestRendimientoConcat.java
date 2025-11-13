public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sB = new StringBuilder(a);     //Es mutable el StringBuilder

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {     //500 es 1 milisegundo

            //c = c.concat(a).concat(b).concat("\n");           //1 ms de ejecución
            //c += a + b + "\n";                                //9 ms de ejecución

            sB.append(a).append(b).append("\n");            //0 ms de ejecución con mayor utilidad para cuando se tenga una gran cantidad de string que mostrar
           // sB.append(a);
           // sB.append(b);
           // sB.append("\n");
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sB = " + sB.toString());
    }
}
