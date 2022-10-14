public class List<E> {
    Node list;
    public List(){
        list = null;
    }

    public void add(E x){
        Node nu = new Node(x);
        if(list == null){
            list = nu;
        }else{
            nu.next = list;
            list = nu;
        }
    }

    public void getList(){
        Node q = list;
        while(q!= null){
            System.out.print(q.data + "\t");
            q = q.next;
        }
    }
}
class Node<E>{
    Node next;
    E data;
    public Node(E data){
        this.data = data;
        next = null;
    }
}
