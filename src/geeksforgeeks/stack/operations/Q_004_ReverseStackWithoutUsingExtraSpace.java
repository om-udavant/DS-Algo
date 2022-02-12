package geeksforgeeks.stack.operations;

public class Q_004_ReverseStackWithoutUsingExtraSpace {

    StackNode head;
    static class StackNode{
        int data;
        StackNode next;

        StackNode(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String[] args){

        Q_004_ReverseStackWithoutUsingExtraSpace llist = new Q_004_ReverseStackWithoutUsingExtraSpace();

        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);
        llist.push(6);

        System.out.println("Original Stack");
        llist.display();

        llist.reverse();

        System.out.println("\nReversed Stack");
        llist.display();
    }

    private void reverse() {

        StackNode current, previous, temp;
        previous = head;
        current = previous.next;
        previous.next = null;

        while (current != null){
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        head = previous;
    }

    private void display() {

        StackNode temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private void push(int newData) {

        if(head == null){
            head = new StackNode(newData);
            return;
        }

        StackNode newNode = new StackNode(newData);
        newNode.next = head;
        head = newNode;
    }
}
