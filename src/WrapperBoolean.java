public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;
        //boolean primitivo
        boolean primBoolean = num1 > num2;  //false

        //Boolean de referencia es decir es la clase Wrapper
        //Boolean objBoolean = false;
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        
        Boolean objBoolean2 = Boolean.valueOf("falso");

        Boolean objBoolean3 = true;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        //La comparacion con == no se comporta igual que con los enteros
        System.out.println("Comparando dos objetos boolean = " +(objBoolean == objBoolean2));
        System.out.println("Comparando dos objetos boolean = " +(objBoolean.equals(objBoolean2) ));

        System.out.println("Comparando dos objetos boolean = " +(objBoolean == objBoolean3));
        System.out.println("Comparando dos objetos boolean = " +(objBoolean2 == objBoolean3));

        //Para convertir de un primitivo a un Boolean (es decir a un objeto) es:
        boolean primBoolean2 = objBoolean2.booleanValue();      //Forma explicita
        //boolean primBoolean2 = objBoolean2();                 //Forma implícita

        System.out.println("primBoolean2 = " + primBoolean2);


        
        
    }
}
