package patterns1;

import java.util.Scanner;

public class halfPyramid {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the number of rows : ");
        int rows = sc.nextInt();
        char ch = 'A';

        for(int i = 1;i<=rows;i++){
            for(int j= 1; j<=i;j++){
                System.out.print(ch);
                ch++;
               
            }
            System.out.println();
          
        }
    }
    
}
