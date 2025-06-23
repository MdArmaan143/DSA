package array;
// brute force method which means time complec=xcity is o(n3)
public class maxSubArrSum {
    public static void subArr(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            int start = i;
            for(int j = i;j<arr.length;j++){
                int end = j;
                currSum = 0;
                for(int k = start;k<=end;k++){
                    currSum += arr[k];
                    
                }
                System.err.println(currSum + " ");
            if(maxSum<currSum){
                maxSum = currSum;
            }
            
           
            }
            System.out.println();
           
        }
        System.out.println("maxSum " + maxSum );

    }
    
    public static void main (String args[]){
        int arr[] = {1,-2,6,-1,3};
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        subArr(arr);

    }
}
