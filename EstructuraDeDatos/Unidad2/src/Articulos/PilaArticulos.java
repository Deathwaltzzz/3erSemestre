package Articulos;

public class PilaArticulos {
    Articulo[] p;
    int tope;
    public PilaArticulos(){
        p = new Articulo[5];
        tope = -1;
    }
    public PilaArticulos(int n){
        p = new Articulo[n];
        tope = -1;
    }

    public Articulo[] getP() {
        return p;
    }

    public void setP(Articulo[] p) {
        this.p = p;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public void insertar(Articulo nuevo){
        if(!estaLlena()){
            tope++;
            p[tope] = nuevo;
        }
    }

    public Articulo eliminar(){
        Articulo borrado = null;
        if(!estaVacia()){
            borrado = p[tope];
            p[tope] = null;
            tope--;
        }
        return borrado;
    }
    public boolean estaVacia() {
        if(tope==-1)
            return true;
        else
            return false;
    }

    public boolean estaLlena() {
        if(tope==p.length-1)
            return true;
        else
            return false;
    }

    public Articulo datoEnTope() {
        if(!estaVacia())
            return p[tope];
        else
            return null;
    }

    public int numElementos() {
        return tope+1;
    }

    public String toString() {
        String s="Elementos de la pila:\n";
        int i;
        for(i=tope; i>=0; i--) {
            s+=p[i]+"\n";
        }
        s+="Fin de la pila";
        return s;
    }

}
