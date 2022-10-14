import java.util.ArrayList;

public class AppTestGenericClass {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        myList.insertLast(1);
        myList.insertLast(2);
        myList.insertLast(3);
        System.out.println("This is an arrayList: "+ list);
        System.out.println("This is myList: "+ myList);
        MyList<String> myWordList = new MyList<>();
        myWordList.insertLast("Hello");
        myWordList.insertLast("Good afternoon");
        System.out.println("String list: " + myWordList);
    }
}
