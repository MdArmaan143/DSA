package advancedPattern;

import java.util.Scanner;

public class floyedsTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of row : ");
        int row = sc.nextInt();
        int counter = 1;
         for(int i = 1; i<=row;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(counter +" ");
                counter++;

            }
            System.out.println();
         }

    }
    
}
