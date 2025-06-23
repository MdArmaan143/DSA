package Linklist;

public class reverseLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;


        }
    }

      

        public static Node head;
        public static Node tail;
        public static int size;


    
      public void addFirst(int data){
            //step1
            Node newNode = new Node(data);
            size++;

            if(head==null){
                head = tail = newNode;
                return;
            }
            //step2
            newNode.next = head;

            //step3
            head = newNode;




        }

        public void print(){
            Node temp = head;
            if(head==null){
                System.out.println("LL is empty");
                return;
            }
            
            while (temp!=null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
                
            }
            System.out.println("null");
        }

        public void reverseLL(){
            Node prev = null;
            Node curr = tail = head ;
            Node next;
            while (curr!=null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;

                
            }
            head = prev;
        }
        public void removeFromEnd(int n){
            //calculate size 
            int sz = 0;
            Node temp = head;
            while(temp!=null){
                temp = temp.next;
                sz++;
            }

            if(n == sz){
                head = head.next; //removeFirst
                return;
            }

            int i = 1;
            int iToF = sz-n;
            Node prev = head;
            while (i<iToF) {
                prev = prev.next;
                i++;
                
            }
            prev.next = prev.next.next;
            return;

        }
    public static void main(String args[]){
        reverseLinkedList ll = new reverseLinkedList();
        ll.addFirst(5);
         ll.addFirst(4);
          ll.addFirst(3);
           ll.addFirst(2);
            ll.addFirst(1);
            ll.print();
            ll.reverseLL();
            ll.print();
            System.out.println(ll.size);
            ll.removeFromEnd(3);
            ll.print();
            

        

    }
    
}
