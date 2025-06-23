package Recursion;

public class TilingP {
    public static int tilingPromlem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
            
        }
        // choice
        //verticle
        int fnm1 = tilingPromlem(n-1);

        //horizontal
        int fnm2 = tilingPromlem(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String args[]){
        System.out.println(tilingPromlem(4));

    }
    
}
