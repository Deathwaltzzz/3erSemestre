package ArbolBinarioString;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        ArbolBinario arbolBinario = new ArbolBinario();
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de strings a ingresar"));
        for (int i = 0; i < num; i++) {
            arbolBinario.creaArbolBinario(JOptionPane.showInputDialog(null,"Numero " + (i+1)));
        }
        System.out.println("Entre orden: ");
        arbolBinario.entreOrden(arbolBinario.getRaiz());
        System.out.println("\nPos orden: ");
        arbolBinario.posOrden(arbolBinario.getRaiz());
        System.out.println("\nPre orden: ");
        arbolBinario.preOrden(arbolBinario.getRaiz());
    }
}
