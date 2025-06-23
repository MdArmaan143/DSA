package arrayList;

import java.util.ArrayList;

public class WaterContainer {
    public static int stereWater(ArrayList<Integer> height){
        int maxWater = 0;

        //brute force
        for(int i = 0;i<height.size();i++){
            for(int j =i+1;j<height.size();j++){
                int width =j - i;
                int h = Math.min(height.get(j),  height.get(i));
                int area = h*width;
                 if(maxWater<area){
                    maxWater = area;
                
            }

            }
          
        }
         return maxWater;

    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(stereWater(height));
    }

}
