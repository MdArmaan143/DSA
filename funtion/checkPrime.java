package funtion;

import java.util.Scanner;

public class checkPrime {

public static void prime(int n){
    if(n==2){
        System.out.println("number is prime ! ");
    }else{
        boolean isPrime = true;

        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("this is prime number ! ");

        }else{
            System.out.println("this is not a prime number ! ");
        }
    }

}

    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter your number : ");
        int n = sc.nextInt();

       prime(n);
    }
    
}
