import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PilaInt pilaNones = new PilaInt(8);
        Random r = new Random();
        int j = 1;
        while (j!= 0){
            j = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero"));
            capturarEntero(j,pilaNones);
        }
        mostrarDatos(pilaNones);
        despliegaTope(pilaNones);
    }
    public static void capturarEntero(int x, PilaInt pila){
        if(pila.estaLlena()){
            JOptionPane.showMessageDialog(null,"PILA LLENA!, intento de overflow");
        }else{
            if(x % 2 == 0){
                JOptionPane.showMessageDialog(null,"Solo numeros impares!");
            }else{
                pila.insertar(x);
            }
        }
    }
    public static void mostrarDatos(PilaInt pilaNones) {
        JOptionPane.showMessageDialog(null, pilaNones.toString() + "\nCantidad de elementos: " + pilaNones.numElementos());

    }
    public static void despliegaTope(PilaInt pilaNones) {
        if(pilaNones.estaVacia())
            JOptionPane.showMessageDialog(null, "La pila esta vacía");
        else
            JOptionPane.showMessageDialog(null, "El dato en el tope es: " + pilaNones.datoEnTope());

    }
}
