package string;

public class stringCompreesion {

 public static String compression(String str){
    StringBuilder sb = new StringBuilder("");

    for(int i = 0;i<str.length();i++){
        int count = 1;
        while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
            count++;
            i++;
        }
        sb.append(str.charAt(i));
        if(count>1){
          sb.append(count);
        }
    }
    return sb.toString() ;

 }


    public static void main(String args[]){
        String str = "abcd";

        System.out.print(compression(str));
    }
    
}
