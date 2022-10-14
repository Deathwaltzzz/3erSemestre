import javax.swing.*;

public class BusquedaBinaria {
    public static int busquedaBinaria(int[] a,int n, int bajo, int alto){
        int mitad;
        if(alto<bajo){
            return -1; //Caso base. Elemento no encontrado
        }else{
            mitad = (bajo + alto)/2;
            System.out.println(mitad);
            if(n==a[mitad]){
                return mitad; //Caso base. Retorna la posicion del elemento
            }
            if(n<a[mitad]){
                return busquedaBinaria(a,n,bajo,mitad-1);
            }else{
                return busquedaBinaria(a,n,mitad+1,alto);
            }
        }
    }

    public static void main(String[] args) {
        int[] arreglo = {25,29,31,34,43,58,61,67,70,75,77,89,97,120,125};

        //Aplica metodo de busqueda binaria
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Llave a buscar"));
        System.out.println("El elemento "+n+" esta en la celda: "+ busquedaBinaria(arreglo,n,0,arreglo.length));
    }
}
/*
    Este metodo solo funciona cuando los datos estan organizados de menor a mayor.
 */
