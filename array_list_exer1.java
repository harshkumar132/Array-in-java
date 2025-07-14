//Check whether a specific element exists in an ArrayList or not.


import java.util.ArrayList;




public class array_list_exer1{
    public static void main(String args[]){

        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(23);
        list.add(76);

        int check=5;
        boolean found =false;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==check){
                found=true;
                break;
            }
        }

            if(found==true){
                System.out.println("yes "+check+ " is exist in the list");
            }
            else{
                System.out.println(check+" does not exist in the array list");
            }
               




    }
}
