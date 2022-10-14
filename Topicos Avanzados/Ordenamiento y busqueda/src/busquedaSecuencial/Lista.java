package busquedaSecuencial;

public class Lista {
    Nodo lista;
    public Lista(){
        lista = null;
    }

    public void agregaElemento(int x){
        Nodo nuevo = new Nodo(x);
        if(lista == null){
            lista = nuevo;
        }else{
            nuevo.next = lista;
            lista = nuevo;
        }
    }
    public void agregaAlFinal(int x){
        Nodo nuevo = new Nodo(x);
        if(lista == null){
            lista = nuevo;
        }else{ //Recorre la lista hasta el final
            Nodo p = lista;
            while(p.next != null){
                p = p.next;
            }
            //Agrega el nuevo nodo al final
            p.next = nuevo;
        }
    }
    public int busquedaElemento(int x){
        Nodo p = lista;
        if(lista == null){
            return -1; //Se regresa un -1 cuando no se encuentra el elemento
        }else{
            int i = 0;
            while(p!= null){
                if(p.data == x){
                    break; //para romper el ciclo
                }else{
                    i++;
                    p = p.next; //siguiente nodo
                }
            }
            if(p == null)
                return -1;
            else
                return i;
        }
    }

    public void getLista(){
        Nodo p = lista;
        while(p!=null){
            System.out.print(p.data + "\t");
            p = p.next;
        }
    }
}
