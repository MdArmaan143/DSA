package backTracking;

public class sudoku {

    public static boolean isSafe(int sudok[][],int row,int col, int digit){
        //column
        for(int i = 0;i<=8;i++){
            if(sudok[i][col]==digit){
                return false;
            }
        }

        //row
        for(int j = 0;j<=8;j++){
            if(sudok[row][j]==digit){
                return false;
            }
        }

        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudok[i][j]==digit){
                return false;
            }
            }
        }
        return true;
    }

public static boolean sudokuSolver(int sudok[][], int row, int col ){
    //base case
    if(row==9){
        return true;
    }


    //recursion
    int nextRow = row, nextCol = col+1;
    if(col+1==9){
        nextRow = row+1;
        nextCol = 0;
    }

    if(sudok[row][col]!=0){
        return sudokuSolver(sudok, nextRow, nextCol);

    }

    for(int digit = 1; digit<=9; digit++){
        if(isSafe(sudok,row,col,digit)){
            sudok[row][col] = digit;
            
           if( sudokuSolver(sudok,nextRow , nextCol)){
            return true;
           }
           sudok[row][col] = 0;
        }
    }
    return false;

}
 
public static void prntsoduku(int sudok[][]){
    for(int i =0;i<9;i++){
        for(int j = 0;j<9;j++){
            System.out.print(sudok[i][j] + " ");
        }
            System.out.println();
    }
}
    public static void main (String args[]){
        int sudok[][] = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},

            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},

            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if(sudokuSolver(sudok,0,0)){
            System.out.println("solution exist");
            prntsoduku(sudok);
        }else{
            System.out.println("solution dose not exist");
        }
    }
    
}
