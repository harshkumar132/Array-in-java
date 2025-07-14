//  Find the maximum and minimum numbers from an ArrayList of integers.
import java.util.ArrayList;
public  class array_list_exer3{
    public static void maximum_and_min(ArrayList<Integer> line){
        int max=0;
        int min= line.get(0);
        for(int i=0;i<line.size();i++){
        
        
        if(max<line.get(i)){
            max=line.get(i);
        }
        
        if (min>line.get(i)){
            min=line.get(i);
        }
        
    }
    System.out.println("the min num in list is"+ min);
    System.out.println("the max num in list is"+ max);
    }

    public static void main(String args[]){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(6);
        list.add(76);
        list.add(54);
        list.add(34);
        System.out.println(list);
        maximum_and_min(list);




    }
    
}
