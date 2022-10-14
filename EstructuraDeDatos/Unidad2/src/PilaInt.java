public class PilaInt {
    //atributos
    private int[]p;
    private int tope;

    //1er constructor, genera una pila de 5 casillas
    public PilaInt(){
        p = new int[5];
        tope = -1;
    }

    public PilaInt(int n){
        p = new int[n];
        tope = -1;
    }

    public int[] getP() {
        return p;
    }

    public void setP(int[] p) {
        this.p = p;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public void insertar(int nuevo){
        if(!estaLlena()){
            tope++;
            p[tope] = nuevo;
        }
    }

    public int eliminar(){
        int borrado = -99999;
        if(!estaVacia()){
            borrado = p[tope];
            p[tope] = 0;
            tope--;
        }
        return borrado;
    }
    public boolean estaVacia(){
        if(tope == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean estaLlena(){
        if(tope == p.length -1){
            return true;
        }else{
            return false;
        }
    }
    public int datoEnTope(){
        if(!estaVacia()){
            return p[tope];
        }else{
            return -99999;
        }
    }
    public int numElementos(){
        return tope+1;
    }

    public String toString(){
        String s = "Elementos en la pila: \n";
        for(int num: p){
            s+= num + "\n";
        }
        return s;
    }
}
