package geeksforgeeks.linkedList.singly;

//Java program to search an element
// in linked list

public class Q_008_SearchElement {

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

        Q_008_SearchElement llist = new Q_008_SearchElement();

        llist.push(8);
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.print("\n THe Given LinkedList  ");
        llist.printList();

        llist.search(5);
    }

    private void search(int element) {

        int count = 0, data = 0;

        Node current = head;

        while (current != null){
            if(current.data == element){
                System.out.println("\n The Given Element is present at " + (count + 1));
                break;
            }else {
                current = current.next;
                count++;
            }
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
