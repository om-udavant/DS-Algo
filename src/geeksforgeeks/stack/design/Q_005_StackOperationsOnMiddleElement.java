package geeksforgeeks.stack.design;

public class Q_005_StackOperationsOnMiddleElement {

    class DllNode{
        DllNode prev;
        int data;
        DllNode next;

        DllNode(int d){
            data = d;
        }
    }

    class myStack{
        DllNode head;
        DllNode middle;
        int count;
    }

    myStack createMyStack(){
        myStack ms = new myStack();
        ms.count = 0;
        return ms;
    }

    void push(myStack ms, int newData){
        DllNode newNode = new DllNode(newData);

        newNode.prev = null;

        newNode.next = ms.head;

        ms.count += 1;

        if(ms.count == 1){
            ms.middle = newNode;
        }else {
            ms.head.prev = newNode;
            if ((ms.count % 2) != 0) {
                ms.middle = ms.middle.prev;
            }
        }

        ms.head = newNode;
    }

    int pop(myStack ms){

        if(ms.count == 0){
            System.out.println("Stack is empty.");
            return -1;
        }

        DllNode head = ms.head;
        int item = head.data;
        ms.head = head.next;

        if (ms.head != null){
            ms.head.prev = null;
        }

        ms.count -= 1;

        if ((ms.count % 2) == 0){
            ms.middle = ms.middle.next;
        }

        return item;
    }

    int findMiddle(myStack ms){
        if (ms.count == 0){
            System.out.println("Stack is Empty.");
            return -1;
        }

        return ms.middle.data;
    }

    public static void main(String args[]){

        Q_005_StackOperationsOnMiddleElement ob = new Q_005_StackOperationsOnMiddleElement();

        myStack ms = ob.createMyStack();

        ob.push(ms, 11);
        ob.push(ms, 22);
        ob.push(ms, 33);
        ob.push(ms, 44);
        ob.push(ms, 55);
        ob.push(ms, 66);
        ob.push(ms, 77);
        ob.push(ms, 88);

        System.out.println("Item popped is " + ob.pop(ms));
        System.out.println("Item popped is " + ob.pop(ms));
        System.out.println("Middle Element is " + ob.findMiddle(ms));
    }
}
