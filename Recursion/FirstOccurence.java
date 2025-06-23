package Recursion;

public class FirstOccurence {
    public static int  fo(int arr[], int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
            
        }else{
            return fo(arr, key, i+1);
        }

    }
    public static void main (String args[]){
        int arr[] = {1,2,4,3,56,4,5,3,7,5};
        int key =51;
        System.out.println(fo(arr, key, 0));
    }
    
}
