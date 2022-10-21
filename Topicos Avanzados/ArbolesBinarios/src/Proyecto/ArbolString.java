package Proyecto;

import javax.swing.*;

public class ArbolString {
    NodoStr raiz;
    public ArbolString(){
        raiz = null;
    }
    //Genera un nuevo hijo izquierdo
    public void hijoIzquierdo(NodoStr p, String x){
        p.izquierdo = new NodoStr(x);
        p.izquierdo.pag = generarPaginas(p);

    }
    //Genera un nuevo hijo derecho
    public void hijoDerecho(NodoStr p, String x){
        p.derecho = new NodoStr(x);
        p.derecho.pag = generarPaginas(p);
    }
    //Retorna la raiz del arbol
    public NodoStr getRaiz(){
        return raiz;
    }

    public void creaArbolBinario(String x){
        NodoStr p,q;
        NodoStr nuevo = raiz;
        if(raiz == null) {
            raiz = new NodoStr(x);
            nuevo = raiz;
            nuevo.pag = generarPaginas(nuevo);
        }
        else{
            p = nuevo;
            q = nuevo;
            while (q!= null){
                p = q;
                if((x.compareTo(p.info) < 0))
                    q = p.izquierdo;
                else
                    q = p.derecho;
            }
            if((x.compareTo(p.info) < 0)) {
                hijoIzquierdo(p, x); //Genera nuevo hijo izquierdo del nodo P
            }
            else {
                hijoDerecho(p, x); //Genera nuevo hijo derecho del nodo p
            }
        }
    }
    public void preOrden(NodoStr p){
        if(p!= null){
            System.out.print(p.info + "\t");
            preOrden(p.izquierdo);
            preOrden(p.derecho);
        }
    }
    public void entreOrden(NodoStr p){
        ArbolInt arbolInt = new ArbolInt();
        if(p!= null){
            entreOrden(p.izquierdo);
            System.out.print(p.info + "\t");
            arbolInt.entreOrden(p.pag);
            System.out.println();
            entreOrden(p.derecho);
        }
    }
    public void posOrden(NodoStr p){
        if(p!= null){
            posOrden(p.izquierdo);
            posOrden(p.derecho);
            System.out.print(p.info + "\t");
        }
    }
    public NodoInt generarPaginas(NodoStr p){
        ArbolInt arbolInt = new ArbolInt();
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Numero total de paginas"));
        for(int i = 1 ; i <= n ; i++){
            arbolInt.creaArbolBinario(Integer.parseInt(JOptionPane.showInputDialog(null,"Pagina numero " + i +": ")));
        }
        return arbolInt.getRaiz();
    }
}
