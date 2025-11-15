public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "tres tristes tigres, tragaban trigo en un trigal, en tres tristes trastos, tragaban trigo tres tristes tigrestrigo";
        String palabra = "trigo";


        int longitudPalabra = palabra.length();
        int longitudFrase = frase.length() - longitudPalabra;

        int cantidad = 0;
        char letra = 'e';

        buscar:
        for (int i = 0; i <= longitudFrase; ) {
            int k = i;
            for (int j = 0; j < longitudPalabra; j++) {
                //el caracter 0 de la frase es diferente al mismo carácter de la palabra
                // primero se evalua en 0 y despues se suma 1
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
                //el caracter N de la frase no es diferente al mismo caracter de la palabra
                // asi que cantidad se suma +1
            }
            cantidad++;
            i = i + longitudPalabra;
        }
        System.out.println("Se encontro: " + cantidad + " veces la palabra: " + palabra + " en la frase");


    }
}
