package geeksforgeeks.queue.implementation;

import geeksforgeeks.stack.design.Q_009_ImplementStackUsingSingleQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Q_006_ImplementStackUsingSingleQueue {
    Queue<Integer> queue = new LinkedList<Integer>();

    void push(int data){
        int size = queue.size();

        queue.add(data);

        for (int i = 0; i < size; i++){
            int x = queue.remove();
            queue.add(x);
        }
    }

    int pop(){
        if (queue.isEmpty()){
            System.out.println("Stack Is Empty");
            return -1;
        }
        int x = queue.remove();
        return x;
    }

    int top(){
        if (queue.isEmpty()){
            System.out.println("Stack Is Empty");
            return -1;
        }
        return queue.peek();
    }

    boolean isEmpty(){
        return queue.isEmpty();
    }

    public static void main(String[] args){
        Q_006_ImplementStackUsingSingleQueue s = new Q_006_ImplementStackUsingSingleQueue();

        s.push(5);
        s.push(7);
        System.out.println("Top element :" + s.top());
        s.pop();
        s.push(30);
        s.pop();
        System.out.println("Top element :" + s.top());
    }
}
