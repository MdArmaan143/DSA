package twoDarray;

public class searchinsortedarray {

public static boolean staircase(int arr[][], int key){
    int row = 0;
    int col = arr.length-1;

    while (row<arr.length && col>=0) {
        if(key==arr[row][col]){
            System.out.println("found at (" + row + " , " + col + ")" );
            return true;
        }else if(key<arr[row][col]){
            col--;
        }else{
            row++;
        }

        
    }
    System.out.println("not found!");
    return false;
}

    public static void main(String args[]){
        int arr[][] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}
                    };
              int key = 50; 
              
              staircase(arr, key);

    } 
    
}
