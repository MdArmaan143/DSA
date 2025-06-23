package Loops;

import java.util.Scanner;

public class reverseNum {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ");
        int number = sc.nextInt();
        int rev = 0;
        while(number>0){
            
            int lastDigit = number%10;
             rev = (10*rev) + lastDigit;
            number = number/10;

    
        }
        System.out.println(rev);
        
    }
    
}
