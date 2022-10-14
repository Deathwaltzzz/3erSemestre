import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cancion playlist[] = new Cancion[8];
        playlist[0] = new Cancion("In the end","Linkin Park",3.37f);
        for(int i = 1 ; i < playlist.length ; i++){
            String nombreCan = JOptionPane.showInputDialog(null,"Nombre de la cancion:");
            String interprete = JOptionPane.showInputDialog(null,"Interprete: ");
            Float duracion = Float.parseFloat(JOptionPane.showInputDialog(null,"Duracion de la cancion"));
            playlist[i] = new Cancion(nombreCan,interprete,duracion);
        }
        playlist[6].setDuracion(4.15f);
        for(int i = 0 ; i < playlist.length ; i++){
            if(playlist[i].getInterprete().equalsIgnoreCase("Morat")){
                JOptionPane.showMessageDialog(null,playlist[i].toString());
            }
        }
        int mayor = 0;
        for(int i = 0 ; i < playlist.length ; i++){
            if(playlist[0].getDuracion() > playlist[mayor].getDuracion()){
                mayor = i;
            }
        }
        JOptionPane.showMessageDialog(null,playlist[mayor].toString());
    }
}
