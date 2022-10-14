package ArbolBinario;

import java.util.Random;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        ArbolBinario arbolBinario = new ArbolBinario();
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de numeros a introducir: ");
        int i=1, max = sc.nextInt();
        while(i <= max){
            int x = r.nextInt(1,100);
            arbolBinario.creaArbolBinario(x);
            i++;
        }

        System.out.println("Arbol pre orden: ");
        arbolBinario.preOrden(arbolBinario.getRaiz());
        System.out.println("\nArbol entre orden: ");
        arbolBinario.entreOrden(arbolBinario.getRaiz());
        System.out.println("\nArbol pos orden: ");
        arbolBinario.posOrden(arbolBinario.getRaiz());
    }
}
