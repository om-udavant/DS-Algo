package geeksforgeeks.linkedList.circular;

public class Q_005_CheckIfLinkedListIsCircular {

    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String[] args){
        
        Q_005_CheckIfLinkedListIsCircular llist = new Q_005_CheckIfLinkedListIsCircular();
        
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.println("\nGiven List is");
        llist.printList();
        int i = llist.isCircular();

        if(i == -1){
            System.out.println("\nMaking The List Circular...");
            llist.makeCircular();
            System.out.println("List Is Circualr Now.");
        }
    }

    private void makeCircular() {
        Node temp = head;

        int i = 0;
        while (temp != null){
            temp = temp.next;
            i++;
        }
        temp = head;
       for (int j = 0; j < (i - 1); j++){
           temp = temp.next;
       }
       temp.next = head;

    }

    private int isCircular() {
        Node temp = head;

        if(temp == null){
            System.out.println("\nList Is Empty.");
            return 0;
        }
        temp = temp.next;
        while(temp != head && temp != null){
            temp = temp.next;
        }
        if (temp == null){
            System.out.println("\nThe List Is Not Circular.");
            return -1;
        }else {
            System.out.println("\nThe List Is Circular.");
            return 0;
        }
    }

    private void printList() {
        Node n = head;
        while (n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    private void push(int newData) {
        Node newNode = new Node(newData);

        newNode.next = head;

        head = newNode;
    }
}
