//Search for a user-input element in an ArrayList and print its index if found

import java.util.ArrayList;
import java.util.Scanner;
public class array_list_exer5 {
    public static void main(String args[]){
        Scanner read=new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();
        list .add(5);
        list.add(7);
        list.add(76);
        list.add(68);
        list.add(65);

        System.out.println(list);
        boolean found=false;
        System.out.println("plaese enter the num which you want to search from the Array list");
        int Search=read.nextInt();
        int i;
        for( i=0;i<list.size();i++){
            if(list.get(i)==Search){
                found=true;
                break;
            }
        }





            if(found==true){
                System.out.println("yes the "+Search+ " no is in the array list at index no "+i);
            }
            else{
                System.out.println("the "+Search+ " no is not found in array list");
            }

        
        




    }
}
