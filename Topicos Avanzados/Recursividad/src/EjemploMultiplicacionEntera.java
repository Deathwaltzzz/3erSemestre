import javax.swing.*;

public class EjemploMultiplicacionEntera {
    public static int multi(int a, int b) {
        if(b == 0){
            return 0;
        }else{
            int sum =  a + multi(a,b-1);
            System.out.println(sum);
            return sum;
        }
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor de a: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el valor de b: "));
        JOptionPane.showMessageDialog(null, "El valor de la multiplicacion entera es: "+ multi(a,b));
    }
}
