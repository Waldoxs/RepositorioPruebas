public class SentenciaForEach {
    public static void main(String[] args) {
        //Solo usado para ARREGLOS u objetos de coleccion de JAVA es este for

        int[] numero = {1, 3, 5, 7, 9, 11, 13, 15};

        //for(tipo de datos de los elementos VARIABLE INDEPENDIENTE: variable con arreglo
        for(int num: numero){
            System.out.println("num = " + num);
        }
        System.out.println();

        String[] nombres = {"Oswaldo", "Pollo", "Maria", "Pablo", "Lorenzo", "Gabriela"};
        for(String nombre: nombres){
            System.out.println("nombre = " + nombre);
            
        }

    }
}
