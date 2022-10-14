import javax.swing.*;
import java.util.Random;

public class ExamenU1 { //Leonardo Contreras Martinez
    public static void main(String[] args) throws InterruptedException {
        Articulo[] abarrotes = new Articulo[8];
        boolean conf;
        String descripcion; int cantidad; float precio, sum = 0;
        int opc = 0, cont = 0;
        String menu = "1. Captura de un articulo " +
                "\n2. Mostrar datos de un articulo" +
                "\n3. Total de inventario"+
                "\n4. Buscar articulo."+
                "\n5. Manejo de una matriz" +
                "\n6. Terminar";
        while(opc != 6){
            opc = Integer.parseInt(JOptionPane.showInputDialog(null,menu));
            if(opc !=6){
                switch (opc){
                    case 1:
                        if(cont < abarrotes.length){
                            descripcion = JOptionPane.showInputDialog(null,"Descripcion del articulo");
                            cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad"));
                            precio = Float.parseFloat(JOptionPane.showInputDialog(null,"Precio del articulo:"));
                            abarrotes[cont] = new Articulo(descripcion,cantidad,precio);
                            cont ++;
                        }else{
                            JOptionPane.showMessageDialog(null,"No queda espacio");
                        }
                        break;
                    case 2:
                        for (int i = 0; i < abarrotes.length; i++) {
                            if(abarrotes[i] != null){
                                JOptionPane.showMessageDialog(null,abarrotes[i].toString() + "\nPosicion: " + (i+1));
                            }
                        }
                        break;
                    case 3:
                        sum = 0;
                        for (int i = 0; i < abarrotes.length; i++) {
                            if(abarrotes[i] != null){
                                float mult = abarrotes[i].getCantidad() * abarrotes[i].getPrecio();
                                sum += mult;
                            }
                        }
                        JOptionPane.showMessageDialog(null,"El total del inventario es: " + sum);
                        break;
                    case 4:
                        conf = false;
                        String desc = JOptionPane.showInputDialog(null,"Descripcion a buscar");
                        for (int i = 0; i < abarrotes.length && !conf; i++) {
                            if(abarrotes[i] != null){
                                if(abarrotes[i].getDescripcion().equalsIgnoreCase(desc)){
                                    JOptionPane.showMessageDialog(null,abarrotes[i].toString());
                                    conf = true;
                                }
                            }
                        }
                        if(!conf){
                            JOptionPane.showMessageDialog(null,"No existe ese articulo");
                        }
                        break;
                    case 5:
                        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"valor de n: "));
                        int[][] m = new int[n][n];
                        sum = 0;
                        Random r = new Random();
                        for (int i = 0; i < m.length; i++) {
                            for (int j = 0; j < m[i].length; j++) {
                                m[i][j] = r.nextInt(-5,5) + 1;
                            }
                        }
                        despliega(m);
                        int aux = m.length - 1;
                        for (int i = 0; i < m.length; i++) {
                            for (int j = 0; j < m.length; j++) {
                                /*
                                if(j == i){
                                    sum+= 0;
                                }else if(j == aux){
                                    sum+= 0;
                                }else{
                                    sum+= m[i][j];
                                }
                                */
                                if( j!= i && j != aux){
                                    sum+= m[i][j];
                                }
                            }


                            System.out.println(sum);
                            aux = aux-1;
                        }
                        JOptionPane.showMessageDialog(null,"Suma: " + sum);
                        break;
                }
            }
        }
    }
    public static void despliega(int[][] m){
        String s = "";
        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m[i].length; j++) {
                s+= m[i][j] + " \t ";
            }
            s+= "\n";
        }
        JOptionPane.showMessageDialog(null,s);
    }
}
