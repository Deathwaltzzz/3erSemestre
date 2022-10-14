import javax.swing.*;

public class ExamenU1_2 {
    static String ciudadOrigen;
    static String ciudadDestino;
    static float precio;
    //Leonardo Contreras Martinez
    public static void main(String[] args) {
        int opc = 0, cont = 0;
        Vuelo[] vuelos = new Vuelo[14];
        String menu = "1) Captura de datos" +
                " \n2) Mostrar datos de todos los vuelos" +
                "\n3) Vuelo mas barato" +
                "\n4) Modificar precio de vuelos a Paris" +
                "\n5) Vuelos que salen de Monterrey"+
                "\n6) Terminar";
        while(opc!=6){
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,menu));
            if(opc !=6){
                switch(opc){
                    case 1:
                        if(cont < vuelos.length){
                            registrarVuelo(cont,vuelos);
                            cont++;
                        }else{
                            JOptionPane.showMessageDialog(null,"No hay espacio en el vector!");
                        }
                        break;
                    case 2:
                       despliega(vuelos);
                       break;
                    case 3:
                        if(vuelos[0]!= null){
                            float menor = vuelos[0].getPrecio();
                            JOptionPane.showMessageDialog(null,vuelos[calcularPrecio(menor,vuelos)]);
                        }
                        break;
                    case 4:
                        float porcentaje = Float.parseFloat(JOptionPane.showInputDialog(null,"Porcentaje a aumentar"));
                        aumentarPrecio(porcentaje,vuelos);
                        break;
                    case 5:
                        for (Vuelo vuelo : vuelos) {
                            if (vuelo != null) {
                                if (vuelo.getCiudadOrigen().equalsIgnoreCase("monterrey")) {
                                    JOptionPane.showMessageDialog(null, vuelo.toString());
                                }
                            }
                        }
                        break;
                }
            }
        }
    }

    static void registrarVuelo(int cont, Vuelo[] v){
        ciudadOrigen = JOptionPane.showInputDialog(null,"Ciudad de origen");
        ciudadDestino = JOptionPane.showInputDialog(null,"Ciudad de destino");
        precio = Float.parseFloat(JOptionPane.showInputDialog(null,"Precio del vuelo"));
        v[cont] = new Vuelo(ciudadOrigen,ciudadDestino,precio);
        System.out.println(cont);
    }
    static void despliega(Vuelo[] m){
        String s = "";
        for (int i = 0; i < m.length ; i++) {
            if(m[i] != null){
                s+= "Indice: "+ (i+1) + m[i].toString() ;
            }
        }
        JOptionPane.showMessageDialog(null,s);
    }
    static int calcularPrecio(float menor, Vuelo[] v){
        int ind = 0;
        for (int i = 0; i < v.length; i++) {
            if(v[i] != null){
                if(menor > v[i].getPrecio()){
                    menor = v[i].getPrecio();
                    ind = i;
                }
            }
        }
        return ind;
    }
    static void aumentarPrecio(float per,Vuelo[] v){
        float percentage = (per/100) + 1;
        for (int i = 0; i < v.length; i++) {
            if(v[i]!= null){
                if(v[i].getCiudadDestino().equalsIgnoreCase("paris")){
                    v[i].setPrecio(v[i].getPrecio() * percentage);
                }
            }
        }
    }
}
