import javax.swing.JOptionPane;
public class EjemploFibonacci {
    public static int fibo(int n){
        if( n == 0 || n == 1){
            return n;
        }else{
            n = fibo(n-1) + fibo(n-2);
            System.out.print(n + "\t");
            return n;
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor de n"));
        JOptionPane.showMessageDialog(null, "El valor de N es: "+ fibo(n));
    }
}

//1 1 2 3 5 8 13 21 34