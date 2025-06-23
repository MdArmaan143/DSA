package bitManipulation;

import java.util.Scanner;

public class operation {

    public static int oddEven(int n,int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }



    public static void main(String args[]){
      
        System.out.println(oddEven(10, 1));

       

    }
    
}
