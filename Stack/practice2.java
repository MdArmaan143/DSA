package Stack;
import java.util.*;
public class practice2 {
    public static int[] nxtGtr(int arr[],int nxtGreater[]){
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length-1;i>=0;i--){
            while (!s.isEmpty() && arr[s.peek()]<= arr[i]) {
                s.pop();
                
            }
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else{
             
               nxtGreater[i] = arr[s.peek()];
            }
            s.push(i);

        }
        return nxtGreater;
    }
    public static void main(String[] args) {
        int arr[] = {6,2,8,0,1,3};
        int nxtGreater[] = new int[arr.length];

        int result[] = nxtGtr(arr, nxtGreater);

        for(int i = 0;i<result.length;i++){
            System.out.print(result[i] + " ");
        }



    }
    
}
