package HEAPS;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueForObj {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student S2){
            return this.rank - S2.rank;
        }
    
        
    }
    public static void main(String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("armaan", 6));
         pq.add(new Student("b", 56));
          pq.add(new Student("c", 16));
           pq.add(new Student("d", 26));
            pq.add(new Student("e", 36));
       
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
            
        }
    }
    
}
