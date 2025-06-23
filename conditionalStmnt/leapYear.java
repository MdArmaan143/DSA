package conditionalStmnt;

import java.util.Scanner;

public class leapYear {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int Year = sc.nextInt();

        if(Year%4==0){
            System.out.print("Thois year is leap year ! ");

        }else{
            System.out.print("this year is not leap year year !");
        }

    }
    
}
    