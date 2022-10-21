package Proyecto;

class Node<E> {
    E data;
    Node<E> next;
    public Node(E data){
        this.data = data;
        next = null;
    }
}
public class GenericList<E> {
    Node list;
    int index;
    public GenericList(){
        list = null;
        index = 0;
    }
    public void add(E x){
        Node nu = new Node(x);
        if(list == null){
            list = nu;
        }else{
            list.next = nu;
        }
        index++;
    }
    public void getList(){
        Node q = list;
        while(q!= null){
            System.out.print(q.data + "\t");
            q = q.next;
        }
    }
    public ArbolInt getIndex(int i){
        Node q = list;
        if(i == 0){
            return (ArbolInt) q.data;
        }
        for(int j = 0 ; j < i ; j++){
            if(j == i-1){
                q = q.next;
            }
        }
        return (ArbolInt) q.data;
    }
    public ArbolInt next(){
        Node q = list;

    }
}
