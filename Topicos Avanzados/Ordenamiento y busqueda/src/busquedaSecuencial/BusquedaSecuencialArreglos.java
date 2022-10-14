package busquedaSecuencial;

import javax.swing.*;
import java.util.Random;

public class BusquedaSecuencialArreglos {
    public static int busquedaSecuencial(int x[], int elemento){
        for (int i = 0; i < x.length; i++) {
            if(x[i] == elemento){
                return i;
            }
        }
        return -1;
    }

    public static void print(String encabezado, int x[]){
        for(int num : x){
            System.out.print(num + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random r = new Random();
        int x[] = new int[20];
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(0,200);
        }
        print("Datos generados", x );

        int elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Elemento a buscar"));
        System.out.println("El elemento se encuentra en la posicion: " + busquedaSecuencial(x,elemento));
    }
}
