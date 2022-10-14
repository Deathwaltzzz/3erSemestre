package ArbolHebrado;

public class Hebra {
    int info; //informacion del nodo
    Hebra izquierdo; //apuntador hijo izquierdo
    Hebra derecho; //apuntador hijo derecho
    int enlace; //Indica si es nodo hebra

    /*Constructor*/
    public Hebra(int x){
        info = x;
        izquierdo = null;
        derecho = null;
        enlace = 1;
    }
}
