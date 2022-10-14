package ArbolBinario;

public class appMain {
    public static void main(String[] args) {
        ArbolBinario arbolBinario = new ArbolBinario(); //Raiz es null

        //Crea el arbol binario
        arbolBinario.creaArbolBinario(432);
        arbolBinario.creaArbolBinario(320);
        arbolBinario.creaArbolBinario(543);

        //imprime contenido del arbol
        arbolBinario.entreOrden(arbolBinario.getRaiz());
    }
}
