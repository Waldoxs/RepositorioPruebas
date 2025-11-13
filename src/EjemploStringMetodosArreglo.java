public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.length());   //Aqui es un metodo el .length
        //Convierte un String en un arreglo de caracteres
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        char[] arreglo = trabalenguas.toCharArray();

        int largo = arreglo.length;     //Aqui es un atributo (propiedad) el .length
        System.out.println("largo = " + largo);

        for (int i = 0; i < largo; i++) {
            System.out.print(arreglo[i]);
            //System.out.println(arreglo[i]);
        }

        System.out.println();

        //Convierte un String en un arreglo de conjunto de caracteres pero sin incluir alguna letra o palabra
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));
        String[] arrelgo2 = trabalenguas.split("a");

        int l = arrelgo2.length;
        System.out.println("l = " + l);

        for (int j = 0; j < l; j++) {
            System.out.println(arrelgo2[j]);
        }

        String archivo = "alguna.imagen.docs";
        String[] archivoArr = archivo.split("\\."); //El caracter punto (.) se obtiene con \\.
        //De forma especifica se puede definir un literal con [] es decir usar .split([.]); o agrupar un conjunto de caracteres
        //Debido a que no se puede usar .split(.); ya que arrojara un error
        l = archivoArr.length;
        for (int j = 0; j < l; j++) {
            System.out.println(archivoArr[j]);
        }
        System.out.println("Extensión = " + archivoArr[l-1]);
    }
}
