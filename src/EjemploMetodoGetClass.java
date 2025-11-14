import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola mundo";

        //GetClass() retorna una instancia del tipo Class
        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);

        //Todos los metodos de la clase String
        for (Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());

        }

        System.out.println();

        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());
        System.out.println("objClass = " + objClass);

        //Todos los metodos de la clase Integer
        for (Method metodo: objClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());

        }

        System.out.println();
        
    }
}
