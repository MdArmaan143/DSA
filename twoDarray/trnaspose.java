package twoDarray;

public class trnaspose {
    
    
        public static void main(String[] args) {
            int arr[][] = {
                {1, 2, 3},
                {4, 5, 6}
            };
    
            int rows = arr.length;
            int cols = arr[0].length;
    
            int transpose[][] = new int[cols][rows];
    
            // Transpose logic
            for(int i = 0; i < rows; i++) {
                for(int j = 0; j < cols; j++) {
                    transpose[j][i] = arr[i][j];
                }
            }
    
            // Print transpose
            System.out.println("Transpose:");
            for(int i = 0; i < transpose.length; i++) {
                for(int j = 0; j < transpose[0].length; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    

