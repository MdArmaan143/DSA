package Loops;

import java.util.Scanner;

public class q3 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter your Number : ");
        int number = sc.nextInt();
        int fact = 1;

        for(int i = 1;i<=number;i++){
             fact = fact*i;
        }
        System.out.println("factorial of number is " + fact);
    }
    
}
