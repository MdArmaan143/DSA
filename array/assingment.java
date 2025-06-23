package array;

public class assingment {
    public static boolean appear(int num[]){
        for(int i = 0; i<num.length;i++){
         int curr_num = num[i];
         for(int j = i+1;j<num.length;j++){
            if(curr_num == num[j]){
                return true;
            }
         }
        }
        return false;
       

    }
    public static void main (String args[]){
        int num[] = {1,2,3,4,5,5};
        for(int i =0;i<num.length;i++){
            System.out.print( num[i]);
        }
        System.out.println();

       System.out.println(appear(num));

    }
    
}
