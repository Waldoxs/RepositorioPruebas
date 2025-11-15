public class AutoboxingInteger {
    public static void main(String[] args) {
        //Autoconvertir o anidar un primitivo en la clase Integer y viceversa

        //Es como tener  Integer[] enteros = {Integer.valueOf(1), ...}
        Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int suma = 0;
        
        //ForEach   (Es la forma explicita)
        for (Integer i: enteros){
            if(i.intValue() % 2 == 0){  //al poner i.intValue() el valor de i en el arreglo se hace primitivo entero
                suma+= i.intValue();
            }
        }
        System.out.println("suma = " + suma);
        System.out.println();

        suma = 0;
        //Autoboxing (Es la forma implícita)
        //Convertir de un objeto Integer a un primitivo int
        for (Integer i: enteros){
            if(i % 2 == 0){  //al poner i.intValue() el valor de i en el arreglo se hace primitivo entero
                suma+= i.intValue();
            }
        }
        System.out.println("suma = " + suma);



    }
}
