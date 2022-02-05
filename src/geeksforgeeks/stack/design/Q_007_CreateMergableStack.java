package geeksforgeeks.stack.design;

public class Q_007_CreateMergableStack {

    static class Node{
        Node next;
        Node prev;
        int data;

        Node(int value){
            data = value;
            next = null;
            prev = null;
        }
    }

    static class Stack{
        private Node head;
        private Node tail;

        Stack(){
            head = null;
            tail = null;
        }

        public void push(int newData){
            Node newNode = new Node(newData);
            if (head == null){
                head = newNode;
                head.next = null;
                head.prev = null;
                tail = newNode;
            }else {
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;
            }
        }

        public void pop(){
            if (head == null){
                System.out.println("Stack UnderFlow");
            }

            if (head == tail){
                head = null;
                tail = null;
            }else {
                Node n = tail;
                tail = tail.prev;
                n.prev = null;
                tail.next = null;
            }
        }

        public void mergeStack(Stack s){
            if (s.tail != null){
            head.prev = s.tail;
            s.tail.next = head;
            head = s.head;
            s.tail = null;
            s.head = null;
            }
        }

        public void display(){
            if (tail != null){
                Node n = tail;
                while (n != null){
                    System.out.print(n.data + " ");
                    n = n.prev;
                }
                System.out.println();
            }else {
                System.out.println("Stack Underflow");
            }
        }
    }

    public static void main(String[] args){
        Stack ms1 = new Stack();
        Stack ms2 = new Stack();

        ms1.push(6);
        ms1.push(5);
        ms1.push(4);

        System.out.println("Stack 1 :");
        ms1.display();

        ms2.push(8);
        ms2.push(2);
        ms2.push(9);

        System.out.println("Stack 2 :");
        ms2.display();

        ms1.mergeStack(ms2);

        System.out.println("Stack 1 Merged in Stack 2 : ");
        ms1.display();
    }
}
