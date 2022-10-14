import javax.swing.*;

public class SumaVectoresRecursivo {
    public static int suma(int[] vec, int max){
        if (max == 0){
            return vec[max];
        }else{
            return vec[max] + suma(vec,max-1);
        }
    }

    public static void main(String[] args) {
        int max = Integer.parseInt(JOptionPane.showInputDialog(null,"Tamaño maximo del arreglo"));
        int[] vec = new int[max];
        for(int i = 0 ; i < max ; i++){
            int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Intrdoduce un numero: "));
            vec[i] = x;
        }
        JOptionPane.showMessageDialog(null,"La suma del arreglo es: "+ suma(vec,vec.length - 1 ));
    }
}
