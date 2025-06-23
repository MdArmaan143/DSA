package twoDarray;

public class assignment {
    public static boolean search(int arr[][], int key){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(key==arr[i][j]){
                    count++;
                  
                   
                }
                    
            }
        }
        System.out.println(count);
       
        return true;
        
       
        
    }

    public static void sum(int arr[][]){
        int sum = 0;
       
            for(int j = 0;j<arr[0].length;j++){
                sum +=arr[1][j];
            }
        
        System.out.println(sum);
    }
    public static void main (String args[]){
        int arr[][] = { {1,4,9},{11,4,3},{2,2,3} };
           int key = 6;                      
        // search(arr, key);
        sum(arr);
    }
    
}
