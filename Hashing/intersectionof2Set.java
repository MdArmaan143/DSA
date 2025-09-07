package Hashing;

import java.util.HashSet;

public class intersectionof2Set {
    public static void main(String args[]){
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> set = new HashSet<>();

        //union
        // for(int i = 0;i<arr1.length;i++){
        //     set.add(arr1[i]);
        // }
        
        // for(int i = 0;i<arr2.length;i++){
        //     set.add(arr2[i]);
        // }
        // System.out.println(set);
        // System.out.println(set.size());

        //intersection
        set.clear();

         for(int i = 0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int count = 0;
        for(int i =0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
               System.out.println(arr2[i]); 
               set.remove(arr2[i]);

            }

        }
        System.out.println(count);
     

    }
    
}
