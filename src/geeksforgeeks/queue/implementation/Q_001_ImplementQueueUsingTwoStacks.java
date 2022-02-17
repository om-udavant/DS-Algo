package geeksforgeeks.queue.implementation;

import java.util.Stack;

public class Q_001_ImplementQueueUsingTwoStacks {

    static class Queue{

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

         void enQueue(int data){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }

             stack1.push(data);

            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
        }

         int deQueue(){

             if(stack1.isEmpty()){
                 System.out.println("Queue is Empty.");
                 System.exit(0);
             }

             int x = stack1.pop();
             return x;
        }
     }

    public static void main(String[] args){

        Queue queue = new Queue();

        //System.out.println(queue.deQueue());
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
