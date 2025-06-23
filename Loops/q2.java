package Loops;

import java.util.Scanner;

public class q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int EvenSum = 0;
        int OddSum = 0;
        int choice ;
        
        do{
            System.out.print("enter your number : ");
        int number = sc.nextInt();
        if(number%2==0){
            EvenSum = EvenSum + number;
        }else{
            OddSum = OddSum + number;
        }
        System.out.print("you wanty to add some other number if yes then press 1,otherwise press 0. ");
         choice = sc.nextInt();

        }while(choice==1);
        System.out.println("sum of even Number = " + EvenSum);
        System.out.println("sum of odd Number = " + OddSum);
    }
    
}
