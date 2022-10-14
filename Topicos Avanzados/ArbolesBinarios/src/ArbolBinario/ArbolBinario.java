package ArbolBinario;

public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario(){
        raiz = null;
    }
    //Genera un nuevo hijo izquierdo
    public void hijoIzquierdo(Nodo p, int x){
        p.izquierdo = new Nodo(x);
    }
    //Genera un nuevo hijo derecho
    public void hijoDerecho(Nodo p, int x){
        p.derecho = new Nodo(x);
    }
    //Retorna la raiz del arbol
    public Nodo getRaiz(){
        return raiz;
    }

    public void creaArbolBinario(int x){
        Nodo p,q;
        if(raiz == null)
            raiz = new Nodo(x);
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
                hijoIzquierdo(p,x); //Genera nuevo hijo izquierdo del nodo P
            else
                hijoDerecho(p,x); //Genera nuevo hijo derecho del nodo p
        }
    }
    public void preOrden(Nodo p){
        if(p!= null){
            System.out.print(p.info + "\t");
            preOrden(p.izquierdo);
            preOrden(p.derecho);
        }
    }
    public void entreOrden(Nodo p){
        if(p!= null){
            entreOrden(p.izquierdo);
            System.out.print(p.info + "\t");
            entreOrden(p.derecho);
        }
    }
    public void posOrden(Nodo p){
        if(p!= null){
            posOrden(p.izquierdo);
            posOrden(p.derecho);
            System.out.print(p.info + "\t"    );
        }
    }
}
