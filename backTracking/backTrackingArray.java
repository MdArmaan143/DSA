package backTracking;

public class backTrackingArray {

    public static void arrayF(int arr[],int idx, int val){
        //base case
        if(idx==arr.length){
            printArr(arr);
            System.out.println();
            return;
        }

        //recursion
        arr[idx] = val;
        arrayF(arr, idx+1, val+1);
        arr[idx] = arr[idx] - 2;




    }
public static void printArr(int arr[]){
    for(int i =0 ; i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
}

    public static void main (String args[]){

        int arr[] = new int[5];

        arrayF(arr,0,1);
        printArr(arr);

    }
    
}
