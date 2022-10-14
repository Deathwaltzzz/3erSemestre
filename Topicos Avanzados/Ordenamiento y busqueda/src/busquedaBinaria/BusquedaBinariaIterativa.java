package busquedaBinaria;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BusquedaBinariaIterativa {
    public static int binarySearch(int valorBuscar, int[] arreglo){
        int buscar = valorBuscar;
        int arregloBuscar[] = arreglo;
        int inicio = 0;
        int fin = arregloBuscar.length-1;
        int posicion;

        while(inicio <= fin){
            posicion = (inicio + fin)/2;
            if(arregloBuscar[posicion] == buscar){
                return posicion;
            } else if (buscar > arregloBuscar[posicion]) {
                inicio = posicion + 1;
            }else{
                fin = posicion -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] x = new int[10];
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(0,100);
        }
        Arrays.sort(x);
        System.out.println("Arreglo generado: ");
        for(int num: x){
            System.out.print(num + "\t");
        }
        System.out.println("\nElemento a buscar: ");
        int num = sc.nextInt();
        System.out.println("El elemento se encuentra en la posicion: " + binarySearch(num,x));
    }
}
