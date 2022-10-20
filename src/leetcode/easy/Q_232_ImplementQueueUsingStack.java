package leetcode.easy;

import java.util.Stack;

public class Q_232_ImplementQueueUsingStack {

    /*
     *
     * Implement a first in first out (FIFO) queue using only two stacks.
     * The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
     * Implement the MyQueue class:
     *   void push(int x) Pushes element x to the back of the queue.
     *   int pop() Removes the element from the front of the queue and returns it.
     *   int peek() Returns the element at the front of the queue.
     *   boolean empty() Returns true if the queue is empty, false otherwise.
     *
     * */

    public static void main(String[] args) {

    }

    class MyQueue {

        Stack<Integer> s1;
        Stack<Integer> s2;

        public MyQueue() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void push(int x) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(x);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

        }

        public int pop() {
            return s1.pop();
        }

        public int peek() {
            return s1.peek();
        }

        public boolean empty() {
            return s1.isEmpty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
