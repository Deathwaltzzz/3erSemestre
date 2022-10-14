import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class tarea2 {
    public static int i,j;
    public static int[][] m;
    public static void main(String[] args) {
        int opc = 0;
        String s = "1. Generar matriz \n2. Desplegar matriz \n3. Sumar datos de la matriz \n4. Sustituir negativos por 0's" +
               " \n5. Elemento mayor \n6. Suma de la diagonal principal \n7. Salir";
        while(opc!=7){
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,s));
            if(opc!=7){
                switch(opc){
                    case 1:
                        int length = Integer.parseInt(JOptionPane.showInputDialog(null,"Limite de la matriz"));
                        m = new int[length][length];
                        generaMatriz(m,length);
                        break;
                    case 2:
                        if(m!= null){
                            desplegarMAtriz();
                        }else{
                            JOptionPane.showMessageDialog(null,"No ha sido creada la matriz");
                        }
                        break;
                    case 3:
                        if(m!= null){
                            sumaMatriz();
                        }else{
                            JOptionPane.showMessageDialog(null,"No ha sido creada la matriz");
                        }
                        break;
                    case 4:
                        sustituirNegativos();
                        break;
                    case 5:
                        elementoMayor();
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "La suma de la diagonal principal es: "
                        + sumaDiagonalPrincipal());
                        break;
                }
            }
        }
    }

    public static void desplegarMAtriz(){
        String s="Matriz \n";

        for(i=0;i<m.length;i++){
            for (j=0;j<m[i].length;j++){
                s += m[i][j] +", ";
            }
            s += "\n";
        }
        JOptionPane.showMessageDialog(null,s);
    }

    public static void sumaMatriz() {
        int suma=0;
        for(i=0;i<m.length;i++)
            for(j=0;j<m[i].length;j++)
                suma +=m[i][j];
        JOptionPane.showMessageDialog(null,suma);
    }

    public static int[][] generaMatriz(int[][]m, int length){
        Random ran = new Random();
        for (i = 0;i  <m.length ; i++) {
            for (j = 0; j < m[i].length; j++) {
                m[i][j] = ran.nextInt(-50, 50);
            }
        }
        return m;
    }

    public static void elementoMayor(){
        int mayor = m[0][0];
        String pos = "";
        for(i = 0 ; i < m.length ; i++){
            for(j = 0 ; j < m[i].length; j++){
                if(mayor < m[i][j]){
                    mayor = m[i][j];
                    pos = "[" + (i + 1) + "]" + "[" + (j + 1) + "]";
                }
            }
        }
        JOptionPane.showMessageDialog(null,"El elemento mayor es: " + mayor +" en la posición "+ pos);
    }
    
    public static void sustituirNegativos(){
        /*todos los elementos de la matriz que sean negativos, se van a sustituir con un cero.*/
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                if(m[i][j]<0)
                    m[i][j]=0;
            }
        }
    }

    public static int sumaDiagonalPrincipal(){
        /* Devuelve la suma de los elementos que se encuentran en la diagonal principal de la matriz. */
        int suma = 0;
        for(int i=0; i<m.length; i++)
            suma += m[i][i];
        return suma;
    }
}
