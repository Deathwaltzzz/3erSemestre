package Proyecto;

public class NodoInt {
    int info;
    NodoInt izquierdo, derecho;

    public NodoInt(int dato){
        info = dato;
        izquierdo = null;
        derecho = null;
    }
}
class NodoStr{
    String info;
    NodoStr izquierdo,derecho;
    NodoInt pag;
    public NodoStr(String dato){
        info = dato;
        izquierdo = null;
        derecho = null;
        pag = null;
    }
}
