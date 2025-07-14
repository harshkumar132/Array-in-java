import java.util.ArrayList;
import java.util.Collections;
public class list{
    public static void main(String[] args) {
        ArrayList<Integer> line = new ArrayList<>();
        //add element in array list
        line.add(1);
        line.add(2);
        line.add(3);

        System.out.println(line);

        // get element
        int element = line.get(0);
        System.out.println(element);

        // add element between array list
        line.add(0,7);
        System.out.println(line);


        //to change elemnt from array list 
        line.set(2,10);
        System.out.println(line);

        line.remove(1);
        System.out.println(line);


        //size of array list
        System.out.println(line.size());
        
        // sorting
         Collections.sort(line);
        System.out.println(line);
        
    }
}