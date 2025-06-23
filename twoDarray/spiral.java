package twoDarray;

import java.util.Scanner;

public class spiral {
public static void spiralMatrix(int arr[][]){
    int startRow = 0;
    int startcol = 0;
    int endRow = arr.length-1;
    int endCol = arr[0].length-1;

    while(startRow<=endRow && startcol<=endCol){
        //top
        for(int j = startcol;j<=endCol;j++){
            System.out.print(arr[startRow][j] + " ");
        }

        //right
        for(int i = startRow+1;i<=endRow;i++){
            System.out.print(arr[i][endCol] + " ");
        }

        //bottam
        for(int j = endCol-1;j>=startcol;j--){
            if(startRow==endRow){ 
                break;
            }
            System.out.print(arr[endRow][j] + " ");
        }

        //left
        for(int i = endRow-1;i>=startRow+1;i--){
            if(startcol==endCol){
                break;
            }
            System.out.print(arr[i][startcol] + " ");
        }
        startRow++;
        startcol++;
        endRow--;
        endCol--;
    }
    System.out.println();
}

    public static void main (String args[]){
        int arr[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);

        //input array
        for(int i = 0; i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //treverse
        for(int i = 0; i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
              System.out.print(  arr[i][j] + " ");
            }
            System.out.println();

        }


        //output
        System.out.print("output : ");
        spiralMatrix(arr);

    }
    
}
