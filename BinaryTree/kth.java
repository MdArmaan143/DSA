package BinaryTree;
import java.util.*;

public class kth {
     static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void levelOrder(Node root, int kth){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
         int level = 1;

        while (!q.isEmpty()) {
           int size = q.size();

           for(int i = 0; i<size;i++){
            Node currNode = q.remove();

             if(kth == level ){
                     System.out.print(currNode.data + " ");


                }
                  
               
                if(currNode.left !=null){
                    q.add(currNode.left);
                }
                 if(currNode.right !=null){
                    q.add(currNode.right);
                }
               

           }
            level++;
            
            
        }



            
        
    }

      public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        levelOrder(root,2);
    
}
}
