import javax.swing.*;

public class Practica2{
    public static void main(String[] args) {
        PilaString nombresAM = new PilaString(10);
        PilaString nombresNZ = new PilaString(10);
        for (int i = 0; i < 3; i++) {
            String n = JOptionPane.showInputDialog(null,"Nombre");
            if(n.toUpperCase().charAt(0) >= 'A' && n.toUpperCase().charAt(0) <= 'M'){
                capturarNombre(nombresAM,n);
            }else{
                capturarNombre(nombresNZ,n);
            }
        }

        System.out.println(nombresAM.toString());
        System.out.println(nombresNZ.toString());
    }

    public static void capturarNombre(PilaString pila, String nombre){
        pila.insertar(nombre);
    }
}