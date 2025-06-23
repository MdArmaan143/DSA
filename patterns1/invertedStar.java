package patterns1;

import java.util.Scanner;

public class invertedStar {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the number of rows : ");
        int rows = sc.nextInt();

        for(int i = 1;i<=rows; i++){
            for(int j= 1 ; j<=rows+1-i;j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
