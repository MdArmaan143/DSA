package Linklist;

import Loops.whileLoop;

public class Palindrome {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // create Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;

    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");

    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next; //+1 increas
            fast = fast.next.next; //+2increas
        }
        return slow;//thisa is our midNode

    }

    public boolean checkPlalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        // 1 find midd
        Node midNode = findMid(head);

        //2 reverse 2nd half
        Node prev = null;
        Node curr =midNode;
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }
        Node right = prev; //right half head
        Node left = head; //left half head

        //3 compare
        while(right!=null){
            if(left.data!=right.data){
                return false;

            }
            left = left.next;
            right = right.next;

        }
        return true;
    }

    public static void main(String args[]) {
        Palindrome ll = new Palindrome();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        System.out.println(ll.checkPlalindrome());
      

    }

}
