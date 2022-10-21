package Proyecto;

public class ArbolInt {
    NodoInt raiz;
    public ArbolInt(){
        raiz = null;
    }
    //Genera un nuevo hijo izquierdo
    public void hijoIzquierdo(NodoInt p, int x){
        p.izquierdo = new NodoInt(x);
    }
    //Genera un nuevo hijo derecho
    public void hijoDerecho(NodoInt p, int x){
        p.derecho = new NodoInt(x);
    }
    //Retorna la raiz del arbol
    public NodoInt getRaiz(){
        return raiz;
    }

    public void creaArbolBinario(int x){
        NodoInt p,q;
        if(raiz == null)
            raiz = new NodoInt(x);
        else{
            p = raiz;
            q = raiz;
            while (q!= null){
                p = q;
                if(x<p.info)
                    q = p.izquierdo;
                else
                    q = p.derecho;
            }
            if(x < p.info)
                hijoIzquierdo(p,x); //Genera nuevo hijo izquierdo del NodoInt P
            else
                hijoDerecho(p,x); //Genera nuevo hijo derecho del NodoInt p
        }
    }
    public void preOrden(NodoInt p){
        if(p!= null){
            System.out.print(p.info + "\t");
            preOrden(p.izquierdo);
            preOrden(p.derecho);
        }
    }
    public void entreOrden(NodoInt p){
        if(p!= null){
            entreOrden(p.izquierdo);
            System.out.print(p.info + "\t");
            entreOrden(p.derecho);
        }
    }
    public void posOrden(NodoInt p){
        if(p!= null){
            posOrden(p.izquierdo);
            posOrden(p.derecho);
            System.out.print(p.info + "\t"    );
        }
    }
}
