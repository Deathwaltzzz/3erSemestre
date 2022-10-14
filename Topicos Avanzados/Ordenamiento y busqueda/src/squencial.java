import java.util.Random;
import java.util.Scanner;

public class squencial {
    public static void main(String[] args) {
        int[] x = new int[100];
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(1,100);
        }
        imprimir("Datos generados",x);
        System.out.print("\nElemento a buscar: ");
        int elemento = sc.nextInt();
        System.out.println("\nEl elemento se encuentra en la posicion: " + busquedaLineal(x,elemento));

    }
    public static int busquedaLineal(int[] x, int elemento){
        for (int i = 0; i < x.length; i++) {
            if(x[i] == elemento){
                return i;
            }
        }
        return -1;
    }

    public static void imprimir(String titulo, int[] x){
        System.out.println(titulo);
        for(int num : x){
            System.out.print(num + "\t");
        }
    }
    /*
    El algoritmo para la busqueda lineal simplemente se pregunta por una condicion cada que se repita el arreglo
     */
}
