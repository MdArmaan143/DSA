package Recursion;

import java.util.Scanner;

public class Recursion {

    static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the factorial you want :");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("factorial of " + n + " is " + result);
    }
    
}
