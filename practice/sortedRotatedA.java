package practice;

public class sortedRotatedA {
    public static void travers(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    public static int searchTar(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;

        }

        //find mid
        int mid = si + (ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }

        //lie on L1
        if(arr[si]<arr[mid]){
            //case:a
            if(arr[si]<=tar && tar<=arr[mid]){
                return searchTar(arr, tar, si, mid-1);
            }else{
                //case:b
                return searchTar(arr, tar, mid+1, ei);
            }

        }
        //lie on L2
        else{
            //case:c
            if(arr[mid]<=tar && tar<=arr[si]){
                return searchTar(arr, tar, mid+1, ei);
            }else{
                //case:d
                return searchTar(arr, tar, si, mid-1);
            }

        }

    }

    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        int idx = searchTar(arr, 3, 0, arr.length-1);
        System.out.println("target found at index :" + idx);

       

       
       

    }
    
}


/*
 * step 1 mid find kro
 * step2 lie on L1 or lie on L2
 * L1 me case a and b
 * L2 case c and d
 */
