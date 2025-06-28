package Queue;

public class QusingArray {
    static class Queue{
       static int arr[];
       static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        //empty
        public static boolean isEmpty(){
            return rear ==-1;
        }

        //enqueue
        public static void enqueue(int data){
            if(rear==size-1){
                System.out.println("queue if full");
                return ;
            }
            rear = rear+1;
            arr[rear] = data;
        }
        //dequeue
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0; i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return front;
        }
        //peek
        public static int peek(){
             if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];

        }
    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
            
        }
           System.out.println(q.peek());

    }
    
}
