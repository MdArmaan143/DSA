package twoDarray;
import java.util.Scanner;
public class creation {

public static boolean search(int arr[][], int key){
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==key){
                System.out.println("found at cell (" + i + " ," + j + ")");
                return true;
            }

        }
     
    }
    System.out.println("key not found");
    return false;
}


    public static void main (String args[]){
        int arr[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
       

        for(int i = 0;i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //trverse

        for(int i = 0;i<arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int key = sc.nextInt();
            search(arr,key);
    }
     
    
}
