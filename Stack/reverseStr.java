package Stack;
import java.util.*;

public class reverseStr {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
       
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            s.push(ch);
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
              char curr = s.pop();
        result.append(curr);

            
        }
        return result.toString();
      
    }
    public static void main(String[] args) {
        String str = "rst";
        String result = reverseString(str);
        System.out.println(result);
        
    }
    
}
