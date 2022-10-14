import javax.swing.JOptionPane;
public class EjemploFactorial {
    public static int factorial(int n){
        if (n == 1){
            return 1; //Caso base
        }else{
            return n*factorial(n-1); //Metodo recursivo
        }
    }
    public static void main(String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de n?"));
        JOptionPane.showMessageDialog(null, "Factorial es: "+factorial(n));
    }
}
/*
    La recursivdad es una poderosa herramienta de programacion.
    Alternativa a algoritmos iterativos
    Forma elegante de programar, pero no eficiente
    Un metodo es recursivo si contiene invocaciones  si mismo
 */