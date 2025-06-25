package practice;

public class MergeS {

    public static void travers(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] + " ");

        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si,int ei){
        //base case
        if(si>=ei){
            return;

        }
        //kaam
        //step1 find mid
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);//merge sort for left
        mergeSort(arr, mid+1, ei);//merge sort for right
        merge(arr,si,mid,ei);

    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int [ei-si+1];
        int i = si;
        int j= mid+1;
        int k = 0;
        while(i<=mid && j<=ei ){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
             k++;
        }
        //left over elementof 1st sorted part
        while (i<=mid) {
            temp[k++] = arr[i++];
            
        }
         //right  over element of 2nd sorted part
        while (j<=ei) {
            temp[k++] = arr[j++];
            
        }
        //copy temp arr to original
        for(k = 0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
       
    }

    public static void main(String args[]){
        int arr[] = {6,3,9,5,2,8};
        travers(arr);
        mergeSort(arr,0, arr.length-1);
        travers(arr);

    }
    
}


/*merge sort me
 * step 1 base case likha ki si>=ei return
 * step 2 mid find kiya by using si + (ei-si)/2
 * step3 mergsort caal kiya left ke liye and right ke liye MereSort(arr,si,mid),MergeSort(arr,mid+1,ei)
 * call merge funtion mer(arr,ai,mid,ei)
 * merge ke ander me ek temp array bnaeynge size ei-si+1
 * teen index lenge ek left ke liye ek right ke liye ek temp array ke 
 * while condition
 * end me copy temp to original array;
 */
