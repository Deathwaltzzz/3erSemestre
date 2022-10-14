package ArbolHebrado;

import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class appMain {
    public static void main(String[] args) {
        //int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos numeros: "));
        Scanner sc = new Scanner(System.in);
        ArbolHebrado arbol = new ArbolHebrado();
       /*
       for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero " + (i+1)));
            arbol.crearArbolHebrado(num);
        }*/
        String s = sc.nextLine();
        String linea = "e";
        StringTokenizer tokenizer = new StringTokenizer(s);
        while(linea != null){
            if(linea != null){
                linea = tokenizer.nextToken();
                StringBuilder sb = new StringBuilder(linea);
                sb.deleteCharAt(linea.length()-1);
                System.out.println(sb);
                arbol.crearArbolHebrado(Integer.parseInt(String.valueOf(sb)));
            }
        }
        arbol.entreOrden();
    }
}
