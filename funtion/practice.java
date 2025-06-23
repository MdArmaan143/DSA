package funtion;

import java.util.Scanner;

public class practice {
    public static void swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("your first number is a = " + a);
        System.out.println("your second  number is b = " + b);
   
    }       
   
    public static void main (String args[]){
        Scanner sc = new Scanner ( System.in);
        System.out.print("enter your fisrt number a : ");
        int a = sc.nextInt();
        System.out.print("enter your second number b : ");
        int b = sc.nextInt();

        swap(a, b);

        

    }
}
