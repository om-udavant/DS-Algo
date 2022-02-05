package geeksforgeeks.stack.design;

import java.util.LinkedList;
import java.util.Queue;

public class Q_004_StackUsingQueue {

    static class stack{

        static Queue<Integer> q1 = new LinkedList<Integer>();
        static Queue<Integer> q2 = new LinkedList<Integer>();

        static int currentSize;

        stack(){
            currentSize = 0;
        }

        void push(int data){
            currentSize++;

            while (!q1.isEmpty()){
                q2.add(q1.peek());
                q1.remove();
            }

            q1.add(data);

            while (!q2.isEmpty()){
                q1.add(q2.peek());
                q2.remove();
            }
        }

        int pop(){

            if (q1.isEmpty()){
                System.out.println("Stack is Empty.");
                return -1;
            }

            int data = q1.peek();
            q1.remove();
            currentSize--;
            return data;
        }

        int top(){
            if(q1.isEmpty()){
                return -1;
            }
            return q1.peek();
        }

        int size(){
            return currentSize;
        }
    }

    public static void main(String[] args){

        stack s = new stack();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Current Size of Stack is : " + s.size());
        System.out.println("Top Element is : " + s.top());
        s.pop();
        System.out.println("Top Element is : " + s.top());
        s.pop();
        System.out.println("Current Size of Stack is : " + s.size());
        System.out.println("Top Element is : " + s.top());
        s.pop();
        System.out.println("Top Element is : " + s.top());
        System.out.println("Current Size of Stack is : " + s.size());
    }
}
