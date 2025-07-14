//Remove the third element from an ArrayList and print the updated list.

import java.util.ArrayList;
public class array_list_exer2 {
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(7);
        list.add(19);
        System.out.println(list);

        System.out.println("After removing index no 2");
        list.remove(1);
        System.out.println(list);


    }
}
