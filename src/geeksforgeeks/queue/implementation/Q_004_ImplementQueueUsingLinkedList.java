package geeksforgeeks.queue.implementation;

public class Q_004_ImplementQueueUsingLinkedList {

    QNode front, rear;
    static class QNode{
        int data;
        QNode next;
        QNode(int d){
            data = d;
        }
    }

    public static void main(String[] args){

        Q_004_ImplementQueueUsingLinkedList list = new Q_004_ImplementQueueUsingLinkedList();

        list.enQueue(20);
        list.enQueue(10);
        list.deQueue();
        list.deQueue();
        list.enQueue(50);
        list.enQueue(60);
        list.enQueue(90);
        list.deQueue();
        list.enQueue(80);

        System.out.println("Queue Front " + list.front.data);
        System.out.println("Queue Rear " + list.rear.data);
    }

    private void deQueue() {

        if(front == null){
            System.out.println("Queue is Empty.");
        }else {
            front = front.next;
        }

        if(front == null){
            rear = null;
            System.out.println("Queue is Empty Now.");
        }
    }

    private void enQueue(int newData) {
        QNode newNode = new QNode(newData);

        if(front == null){
            front = rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
    }

}
