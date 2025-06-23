package funtion;

import java.util.Scanner;

public class conversinB {

    public static void binaryToDecimal(int n){
        int decimal = 0;
        int power = 0;
        while (n>0) {
           int lastDigit = n%10;
            decimal = decimal + (int)(lastDigit*Math.pow(2,power));
            n = n/10;
            power++;
        }
        System.out.print("Your decimal number is = " + decimal);

    }

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your binary Number : ");
        int n = sc.nextInt();
        binaryToDecimal(n);

    }
    
}
