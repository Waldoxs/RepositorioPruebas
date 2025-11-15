public class SentenciaIfElse {
    public static void main(String[] args) {
//          Control de flujo
//        if(expresion){
//            //Alcance de la sentencia cuando == true
//        }else{
//            //Alcance de la sentencia cuando == false
//        }

//float promedio = 5.8f;
//        if (promedio >= 6.5) {//Nota en caso de solo ser 1 línea de sentencia no es necesario usar {}
//            System.out.println("Excelente promedio");
//        } else {//Nota en caso de solo ser una línea de sentencia no es necesario usar {}
//            System.out.println("Que tarugo");
//        }

        float promedio = 5.5f;
        if (promedio >= 6.5) {
            System.out.println("Excelente promedio");
        } else if (promedio >= 6.0) {
            System.out.println("Excelente muy mejor promedio");
        } else if (promedio >= 5.0) {
            System.out.println("Regular promedio");
        } else if (promedio >= 4.0) {
            System.out.println("Tarugo");
        } else {
            System.out.println("Vas pa fuera tarugo");
        }

        System.out.println("promedio = " + promedio);

    }
}
