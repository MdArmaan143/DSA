package twoDarray;

import java.util.Scanner;

public class diagonalM {
public static int dSum(int arr[][]){
    int sum = 0;
    for(int i=0;i<arr.length;i++){
        sum +=arr[i][i];
        if(i!=arr.length-1-i){
            sum +=arr[i][arr.length-1-i];
        }
    }
    return sum;
}

     public static void main (String args[]){
        int arr[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);

        //input
        for(int i = 0;i<arr.length;i++ ){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }


        //traverse

        for(int i = 0;i<arr.length;i++ ){
            for(int j = 0;j<arr[i].length;j++){
               System.out.print(arr[i][j] + " ");
            }
            System.err.println();
        }

        int result = dSum(arr);
        System.out.println(result);
    
    }
}


    

