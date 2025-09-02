package BST;

import java.util.ArrayList;

public class BSTtobalancedBST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void inorder(Node root, ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
     public static void Bstinorder(Node root){
        if(root==null){
            return;
        }
        Bstinorder(root.left);
        
           System.out.print(root.data + " ");
        Bstinorder(root.right);
    }
    

    public static Node BST(Node root, int val){
        if(root==null){
            root = new Node(val);
            return root;
        }
        if(root.data>val){
            root.left =  BST(root.left, val);
        }
        else{
            root.right =  BST(root.right, val);
        }
            return root;

    }
    public static Node balancedBST(ArrayList<Integer> arr, int st, int end){
        if(st>end){
            return null;
        }

        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = balancedBST(arr, st, mid-1);
        root.right = balancedBST(arr, mid+1, end);
        return root;

    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i<values.length;i++){
            root = BST(root, values[i]);
        }
        inorder(root,arr);
        System.out.print(arr);
        root = balancedBST(arr, 0,arr.size()-1);
        System.out.println();
        Bstinorder(root);

    }
    
}
