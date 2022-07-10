package geeksforgeeks.binaryTree.introduction;

public class Q_009_BinaryTreeArrayImpl {

    static String[] str = new String[10];
    static int root = 0;

    public static void main(String[] args){

        Root("A");
        setLeft("B", 0);
        setRight("C", 0);
        setLeft("D", 1);
        setRight("E", 1);
        setLeft("F", 2);
        setRight("G", 2);

        System.out.println("Binary Tree in array implementation is: ");
        printTree();

    }

    private static void printTree() {

        for(int i = 0; i < str.length; i++){
            if(str[i] != null){
                System.out.print(str[i] + " ");
            }else {
                System.out.print("- ");
            }
        }
    }

    private static void setLeft(String key, int root) {

        int t = (root * 2) + 1;

        if(str[root] == null){
            System.out.println("No Parent Found.");
        }else{
            str[t] = key;
        }
    }

    private static void setRight(String key, int root) {

        int t = (root * 2) + 2;

        if(str[root] == null){
            System.out.println("No Parent Found.");
        }else{
            str[t] = key;
        }
    }

    private static void Root(String key) {

        str[0] = key;
    }
}
