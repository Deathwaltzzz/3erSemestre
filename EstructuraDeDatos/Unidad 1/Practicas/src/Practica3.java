import javax.swing.*;
import java.util.Arrays;

public class Practica3 {
    public static int m[][], i, j; //Solo se declara la matriz
    public static void main(String[] args) {
        m = new int[3][10]; //Crea una matriz rectangular
        //asignar valores mediante codigo
        for(i = 0 ; i < m.length ; i++){
            for(j = 0 ; j <m[i].length ; j++){
                m[i][j] = 10 + i + j;
            }
        }
        despliega();
        m = new int[2][2];
        captura();
        despliega();
    }

    public static void despliega(){
        String s = "Despliegue matricial\n";
        for (i  = 0; i<m.length; i++) {
            for (j = 0 ; j < m[i].length ; j++){
                s+= m[i][j] + "  ";
            }
            s+= "\n";
        }
        JOptionPane.showMessageDialog(null,s);
    }

    public static void captura(){
        for(i = 0 ; i < m.length ; i++){
            for(j = 0 ; j < m[i].length ; j++){
                m[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,"Valor "));

            }
        }
    }
}
