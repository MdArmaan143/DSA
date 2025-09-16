package Graphs;

import java.util.ArrayList;

public class CreateUsingAdjacency {
    static class Edge{
        int s;
        int d;
        int w;
        public Edge(int s, int d, int w){
            this .s = s;
            this.d = d;
            this.w = w;
        }

    } 
    
        
    
    public static void main(String args[]){
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];

        for(int i =0; i<v;i++){
            graph[i] = new ArrayList<>();
        }
        //vertex 1
        graph[1].add(new Edge(1, 0, 5));
        
        graph[1].add(new Edge(1, 2, 4));
        
        graph[1].add(new Edge(1, 3, 1));


        //1s neighbours
        for(int i=0;i<graph[1].size();i++){
            Edge e = graph[1].get(i);
            System.out.println(e.d);
        }


    }
    
}
