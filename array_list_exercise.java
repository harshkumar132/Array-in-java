 //Create an ArrayList of integers, add 5 numbers, and print them using a loop.
 import java.util.ArrayList;
public class array_list_exercise {


public static void main(String args[]){
ArrayList<Integer> list= new ArrayList<>();
list.add(1);
list.add(2);
list.add(5);
list.add(8);
list.add(9);
list.add(10);


for(int i=0;i<list.size();i++){
    System.out.println(list.get(i));
}

}
    
}
