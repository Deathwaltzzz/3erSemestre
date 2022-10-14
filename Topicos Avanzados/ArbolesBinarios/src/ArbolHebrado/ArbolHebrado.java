package ArbolHebrado;

public class ArbolHebrado {
    Hebra raiz;
    public ArbolHebrado(){
        raiz = null;
    }

    //Retorna el apuntador del arbol hebrado
    public Hebra getRaiz(){
        return raiz;
    }
    public void crearArbolHebrado(int x){
        Hebra p,q;
        if(raiz == null)
            raiz = new Hebra(x);
        else{
            p = raiz;
            q = raiz;
            while(q != null && p.enlace == 0){
                p = q;
                if(x<p.info)
                    q = p.izquierdo; //avanza al hijo izquierdo
                else
                    q = p.derecho; //avanza al hijo derecho
            }
            if(x<p.info)
                hijoIzquierdo(p,x);
            else
                hijoDerecho(p,x);
        }
    }
    public void hijoIzquierdo(Hebra p, int x){
        Hebra q = new Hebra(x);
        p.izquierdo = q;
        /*El sucesor entre orden del nodo q es el nodo p*/
        q.derecho = p;
        q.enlace = 1;
    }
    public void hijoDerecho(Hebra p, int x){
        Hebra q = new Hebra(x);
        /*Guardar el nuevo sucesor en entreorden del nodo p*/
        Hebra r = p.derecho;
        p.derecho = q;
        p.enlace = 0;
        q.izquierdo = null;
        /*El sucesor entreorden del nodo q es el sucesor del nodo previo p*/
        q.derecho = r;
        if(r!=null){
            q.enlace = 1;
        }else{
            q.enlace = 0;
        }
    }

    public void entreOrden(){
        Hebra p,q;
        p = raiz;
        do{
            q = null;
            while(p!= null){
                q = p;
                p = p.izquierdo;
            }
            if(q!=null){
                System.out.print("\t" + q.info);
                p = q.derecho;
                while(q.enlace == 1 && p != null){
                    System.out.print("\t" + p.info);
                    q = p;
                    p = p.derecho;
                }
            }
        }while(q!=null);
    }
}
