package Queues;

public class QueueB {
    /* 
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        public static boolean isEmpty() {
            return rear ==-1;
        }

        //add
        public static void add(int data) {
            if(rear == size-1) {
                System.out.println("queue is full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }
        //remove
        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int front = arr[0];
            for(int i=0; i<rear; i++) {
                arr[i] =arr[i+1];
            }
            rear = rear - 1;
            return front;
        }
        //peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            return arr[0];
        }
    }
    */
        static class Queue {
            static int arr[];
            static int size;
            static int rear;
            static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear ==-1 && front == -1;
        }

        public static boolean isFull() {
            return (rear+1)%size == front;
        }

        //add
        public static void add(int data) {
            if(isFull()) {
                System.out.println("queue is full");
                return;
            }
            //add 1st element
            if(front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
        //remove
        public static int remove() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int result = arr[front];
                if (rear == front) {
                // Reset the queue after removing the last element
                rear = -1;
                front = -1;
                } else {
                front = (front + 1) % size;
            }
            return result;
        }
        //peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            return arr[front];
        }
    }
    

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
