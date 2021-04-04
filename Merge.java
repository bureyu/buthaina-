import java.util.ArrayList;

/**
 * Created by Alia on 28/02/2021.
 */
public class Merge {
    public static void main(String[] args) {
        ArrayList<Object> list1=new ArrayList<>();
        list1.add("hello");
        list1.add("there");
        System.out.println("Arraylist1: " +list1);
        ArrayList<Object>list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("Arraylist2: " +list2);
        list1.addALL(list2);
        System.out.println("the two array list: " + list1);
    }
}
