import java.util.*;
public class select{
    public static void selectSort(int x[], int n){
        int i,indx,j,large;
        for(i = n-1; i>0 ; i--){
            large = x[0];
            indx = 0;
            for(j = 1 ; j <= i ; j++){
                if(x[j]>large){
                    large = x[j];
                    indx = j;
                }
            }
            x[indx] = x[i];
            x[i] = large;
        }
    }

    public static void main(String[] args){
        Random r = new Random();
        int x[] = new int[20];
        //Llena el arreglo con numeros aleatorios de 1 a 300
        for(int i = 0 ; i < x.length; i++){
            x[i] = r.nextInt(300) + 1;
        }
        //Aplica metodo de seleccion directa y ordena los datos
        selectSort(x,x.length);

        for(int i = 0 ; i < x.length ; i++){
            System.out.print(x[i] + "\t");
        }
        System.out.println("\n");
    }
}
