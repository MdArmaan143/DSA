import java.util.Scanner;

public class invertedhalfpyramid{

    public static void pyramid(int row ,int col){



        for(int i = 1;i<=row; i++){
            for(int j = 1; j<=row +1 - i ;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a row :");
        int row = sc.nextInt();
        System.out.print("enter a col :");
        int col = sc.nextInt();
        pyramid(row, col);
    }
}