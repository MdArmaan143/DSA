package funtion;

import java.util.Scanner;

public class palindrom {
    public static boolean checkPalindrom(int n){
        int rev = 0;
        int number = n;
        
        while(number>0){
            int lastDigit = number%10; 
           
            rev = rev*10+lastDigit;
            number = number/10;
           
            

        }
        System.out.println(rev);
      
       
        if(rev == n ){
            return true;
            
            
            }else{
                return false;
            }
        }
    

    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        boolean answer = checkPalindrom(n);
        System.out.println(answer);
        
        
    }
    
}
