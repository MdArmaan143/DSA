package Recursion;

public class Assignment {
    public static void ouccurence(int arr[] ,int key,int idx){


       //base 
       if(idx==arr.length){
        return;
       }
       //kaam
       int currEle = arr[idx];
       if(currEle==key){
        System.out.print(idx + " ");
        ouccurence(arr, key, idx+1);
       }else{
        ouccurence(arr, key, idx+1);
       }
    }

    public static void main (String args[]){
        int arr[] =  {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        ouccurence(arr, 2,0);
    }
    
}
