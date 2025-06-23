package conditionalStmnt;
import java.util.*;

public class ifElseCondition {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr Your age : ");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.print("You are eligible for vote : ");
        }else{
            System.out.print("You are under 18,So You are not eligible for vote ");
        }
    }
    
}
