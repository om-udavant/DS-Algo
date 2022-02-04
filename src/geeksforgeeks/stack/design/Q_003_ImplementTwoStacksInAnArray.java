package geeksforgeeks.stack.design;

public class Q_003_ImplementTwoStacksInAnArray {

    static class twoStacks{

        int arr[], size, top1, top2;

        twoStacks(int n){
            size = n;
            arr = new int[n];
            top1 = n / 2 + 1;
            top2 = n / 2;
        }

        void push1(int newData){

            if(top1 > 0){
                top1--;
                arr[top1] = newData;
            }else {
                System.out.println("Stack Overflow By Element : " + newData);
            }
        }

        void push2(int newData){

            if(top2 < size - 1){
                top2++;
                arr[top2] = newData;
            }else {
                System.out.println("Stack Overflow By Element : " + newData);
            }
        }

        int pop1(){
            if(top1 <= size / 2){
                int x = arr[top1];
                top1++;
                return x;
            }else {
                System.out.println("Stack Underflow.");
                System.exit(0);
            }
            return 0;
        }

        int pop2(){
            if(top2 >= size / 2 + 1){
                int x = arr[top2];
                top2--;
                return x;
            }else {
                System.out.println("Stack Underflow.");
                System.exit(0);
            }
            return 0;
        }

    }

    public static void main(String[] args){

        twoStacks stack = new twoStacks(5);

        stack.push1(1);
        stack.push2(5);
        stack.push2(4);
        stack.push1(3);
        stack.push1(7);
        stack.push2(2);

        System.out.print("Popped element from stack1 is " + " : " +  stack.pop1() +"\n");

        System.out.print("Popped element from stack2 is " + " : " +  stack.pop2() +"\n");

        System.out.print("Popped element from stack1 is " + " : " +  stack.pop1() +"\n");
    }
}

