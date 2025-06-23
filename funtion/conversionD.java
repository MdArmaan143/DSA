package funtion;

import java.util.Scanner;

public class conversionD {
    public static void decimalTObinary(int n){
        int bin = 0;
        int power = 0;
        while(n>0){
            int rem = n%2;
            bin = bin + (int)(rem*Math.pow(10, power));
            power++;
            n = n/2;

        }
        System.out.println("your binary number is = " + bin);

    }
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enetr your decimal number = ");
        int n = sc.nextInt();

        decimalTObinary(n);

    }
    
}
