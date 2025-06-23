package array;

import java.util.Scanner;

public class basic {
    public static void main (String args[]){
        //initialize array
        int marks[] = new int[10];
        Scanner sc = new Scanner(System.in);

        //input array
        System.out.print("enter the marks of physics : ");
         marks[0] = sc.nextInt();
        System.out.print("enter the marks of chemistry : ");
        marks[1] = sc.nextInt();
        System.out.print("enter the marks of math : ");
        marks[2] = sc.nextInt();

        //output array

        System.out.println("pysics marks : "+ marks[0]);
        System.out.println("chemistry marks : "+ marks[1]);

        System.out.println("math marks : "+ marks[2]);

        //update array
        marks[2] = 25*2+10;
        System.out.println("math marks : "+ marks[2]);

        System.out.println("length of array marks : "+ marks.length);

    }
    
}
