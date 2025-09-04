package HEAPS;
import java.util.*;

public class nearestK {
    public static class Points implements Comparable<Points>{
        int  x;
        int y;
        int distSqr;
        int i;

        public Points(int x,int y,int distSqr, int i){
            this.x = x;
            this.y = y;
            this.distSqr = distSqr;
            this.i = i;
        }
        @Override
        public int compareTo(Points p2){
            return this.distSqr -  p2.distSqr;
        }
    }

    public static void main(String args[]){
        int pts[][] = {{3,3},{5,-1},{-2,4}};
        int k= 2;
        PriorityQueue<Points> pq = new PriorityQueue<>();

        for(int i =0;i<pts.length;i++){
            int distSqr = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1]; 
            pq.add(new Points(pts[i][0], pts[i][1], distSqr, i));
       
        }
        for(int i = 0;i<k;i++){
            System.out.println("C" + pq.remove().i);

        }
    }
    
}
