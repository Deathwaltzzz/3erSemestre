import java.util.ArrayList;

public class MyList <E>{
    private ArrayList<E> list;

    public MyList(){
        list = new ArrayList<>();
    }
    public void insertLast(E element){
        list.add(element);
    }
    public String toString(){
        return list.toString();
    }
}
