import javax.swing.*;

public class TorresHanoi {
    public static void hanoi(int n, String ini, String aux, String fin){
        if(n>0){
            hanoi(n-1,ini,fin,aux);
            System.out.println("Mover disco "+n+" de "+ini+ " a "+fin);
            hanoi(n-1,aux,ini,fin);
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Nim discos"));
        hanoi(n,"Primera torre","Tercera Torre","Segunda torre");
    }
}
