package twoDarray;

import java.util.Scanner;

public class practice {

//largest and smallest element in array
public static void largestSmall(int arr[][]){
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    for(int i = 0;i<arr.length;i++ ){
        for(int j = 0;j<arr[i].length;j++){
           if(largest<arr[i][j]){
            largest = arr[i][j];
           
           }
          
        }
       
    }
    for(int i = 0;i<arr.length;i++ ){
        for(int j = 0;j<arr[i].length;j++){
           if(smallest>arr[i][j]){
            smallest = arr[i][j];
           
           }
          
        }
       
    }
    System.out.println(largest);
    System.out.println(smallest);


}

    public static void main (String args[]){
        int arr[][] = new int[3][3];
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
        largestSmall(arr);
    }
}
