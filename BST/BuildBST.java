package BST;

public class BuildBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static Node insert(Node root, int values){
        if(root==null){
            root = new Node(values);
            return root;
        }
        if(root.data > values){
            //left subtree
            root.left = insert(root.left, values);

        }else{
            //right subtree
            root.right = insert(root.right, values);
        }
        return root;
    }

    public static void main(String args[]){
    int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0; i<values.length;i++){
            root = insert(root, values[i]);

        }
        inorder(root);System.out.println();
    }
    
}
