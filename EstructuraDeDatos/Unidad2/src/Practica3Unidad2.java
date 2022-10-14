import javax.swing.*;
public class Practica3Unidad2 {
    public static void main(String[] args) {
        float dato1=0, dato2=0;
        String operacion = JOptionPane.showInputDialog(null,"ingrese la operacion");
        PilaFloat pila = new PilaFloat(operacion.length());

        for(int i=0; i < operacion.length(); i++){
            switch (prioridad(operacion.charAt(i))){
                case 0:
                    pila.insertar(Float.parseFloat(String.valueOf(operacion.charAt(i))));
                    break;
                case 1:
                    dato1 = pila.datoEnTope();
                    pila.eliminar();
                    dato2 = pila.datoEnTope();
                    pila.eliminar();
                    pila.insertar(dato2 + dato1);
                    break;
                case 2:
                    dato1 = pila.datoEnTope();
                    pila.eliminar();
                    dato2 = pila.datoEnTope();
                    pila.eliminar();
                    pila.insertar(dato2 - dato1);
                    break;
                case 3:
                    dato1 = pila.datoEnTope();
                    pila.eliminar();
                    dato2 = pila.datoEnTope();
                    pila.eliminar();
                    pila.insertar(dato2 * dato1);
                    break;
                case 4:
                    dato1 = pila.datoEnTope();
                    pila.eliminar();
                    dato2 = pila.datoEnTope();
                    pila.eliminar();
                    pila.insertar(dato2 / dato1);
                    break;
                case 5:
                    dato1 = pila.datoEnTope();
                    pila.eliminar();
                    dato2 = pila.datoEnTope();
                    pila.eliminar();
                    pila.insertar((float)Math.pow(dato2,dato1));
                    break;
                case 6:
                    break;
            }

        }

        JOptionPane.showMessageDialog(null,"La expresión evaluada es: " + operacion +"\nEl resultado es: " + pila.datoEnTope());
    }

    public static int prioridad(char c){
        int regreso=0;
        String[] vector = new String[]{"+","-","*","/","^"," "};
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length(); j++) {
                if (c == vector[i].charAt(j)){
                    regreso=(i+1);
                }
            }
        }
        return regreso;
    }
}
