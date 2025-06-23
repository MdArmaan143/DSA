package conditionalStmnt;

import java.util.Scanner;

public class taxCalculator {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Your income : ");
        int income = sc.nextInt();

        if(income<500000){
            System.out.print("No Tax");
        }else if (income>500000 && income<1000000){
            System.out.print(" 20% Tax : " + income + " 20% Tax added " + (income*0.2));
        }else{
            System.out.print("30% Tax : " + income + " 30% Tax added " + (income*0.3));
        }
    }
}
