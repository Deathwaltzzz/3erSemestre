public class PilaVuelos { //Leonardo Contreras Martinez
    Vuelo[] p;
    int tope;
    public PilaVuelos(){
        p = new Vuelo[5];
        tope = -1;
    }
    public PilaVuelos(int n){
        p = new Vuelo[n];
        tope = -1;
    }

    public Vuelo[] getP() {
        return p;
    }

    public void setP(Vuelo[] p) {
        this.p = p;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public void insertar(Vuelo nuevo){
        if(!estaLlena()){
            tope++;
            p[tope] = nuevo;
        }
    }

    public Vuelo eliminar(){
        Vuelo borrado = null;
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

    public Vuelo datoEnTope() {
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
