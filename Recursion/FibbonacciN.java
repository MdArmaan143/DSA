package Recursion;

public class FibbonacciN {
    public static int fibonacci(int n){
        if(n==0 || n==1){
        
            return n;
        }else{
          return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String args[]){
       System.out.print( fibonacci(5));

    }
    
}
