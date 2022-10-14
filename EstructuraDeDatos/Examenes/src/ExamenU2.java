import javax.swing.*;

public class ExamenU2 { //Leonardo Contreras Martinez
    static String ciudadOrigen, ciudadDestino;
    static float precio;
    public static void main(String[] args) {
        int iN = 0,iE = 0;
        PilaVuelos nacional = new PilaVuelos(12);
        PilaVuelos extranjero = new PilaVuelos(12);
        String menu = "1) Insertar un vuelo \n2) Mostrar vuelos nacionales \n3) Mostrar vuelos al extranjero" +
                "\n4) Vuelo extranjero mas economico \n5) AUmentar precio vuelos nacionales" +
                "\n6) Buscar vuelos a Londres \n7) Salir";
        int opc = 1;
        while(opc != 7){
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,menu));
            if(opc != 7){
                switch(opc){
                    case 1:
                        precio = Float.parseFloat(JOptionPane.showInputDialog(null,"Precio del vuelo: "));
                        if(precio < 20000) {
                            insertarVuelo(nacional);
                        }
                        else {
                            insertarVuelo(extranjero);
                        }
                        break;
                    case 2:
                        mostrarVuelos(nacional);
                        break;
                    case 3:
                        mostrarVuelos(extranjero);
                        break;
                    case 4:
                        if(!extranjero.estaVacia()){
                            JOptionPane.showMessageDialog(null,extranjero.getP()[buscarEconomico(extranjero)].toString());
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay vuelos en la pila!");
                        }
                        break;
                    case 5:
                        if(!nacional.estaVacia())
                            aumentarPrecio(nacional);
                        else
                            JOptionPane.showMessageDialog(null,"No hay vuelos en la pila!");
                        break;
                    case 6:
                        if(!extranjero.estaVacia()){
                            JOptionPane.showMessageDialog(null,buscarLondres(extranjero));
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay vuelos en la pila!");
                        }
                        break;
                }
            }
        }
    }
    public static void insertarVuelo(PilaVuelos pila){
        if(!pila.estaLlena()){
            ciudadOrigen = JOptionPane.showInputDialog(null,"Ciudad de origen: ");
            ciudadDestino = JOptionPane.showInputDialog(null,"Ciudad destino: ");
            pila.insertar(new Vuelo(ciudadOrigen,ciudadDestino,precio));
        }else{
            JOptionPane.showMessageDialog(null,"Esta llena!");
        }
    }
    public static void mostrarVuelos(PilaVuelos pila){
        if(!pila.estaVacia()){
            JOptionPane.showMessageDialog(null,pila.toString());
        }else{
            JOptionPane.showMessageDialog(null,"No hay vuelos en la pila!");
        }
    }
    public static int buscarEconomico(PilaVuelos pila){
        float min = pila.getP()[0].getPrecio();
        int n = 0;
        if(!pila.estaVacia()){
            for(int i = 0 ; i <= pila.getTope() ; i++){
                if(pila.getP()[i].getPrecio() < min){
                    min = pila.getP()[i].getPrecio();
                    n = i;
                }
            }
        }
        return n;
    }
    public static void aumentarPrecio(PilaVuelos pila){
        if(!pila.estaVacia()){
            for (int i = 0; i <= pila.getTope(); i++) {
                pila.getP()[i].setPrecio(pila.getP()[i].getPrecio() * 1.05f);
            }
        }
    }
    public static String buscarLondres(PilaVuelos pila){
        String s = "Vuelos a Londres: \n";
        for (int i = 0; i <= pila.getTope(); i++) {
            if(pila.getP()[i].getCiudadDestino().equalsIgnoreCase("londres")){
                s+= pila.getP()[i].toString();
            }
        }
        return s;
    }
}
