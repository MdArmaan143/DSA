package practice;

public class subArray {
    public static int subArr(int arr[]){
       
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                 int currSum = 0;
                for(int k = i;k<=j;k++){
                    currSum = currSum +arr[k];
                   if(maxSum<currSum){
                    maxSum =  currSum;
                   }
                }
                
            }
           
        }
        return maxSum;
    }
    public static void main(String arga[]){
        int arr[] ={2,-1,7};
       
    
System.out.println( subArr(arr));
    }
    
}
