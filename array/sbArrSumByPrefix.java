package array;

public class sbArrSumByPrefix {
    public static void subArrSum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }



        for(int i = 0;i<arr.length;i++){
            int start = i;

            for(int j = i;j<arr.length;j++){
                int end = j;
                currSum = start ==0?prefix[end] : prefix[end] - prefix[start-1];
                
             

                
                System.out.println(currSum);

                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("maxSum is = " + maxSum);
    }
    public static void main (String args[]){
        int arr[] = {1,-2,6,-1,3};

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        subArrSum(arr);
    }
    
}
