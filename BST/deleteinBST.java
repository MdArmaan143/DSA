package BST;

public class deleteinBST {
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

    public static Node delete(Node root, int val){
        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else{
            // case1
            //no child - leaf node 
            if(root.left == null && root.right == null){
                return null;
            }
            //case2
            //single child
            if(root.left == null){
                return root.right;


            }else if(root.right == null){
                return root.left;
            }
            //case3
            // two children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;

    }
    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;

        }
        return root;
    }

    public static void printInRange(Node root , int k1, int k2){
       if (root == null) return;

        // Agar root ka data k1 se bada hai
        // to left subtree me bhi valid nodes ho sakte h
        if (root.data > k1) {
            printInRange(root.left, k1, k2);
        }

        // Agar root ka data k1 aur k2 ke beech hai
        // to root ko print kro
        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data + " ");
        }

        // Agar root ka data k2 se chhota hai
        // to right subtree me bhi valid nodes ho sakte h
        if (root.data < k2) {
            printInRange(root.right, k1, k2);
        }
    }

    public static void main(String args[]){
    int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i = 0; i<values.length;i++){
            root = insert(root, values[i]);

        }
        inorder(root);System.out.println();
        printInRange(root, 5, 12);
        // delete(root, 8);
        // inorder(root);
        // System.out.println();
    }
    
}

    

