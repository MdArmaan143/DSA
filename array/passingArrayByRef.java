package array;

import java.util.Scanner;

public class passingArrayByRef {
    public static void changeArray(int marks[]){
        for(int i = 0;i<marks.length;i++){
           marks[i] = marks[i] + 1;
           System.out.print(marks[i] +" ");
        }
    }

    public static void main(String args[]){
        int marks[] = {1,2,3,4,5,6,7,8,9};
       
       for(int i = 0;i<marks.length;i++){
        System.out.print(marks[i] + " ");
       }
       System.out.println();
       changeArray(marks);
       System.out.println();
       for(int i = 0;i<marks.length;i++){
        System.out.print(marks[i] + " ");
       }
    }
    
}
