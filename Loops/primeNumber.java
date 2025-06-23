package Loops;

import java.util.Scanner;

public class primeNumber {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number : ");
        int n = sc.nextInt();
        if(n==2){
            System.out.println("this is prime number ! ");

        }else{
            boolean isPrime = true;
            for(int i = 2;i<=Math.sqrt(n);i++){   //Math function are exist in java . util pakege
                if(n%i==0){
                  isPrime = false;
                }
                }
                if(isPrime){
                    System.out.println("this is prime");
                }else{
                    System.out.println("not prime");
                }

            }
        }
    }
    
