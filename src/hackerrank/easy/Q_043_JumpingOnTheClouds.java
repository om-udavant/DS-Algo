package hackerrank.easy;

import java.util.ArrayList;

public class Q_043_JumpingOnTheClouds {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static void main(String[] args) {

        ArrayList<Integer> c = new ArrayList<>();
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);
        c.add(0);
        c.add(1);
        c.add(0);

        int result = jumpingOnClouds(c);
        System.out.println(result);
    }

    private static int jumpingOnClouds(ArrayList<Integer> c) {

        int jump = 0;
        int i = 0;

        while (i < c.size() - 1) {
            if (i + 2 == c.size() || c.get(i + 2) == 1) {
                jump++;
                i++;
            } else {
                i += 2;
                jump++;
            }
        }

        return jump;
    }
}
