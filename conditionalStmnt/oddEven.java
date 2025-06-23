package conditionalStmnt;

import java.util.Scanner;

public class oddEven {
    public static void main ( String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Your number : ");
        int number = sc. nextInt();

        if(number%2==0){
            System.out.print("number is even ! ");
        }else{
            System.out.print("number is odd ! ");
        }
    }
}