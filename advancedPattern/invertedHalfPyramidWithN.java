package advancedPattern;

import java.util.Scanner;

public class invertedHalfPyramidWithN {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the number of row :");
        int row = sc.nextInt();
        
        for(int i = 1;i<=row;i++){
            for(int j = 1;j<=row+1-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
