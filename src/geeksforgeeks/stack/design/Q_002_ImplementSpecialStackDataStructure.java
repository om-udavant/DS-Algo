package geeksforgeeks.stack.design;

import java.util.Stack;

public class Q_002_ImplementSpecialStackDataStructure {

    static int min;
    static Stack<Integer> s1 = new Stack<Integer>();
    static class Stacks{

        static void pushData(int x){
            if(s1.isEmpty()){
                min = x;
                s1.push(x);
            }else {

                if (min <= x){
                    s1.push(x);
                }else {
                    s1.push(2 * x - min);
                    min = x;
                }
            }
        }

        static void popData(){

            if(s1.isEmpty()){
                System.out.println("Stack is Empty.");
            }else {
                if(s1.peek() >= min){
                    s1.pop();
                }else {
                    min = (2 * min) - s1.peek();
                    s1.pop();
                }
            }
        }

        static int getMin(){
            return min;
        }

    };

    public static void main(String[] args){

        Stacks.pushData(4);
        Stacks.pushData(2);
        Stacks.pushData(3);
        Stacks.pushData(1);
        Stacks.pushData(5);

        System.out.println("Min Element in the stack is " + Stacks.getMin());

        System.out.println(s1.peek() + " is Removed from Stack.");
        Stacks.popData();

        System.out.println(s1.peek() + " is Removed from Stack.");
        Stacks.popData();

        System.out.println("Min Element in the stack is " + Stacks.getMin());
    }

}
