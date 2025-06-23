package advancedPattern;

import java.util.Scanner;

public class invertednRotetedHalfPyramid {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter number of rows : ");
        int row = sc.nextInt();

        for(int i = row;i>=1;i--){
            for(int j = 1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j= 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
