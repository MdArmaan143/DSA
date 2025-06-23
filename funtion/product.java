package funtion;

import java.util.Scanner;

public class product {

    public static void prodduct(int a, int b){
        int product = a*b;
        System.out.println("product of a and b is = " + product);

    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the first number a = ");
        int a = sc.nextInt();
        System.out.println("enter the first number b = ");
        int b = sc.nextInt();

        prodduct(a,b);
    }
    
}
