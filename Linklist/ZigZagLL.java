package Linklist;

public class ZigZagLL {
    
  
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

    //methods
    public void addFirst(int data){
        //step 1.. create new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail = newNode;
            return;
        }
        //step2.. new node next = head
        newNode.next = head; //link state

        //step3 ... head = new node
        head = newNode;

    }
  

    public  void print(){
        if(head==null){
            System.out.println("LL is empty");
            return;
        }

        Node temp = head ;
        while (temp!=null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
            
        }
        System.out.println("null");

    }
    public static Node getMid(){
        Node slow = head;
        Node fast = head.next;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            
        }
        return slow;
    }

    public static void zigZage(){
        //find mid
        Node mid = getMid();

        //revrse
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //step3 alternate Merging
        Node Rh = prev;
        Node Lh = head;
        Node nextR,nextL;
        while(Rh!=null && Lh!=null){
            nextL = Lh.next;
            Lh.next = Rh;
            nextR = Rh.next;
            Rh.next = nextL;

            Rh = nextR;
            Lh = nextL;

        }
    }
    


    public static void main(String[] args) {
        //linked list object
        ZigZagLL ll = new ZigZagLL();
        
        ll.addFirst(5);
       
        ll.addFirst(4);
        
        ll.addFirst(3);
         
        ll.addFirst(2);
       
        ll.addFirst(1);
        ll.print();
        
       ll.zigZage();
       ll.print();

  
    
    }
    
}
