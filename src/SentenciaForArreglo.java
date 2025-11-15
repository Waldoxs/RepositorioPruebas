import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        //Para arreglos puede ir de dos formas String[] nombre o String nombre[]
        String[] nombre = {"Oswaldo", "Pollo", "Maria", "Pablo", "Lorenzo", "Gabriela"};

        int cuenta = nombre.length;

        for (int i = 0; i < cuenta; i++) {
            if (nombre[i].equalsIgnoreCase("Pollo") || nombre[i].equalsIgnoreCase("gabriela")) {  //Tambien se puede usar .contains siendo igual a .equals, debido a que deben estar escritos EXACTAMENTE IGUALES

                //if(nombre[i].toLowerCase().contains("PoLLo".toLowerCase()))   otra manera de que el texto siempre sea igual, es igualdando las condiciones de mayus o minusculas
                continue;
            }
            System.out.println(i + ".- " + "nombre: " + nombre[i]);

        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre como \"Pollo\" o \"Pablo\"");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < cuenta; i++) {
            if (nombre[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
            System.out.println("nombre = " + nombre[i]);
        }

        if(encontrado){
            JOptionPane.showMessageDialog(null, "Se encontro: " + buscar);
        }else {
            JOptionPane.showMessageDialog(null, "No existe en el sistema: " + buscar);
        }


    }
}
