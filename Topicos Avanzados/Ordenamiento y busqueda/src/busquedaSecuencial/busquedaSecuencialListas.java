package busquedaSecuencial;

import javax.swing.*;

public class busquedaSecuencialListas {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.agregaElemento(20);
        lista.agregaElemento(12);
        lista.agregaElemento(82);
        lista.agregaElemento(252);
        lista.agregaElemento(98);
        lista.agregaElemento(2);
        lista.agregaElemento(55);
        lista.agregaAlFinal(250);
        lista.getLista();

        int elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Elemento a buscar"));
        System.out.println("\nEl elemento se encuentra en la posicion: "+ lista.busquedaElemento(elemento));

    }
}
