package advancedPattern;

import java.util.Scanner;

public class solidRhombus {
    public static void main ( String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter number of rows : ");
        int row = sc.nextInt();
       

        for(int i = 1;i<=row;i++){
            for(int j = 1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=row;j++){
                if(i==1 || i==row || j==1 || j==row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
        }
        System.out.println();
    
}
    }
}
