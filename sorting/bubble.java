package sorting;

import java.util.Arrays;

public class bubble {
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            int swap =0;
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            System.out.println(swap);

        }
       
    }
    public static void selectionSort(int arr[]){
        for(int i = 0 ; i<arr.length-1;i++){
            int minPos = i;
            for (int j = i+1;j<arr.length;j++){
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

public static void inbuiltSort(int arr[]){
    Arrays.sort(arr,0,3);
}




    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String ars[]) {
        int arr[] = {5,4,1,3,2};

      inbuiltSort(arr);
        printArr(arr);
    }
    
}





