import javax.swing.JOptionPane;
public class ElevarUnNumeroRecursivo {
    public static int elevarNumero(int n, int x){
        if(x == 0){
            return 1;
        }else if(x == 1){
            System.out.println(n + " "+x);
            return n;
        }
        else{
            System.out.println(x);
            System.out.println(n);
            return n * elevarNumero(n,x-1);
        }
    }

    public static void main(String[] args){
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero a elevar: "));
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Potencia del numero: "));
        JOptionPane.showMessageDialog(null,"El numero elevado es: " + elevarNumero(n,x) );
    }
}
