package array;

public class rainTrapped {

    public static int trappedRainWater(int height[]){
        // calculate left max boundry  - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1;i<height.length;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        // calculete right max boundry  - array
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i = height.length-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }  

        //loop
        int trappedWater = 0;
        for(int i = 0 ;i<height.length;i++){
            // waterlevel = min(left max boundry,right max boundry)
            int waterlevel = Math.min(leftMax[i],rightMax[i]);
            
        // trapped water = (waterlevel-height[i])*width
            trappedWater += waterlevel-height[i];
        }
        return trappedWater;

        
    }
    public static void main (String args[]){
        int height[] = {4,2,0,6,3,2,5};

        int ans = trappedRainWater(height);
        System.out.println(ans);
    }
    
}
