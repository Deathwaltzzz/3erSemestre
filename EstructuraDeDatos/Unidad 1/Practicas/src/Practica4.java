import javax.swing.*;
import java.util.Arrays;

public class Practica4 {
    public static String v[];
    public static char mc1[][];
    public static int i,j;
    public static char mc2[][];

    public static void main(String[] args){
        v = new String[5];
        int n = 0;
        mc1 = new char[5][];
        mc2 = new char[5][];
        String titulo;
        for (int i = 0; i < mc1.length; i++) {
            /*Pedir las 5 palabras */
            String s = JOptionPane.showInputDialog(null,"Escriba la palabra: " + (i+1));
            /*Crear el vector del tamaño de la palabra */
            mc1[i] = new char[s.length()];
            mc2[i] = new char[s.length()];
            for (int j = 0; j < s.length(); j++) {
                mc1[i][j] = s.charAt(j); /*Almacenar cada caracter en cada posición del vector*/
                mc2[i][j] = s.charAt(j);
            }
        }
        titulo = "Matriz mc1: " + "\n\n";
        despliega(mc1, titulo); /*Mostrar la matriz*/
        acomodarPalbras2(mc1,mc2); /*Acomodar por orden alfábetico las letras de la palabra de cada fila*/
        titulo = "Matriz mc2 ordenada alfabéticamente: " + "\n\n";
        despliega(mc2, titulo); /*Mostrar la matriz ordenada*/
    }
    public static void acomodarPalabras(){
        for(i=0;i<mc2.length;i++){
            for (j=0;j<mc2[i].length;j++){
                Arrays.sort(mc2[i]);
            }
        }
    }

    public static void acomodarPalbras2(char[][] m, char[][] m2){
        int min;
        for (int i = 0; i < m.length; i++) {
            min = m[i][0];
            for (int j = 0; j < m[i].length; j++) {
                if(min > m[i][j]){
                    m2[i][j] = (char) min;
                    min = m[i][j];
                }
            }
        }
        despliega(m2,"Palabras acomodadas");
    }

    public static void despliega(char[][] m, String titulo){
        String s = titulo;
        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m[i].length; j++) {
                s+= m[i][j] + ",";
            }
            s+= "\n";
        }
        JOptionPane.showMessageDialog(null,s);
    }

}