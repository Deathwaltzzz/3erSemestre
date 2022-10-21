package Proyecto;

import javax.swing.*;

public class app {
    public static void main(String[] args) throws NoSuchMethodException {
        int j = 0;
        ArbolString palabra = new ArbolString();
        ArbolIntList arbolIntList = new ArbolIntList();
        String menu = "1) Agregar nuevo termino \n2) Imprimir indice \n3) Terminar.";
        int opc = 0;
        while(opc != 3){
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,menu));
            if(opc != 3){
                switch(opc){
                    case 1:
                        palabra.creaArbolBinario(JOptionPane.showInputDialog(null,"Palabra a insertar"));
                        break;
                    case 2:
                        palabra.entreOrden(palabra.getRaiz());
                        break;
                }
            }
        }
    }
}
