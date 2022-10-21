package Proyecto;

class Node {
    ArbolInt data;
    Node next;
    public Node(ArbolInt data){
        this.data = data;
        next = null;
    }
}
public class ArbolIntList {
    Node list;
    int index;
    public ArbolIntList(){
        list = null;
        index = 0;
    }
    public void add(ArbolInt x){
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
            return q.data;
        }
        for(int j = 0 ; j < i ; j++){
            if(j == i-1){
                q = q.next;
            }
        }
        return q.data;
    }
}
