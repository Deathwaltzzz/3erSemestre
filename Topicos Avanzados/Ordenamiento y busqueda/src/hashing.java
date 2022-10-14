import java.util.Random;

public class hashing {
    public static void place(Nodo[] head, int posicion, int n){
        Nodo q,tmp;
        tmp = new Nodo();
        tmp.info = n;
        if(head[posicion] == null || n < head[posicion].info){
            tmp.next = head[posicion];
            head[posicion] = tmp;
        }else{
            q = head[posicion];
            while(q.next != null && q.next.info < n){
                q = q.next;
            }
            tmp.next = q.next;
            q.next = tmp;
        }
    }
    public static void hashingSort(int x[]) {

        Nodo f[] = new Nodo[10]; //arreglo de apuntadores a listas enlazadas
        int posicion;
        /* Inicializa arreglo de apuntadores a listas enlazadas */
        for (int i = 0; i < f.length; i++) {
            f[i] = null;
        }
        /* Procesa cada elemento del arreglo y lo ubica en lista enlazada correspondiente */

        for (int i = 0; i < x.length; i++) {
            posicion = x[i]/10; //aplica la function f para ubicar el subarchivo
            place(f, posicion, x[i]); //coloca el elemento en la lista enlazada ordenada

        }//fin for
        /* Procesa arreglo de apuntadores y almacena en arreglo original */

        int i = 0;

        for (int j = 0; j < f.length; j++) {
            Nodo p = f[j]; //apuntador a la lista enlazada
            while (p != null) {
                x[i++] = p.info;
                p = p.next;

            }//fin while

        }//fin for
    }

    public static void main(String[] args) {
        Random r = new Random();
        int[] x = new int[15];
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(98)+1;
        }
        System.out.println("Arreglo sin ordenar: ");
        for (int i = 0; i < x.length; i++) {
            if(i < (x.length-1)){
                System.out.print(x[i] + ", ");
            }else{
                System.out.print(x[i]);
            }
        }
        hashingSort(x);
        System.out.println("\nArreglo ordenado con hashing");
        for (int i = 0; i < x.length; i++) {
            if(i < (x.length-1)){
                System.out.print(x[i] + ", ");
            }else{
                System.out.print(x[i]);
            }
        }
    }
}
class Nodo{
    public int info;
    public Nodo next;
}