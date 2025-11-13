import javax.swing.*;

public class OperadoresAritmetico {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;

        System.out.println("suma = " + suma);
        System.out.println("(i+j) = " + (i + j));

        int resta = i - j;
        System.out.println("resta = " + resta);
        //System.out.println("i-j = " + i - j); no se puede poner el operador (-) ahi
        System.out.println("(i-j) = " + (i - j));

        int multi = i * j;
        System.out.println("multi = " + multi);

        int division = i / j;
        float division2 = (float) i / j; //Aqui se forza a que sea flotante // Se puede asi: (float) i / (float)j
        System.out.println("division = " + division);
        System.out.println("division2 = " + division2);

        int resto = i % j;
        //double resto2 = (double) i%j;
        System.out.println("resto2 = " + resto);

        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if (numero % 2 == 0) {
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar= " + numero);
        }


    }
}
