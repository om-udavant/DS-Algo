package geeksforgeeks.queue.implementation;

import java.util.LinkedList;
import java.util.Queue;

public class Q_003_ImplementStackUsingQueue {

    static class Stack{
        static Queue<Integer> queue1 = new LinkedList<>();
        static Queue<Integer> queue2 = new LinkedList<>();

        static int size;

        public Stack() {
            size = 0;
        }

        void push(int data){
            while (!queue1.isEmpty()){
                queue2.add(queue1.peek());
                queue1.remove();
            }

            queue1.add(data);
            size++;

            while (!queue2.isEmpty()){
                queue1.add(queue2.peek());
                queue2.remove();
            }
        }

        int pop(){
            if(queue1.isEmpty()){
                return -1;
            }
            int x = queue1.peek();
            queue1.remove();
            size--;
            return x;
        }

         int size(){
            return size;
        }
    }

    public static void main(String[] args){

        Stack stack = new Stack();

        System.out.println("Size of stack is " + stack.size());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Element popped from stack " + stack.pop());
        System.out.println("Element popped from stack " + stack.pop());
        System.out.println("Element popped from stack " + stack.pop());

        System.out.println("Size of stack is " + stack.size());
    }
}
