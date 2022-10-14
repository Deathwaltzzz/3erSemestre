import javax.swing.*;

public class InvertirUnNumero {
    public static void invertir(int n){
        if(n<10){
            System.out.print(n);
        }else{
            System.out.print(n%10);
            invertir(n/10);
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero a invertir: "));
        invertir(n);
    }
}
