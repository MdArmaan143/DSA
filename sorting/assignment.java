package sorting;

import java.util.Arrays;

import Loops.whileLoop;

public class assignment {
    //bubble sort

public static void bubbleSort(int arr[]){
    for(int turn = 0;turn<arr.length-1;turn++){
        for(int j=0;j<arr.length-1-turn;j++){
            if(arr[j]>arr[j+1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }


}

//selection sort
public static void selectionSort(int arr[]){
    for(int i = 0;i<arr.length-1;i++){
        int minPos = i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[minPos]>arr[j]){
                minPos = j;
            }
        }
        //swap
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
    }

}
//insertion sort
public static void insertionSort(int arr[]){
    for(int i = 1 ; i<arr.length;i++){
        int curr = arr[i];
        int prev = i-1;
        while(prev >= 0 && arr[prev]> curr ){
            arr[prev+1] = arr[prev];
            prev--;
        }
        //insertion
        arr[prev+1] = curr;
    }
    
}

//count sort
public static void countSort(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i = 0; i<arr.length;i++){
        largest = Math.max(largest, arr[i]);
    }
    int count[] = new int[largest+1];
    for(int i = 0;i<arr.length;i++){
        count[arr[i]]++;

    }
    //sorting
    int j = 0;
    for(int i = 0;i<count.length;i++){
        while (count[i]>0) {
            arr[j] = i;
            j++;
            count[i]--;
            
        }
    }
    
}


public static void printArr(int arr[]){
    for(int i = 0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}


    public static void main (String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};

        // Arrays.sort(arr);    o(nlogn) time complexcity;
        // bubbleSort(arr);     o(n2) time comlexcity;
        // selectionSort(arr);  o(n2) time complexcity;
        // insertionSort(arr);    o(n2) time complexcity;
        countSort(arr);
        printArr(arr);
    }
    
}
