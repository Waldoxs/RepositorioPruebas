public class PrimitivosFloat {
    public static void main(String[] args) {
        // Se puede definir con exponente usando la letra "E" o "e" siendo *10^y terminando con "F" de flotante
        // El exponente se cuenta desde el ultimo digito hacia la izq o derecha
        // Cuando es un valor con mayor precision se convierte a notacion cientifica
        float realFloat = 15.2e-3F; //2120.0F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("flotante correspondiente en byte a = " + Float.BYTES);
        System.out.println("flotante correspondiente en bites a = " + Float.SIZE);
        System.out.println("Máximo valor para float = " + Float.MAX_VALUE);
        System.out.println("Mínimo valor para float = " + Float.MIN_VALUE + "\n");

        double realDouble = 3.4028235E39; // Por defecto cuando hay un flotante es double
        //No es necesario usar la "D" al final

        System.out.println("realDouble = " + realDouble);
        System.out.println("double correspondiente en byte a = " + Double.BYTES);
        System.out.println("double correspondiente en bites a = " + Double.SIZE);
        System.out.println("Máximo valor para double = " + Double.MAX_VALUE);
        System.out.println("Mínimo valor para double = " + Double.MIN_VALUE + "\n");

        //Variable dinámica

        var varFlotante = 3.141516F; //Por defecto por el punto decimal es "double"
        // En caso que quiero que sea flotante al final de los digitos poner "f"
        System.out.println("varFlotante = " + varFlotante);
    }
}
