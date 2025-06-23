package divideandCon;

import java.lang.reflect.Array;
import java.util.*;

import Loops.whileLoop;

public class mergsort {
    public static void arrTreversal(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void sortArr(int arr[]){
        Arrays.sort(arr);
        arrTreversal(arr);

    }
    //merge sort immplement
    public static void mergSort(int arr[],int si, int ei){
        //base case 
        if(si>=ei){
            return;
        }
        //kaam
        int mid = si + (ei-si)/2;
        mergSort(arr, si, mid);
        mergSort(arr, mid+1, ei);

        merge(arr,si,mid,ei);

    }

//merge method for merging the sorted array
public static void merge(int arr[],int si,int mid, int ei){
    int temp[] = new int[ei-si+1];
    int i = si; //idx for first sorted part
    int j= mid+1;  // idx for 2nd sorted part
    int k = 0;  //idx for temp

    while(i<=mid && j<=ei){
        if(arr[i]<arr[j]){
            temp[k] = arr[i];
            i++;
        }else{
            temp[k] = arr[j];
            j++;
        }
        k++;
    }

    // for leftover element for 1st sorted part
    while(i<=mid){
        temp[k++] = arr[i++];
    }

     // for leftover element for 2nd sorted part
     while(j<=ei){
        temp[k++] = arr[j++];
    }

    //copy krna h temp ko original me
    for(k = 0, i=si;k<temp.length;k++,i++){
        arr[i] = temp[k];
    }

}    
    public static void main (String args []){
        int arr[] = {6,3,9,5,2,8};
        arrTreversal(arr);
        // sortArr(arr);
       mergSort(arr, 0, arr.length-1);
       arrTreversal(arr);
      
    }
    
}
