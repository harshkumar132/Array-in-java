//Write a method that returns the sum of all elements in an ArrayList of integers.
import java.util.ArrayList;
public class array_list_exer4 {
public static void sum(ArrayList<Integer> line){
    int add=0;
    for(int i=0;i<line.size();i++){
    add+=line.get(i);
    }
    System.out.println("the sum of all element is "+ add);
}




    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
       sum(list);
        
    }
    
}
