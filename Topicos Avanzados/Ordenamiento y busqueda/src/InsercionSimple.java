import java.util.Random;

public class InsercionSimple {
    public static void insercionSimple(int x[], int n){
        int i,y;
        for (int j = 0; j < n; j++) {
            y = x[j]; //Elemento a ordenar y colocar en el subarchivo
            for(i = j-1 ; i >= 0 && y<x[i] ; i--){
                x[i+1] = x[i];
            }
            x[i+1] = y;
        }
    }

    public static void main(String[] args) {
        Random r = new Random();
        int x[] = new int[20];
        for (int i = 0; i < x.length; i++) {
            x[i] = r.nextInt(300)+1;
        }
        insercionSimple(x,x.length);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\t");
        }
    }
}
