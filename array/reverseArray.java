package array;

public class reverseArray {
    public static void main (String args[]){
        int arr[] = {2,4,6,8,10};
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        for(int i = arr.length-1 ;i>=0;i--){
            System.out.print(arr[i] +" ");
        }

    }
    
}
// time complexcity and space complexcity o(n)
