package geeksforgeeks.queue.implementation;

public class Q_005_ImplementKQueuesUsingSingleArray {
    
    int k, n, free;
    int[] arr, front, rear, next;

    Q_005_ImplementKQueuesUsingSingleArray(int k, int n){
        k = k;
        n = n;
        arr = new int[n];
        front = new int[k];
        rear = new int[k];
        next = new int[n];

        for (int i = 0; i < k; i++){
            front[i] = rear[i] = -1;
        }

        free = 0;

        for (int i = 0; i < n-1; i++){
            next[i] = i + 1;
        }
        next[n-1] = -1;
    }
    
    
    public static void main(String[] args){
        int k = 3, n = 10;
        Q_005_ImplementKQueuesUsingSingleArray kq = new Q_005_ImplementKQueuesUsingSingleArray(k, n);
        
        kq.enqueue(15, 2);
        kq.enqueue(45, 2);

        kq.enqueue(17, 1);
        kq.enqueue(49, 1);
        kq.enqueue(39, 1);

        kq.enqueue(11, 0);
        kq.enqueue(9, 0);
        kq.enqueue(7, 0);

        System.out.println("Dequeued Element from queue 2 is " + kq.dequeue(2));

        System.out.println("Dequeued Element from queue 1 is " + kq.dequeue(1));

        System.out.println("Dequeued Element from queue 0 is " + kq.dequeue(0));
    }

    private int dequeue(int i) {
        if(isEmpty(i)){
            System.out.println("Stack Underflow");
            return Integer.MAX_VALUE;
        }

        int frontIndex = front[i];

        front[i] = next[frontIndex];

        next[frontIndex] = free;
        free = frontIndex;

        return arr[frontIndex];
    }

    private boolean isEmpty(int i){
        return front[i] == -1;
    }

    private boolean isFull(int i){
        return free == -1;
    }

    private void enqueue(int data, int queueNo) {
        if(isFull(queueNo)){
            System.out.println("Queue Overflow.");
            return;
        }

        int nextFree = next[free];

        if(isEmpty(queueNo)){
            rear[queueNo] = front[queueNo] = free;
        }else {
            next[rear[queueNo]] = free;
            rear[queueNo] = free;
        }
        next[free] = -1;
        
        arr[free] = data;
        
        free = nextFree;
    }
}
