package Recursion;

public class DecreasingNum {
    // decreasing Number
    static void decNum(int n){
        if(n==1){
            System.out.print(n + " ");
            return;

        }
      
       System.out.print(n + " ");
       decNum(n-1);
   

    }
    // increasing Number
    public static void incNum(int n){
        
        if(n==1){
            System.out.print(n + " ");
            return;

        }
      
        incNum(n-1);
        System.out.print(n + " ");
    
       
    }
    //sum of N natural Number
    public static int sumN(int n){
        if(n==1){
            return 1;
        }else{
            return n + sumN(n-1);
        }
    }
    public static void main(String args[]){
        int n = 5;
    //    decNum(n);
    //    incNum(n);
    int result = sumN(n);
    System.out.println(result);
      

    }
    
}
