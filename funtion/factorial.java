package funtion;

import java.util.Scanner;

public class factorial {

    public static void fact(int number){
        int product = 1;
        for(int i = 1;i<=number;i++){
            product = product*i;
           
        }
        System.out.println(product);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number : ");
        int number = sc.nextInt();
        

        fact(number);
    }
    
}
