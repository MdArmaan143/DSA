package funtion;

import java.util.Scanner;

public class practice2 {
    public static void evenOdd(int n){
        if(n%2==0){
            System.out.println("number is Even ! ");
        }else {
            System.err.println("number is Odd ! ");
        }

    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter your number : ");
        int n = sc.nextInt(); 
        evenOdd(n);
    }
    
}
