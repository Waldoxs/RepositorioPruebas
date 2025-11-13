public class OperadoresIncrementales {
    public static void main(String[] args) {

        //Pre incremento
        int i = 1;
        int j = ++i;        //i = i + 1

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post incremento
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++;    //Unicamente se ve afectada la variable i al incrementar
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre decremento
        i = 3;
        j = --i;        //i = i-1=2
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post decremento
        i=4;
        j = i--; //Unicamente se ve afectada la variable i al decrementar
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("j = " + (++j));     //Primero se incrementa y despues se asigna(imprime)
        System.out.println("j = " + (j++));     //Primero se asigna(imprime) y despues se incrementa
        System.out.println("j = " + j);
    }
}
