package array;

public class maxSumKadansAlgo {

    public static void kadansSum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            currSum = currSum + arr[i];
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("maxSum of subArray is = " + maxSum);
    }
    public static void main (String args[]){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();

        kadansSum(arr);

        
}
    
}
