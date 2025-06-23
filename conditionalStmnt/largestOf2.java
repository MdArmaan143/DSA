package conditionalStmnt;

import java.util.Scanner;

public class largestOf2 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter  Number1 ");
        int number1 = sc.nextInt();
        System.out.print("Enter Number2 ");
        int number2 = sc.nextInt();

        if(number1>number2){
            System.out.print("number1 is greater!");
        } else if(number1>=number2){
            System.out.print("number1 and number2 is same! ");
        }
        else{
            System.out.print("Number2 is greater!");
        }
    }
    
}
