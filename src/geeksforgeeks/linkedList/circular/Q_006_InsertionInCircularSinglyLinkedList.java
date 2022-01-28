package geeksforgeeks.linkedList.circular;

public class Q_006_InsertionInCircularSinglyLinkedList {

    static class Node{
        int data;
        Node next;
    }

    public static void main(String[] args){

        Node last = null;

        last = addtoEmpty(last, 6);
        last = addBegin(last, 4);
        last = addBegin(last, 2);
        last = addEnd(last, 8);
        last = addEnd(last, 12);
        last = addAfter(last, 10, 8);

        traverse(last);
    }

    private static void traverse(Node last) {
        Node p;

        if (last == null)
        {
            System.out.println("List is empty.");
            return;
        }

        p = last.next;

        do
        {
            System.out.print(p.data + " ");
            p = p.next;

        } while(p != last.next);
    }

    private static Node addAfter(Node last, int data, int dataAfter) {

        if(last == null){
            return null;
        }

        Node temp, p;
        p = last.next;
        do{
            if(p.data == dataAfter){
                temp = new Node();
                temp.data = data;
                temp.next = p.next;
                p.next = temp;

                if (p == last){
                    last = temp;
                }
                return last;
            }
            p = p.next;
        }while (p != last.next);

        System.out.println(dataAfter + " not presentin the List.");
        return last;
    }

    private static Node addEnd(Node last, int data) {

        if(last == null){
            return addtoEmpty(last, data);
        }

        Node temp = new Node();

        temp.data = data;
        temp.next = last.next;
        last.next = temp;
        last = temp;

        return last;
    }

    private static Node addBegin(Node last, int data) {

        if(last == null){
            return addtoEmpty(last, data);
        }

        Node temp = new Node();

        temp.data = data;
        temp.next = last.next;
        last.next = temp;

        return last;
    }

    private static Node addtoEmpty(Node last, int data) {

        if(last != null){
            return last;
        }

        Node temp = new Node();

        temp.data = data;
        last = temp;

        last.next = last;

        return last;
    }
}
