package BinaryTree;

import java.util.ArrayList;

public class lowestCancesster {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    // }
    // public static boolean getPath(Node root, int n, ArrayList<Node> path){
    //     if(root == null){
    //         return false;
    //     }
    //     path.add(root);
    //     if(root.data == n){
    //         return true;
    //     }
    //     boolean foundLeft = getPath(root.left, n, path);
    //     boolean foundRight = getPath(root.right, n, path);

    //     if(foundLeft || foundRight){
    //         return true;
    //     }
    //     path.remove(path.size()-1);
    //     return false;

    // }
    // public static Node lca(Node root,int n1, int n2){
    //     ArrayList<Node> path1 = new ArrayList<>();
    //     ArrayList<Node> path2 = new ArrayList<>();

    //     getPath(root,n1,path1);
    //     getPath(root,n2,path2);
    //     int i = 0;

    //     for(; i<path1.size() && i<path2.size(); i++){
    //         if(path1.get(i) != path2.get(i)){
    //             break;
    //         }
    //     }

    //     Node Lca = path1.get(i-1);
    //     return Lca;



    // }
    // public static int Kancestor(Node root, int n, int k){
    //     if(root==null){
    //         return -1;
    //     }
    //     if(root.data == n){
    //         return 0 ;
    //     }
    //     int leftD = Kancestor(root.left, n, k);
    //     int rightD = Kancestor(root.right, n, k);
    //     if(leftD ==-1 && rightD == -1){
    //         return -1;
    //     }
    //     int max = Math.max(leftD, rightD);
    //     if(max+1 == k){
    //         System.out.println(root.data);
    //     }
    //     return max+1;
    // }
    public static void preOrder(Node root){
        if(root == null){
            return;

        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static int transform(Node root){
        if(root==null){
            return 0;
        }
        int leftSum = transform(root.left);
        int rightSum = transform(root.right);

         int oldData = root.data;
        root.data = leftSum + rightSum;
        return oldData + root.data;
    }

    
      public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        int n1 = 4, n2 = 5;
        int n= 5, k = 2;
        transform(root);
        preOrder(root);
    //     Kancestor(root, n, k);
    //     System.out.println(Kancestor(root, n, k));
    //    System.out.println(lca(root, n1,n2).data); 
}

}
}
