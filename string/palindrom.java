package string;

import java.util.Scanner;
import java.util.*;

public class palindrom {
public  static boolean checkPalindrom(String name){
    for(int i = 0;i<name.length()/2;i++){
        if(name.charAt(i)!=name.charAt(name.length()-1-i)){
          
            return false;



        }
    }
 
    return true;

}

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
       
        System.out.println(checkPalindrom(name));
    }
}
