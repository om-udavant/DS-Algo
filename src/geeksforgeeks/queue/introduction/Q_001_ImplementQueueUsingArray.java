package geeksforgeeks.queue.introduction;

//java program to create queue using array

public class Q_001_ImplementQueueUsingArray {
    static class Queue{
        int front, rear, size, capacity;
        int[] arr;

        public Queue(int capacity) {
            this.capacity = capacity;
            front = size = 0;
            arr = new int[capacity];
        }

        boolean isFull(Queue queue){
            return (queue.size == queue.capacity);
        }

        boolean isEmpty(Queue queue){
            return (queue.size == 0);
        }

        public void enQueue(int item){
            if (isFull(this)){
                return;
            }else {
             arr[size] = item;
             size++;
             rear = size-1;
            }
        }

        public int deQueue(){
            if (isEmpty(this)){
                return 0;
            }else {
            int item = arr[front];
            front++;
            size--;
            return item;
            }
        }

        public int front(){
            if (isEmpty(this)){
                return 0;
            }else {
                return arr[front];
            }
        }

        public int rear(){
            if(isEmpty(this)){
                return 0;
            }
            return arr[rear];
        }
    }

    public static void main(String[] args){
        Queue queue = new Queue(1000);

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        System.out.println(queue.deQueue() + " dequeued from queue\n");

        System.out.println("Front item is " + queue.front());

        System.out.println("Rear item is " + queue.rear());

        System.out.println(queue.deQueue() + " dequeued from queue\n");

        System.out.println("Front item is " + queue.front());

        System.out.println("Rear item is " + queue.rear());
    }
}
