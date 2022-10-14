import java.util.*;
public class bubble{
    public static void bubbleSort(int x[], int n){
        int temp,j,pass;
        boolean switched = true;
        for(pass = 0 ; pass < n-1 && switched; pass++){
            switched = false;
            for( j = 0 ; j < n-pass-1 ; j++){
                if(x[j] > x[j+1]){
                    switched = true;
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Random r = new Random();
        int x[] = new int[20];
        for(int i = 0 ; i<x.length ; i++){
            x[i] = r.nextInt(300) + 1;
        }
        bubbleSort(x,x.length);
        for(int i = 0 ; i<x.length ; i++){
            System.out.print(x[i] + "\t");
        }
        System.out.println("\n");
    }
}
