public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {
        //Se le pueden dar etiquetas a las sentencias asi(Esta siempre debe estar en la misma linea o por debajo pero nunca separada por algo más):
        //Las etiquetas continue y break, funcionan para while, do while, for, if
        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[ i = " + i + ", j =" + j + " ]");
            }
        }
        System.out.println("\n\nEjemplo 2:");
        etiqueta:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta;
                }
                System.out.print("[ i = " + i + ", j =" + j + " ]");
            }
        }

        System.out.println("\n\nEjemplo 3:");

        diasLaborables:
        for (int i = 1; i <= 7; i++) {

            int j = 1;
            while ( j <= 8){
                if (i == 6 || i == 7) {
                    System.out.println("Día " + i + ": descanso de fin de semana :)");
                    continue diasLaborables;

                }
                System.out.println("Día " + i + ", trabajando a las " + j + " hrs. ");
                j++;
            }

        }




    }
}

