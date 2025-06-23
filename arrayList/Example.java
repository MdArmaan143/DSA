package arrayList;

import java.util.ArrayList;

public class Example {
     public static void main(String[] args) {
        ArrayList<Integer> fruits = new ArrayList<>();

        fruits.add(1);
        fruits.add(2);
        fruits.add(4);
        fruits.add(7);

        int largest = Integer.MIN_VALUE;

        for(int i = fruits.size()-1 ; i>=0;i--){
           if(largest<fruits.get(i)){
            largest = fruits.get(i);
           }

        }
         System.out.println(largest);

        
    }

    
}
