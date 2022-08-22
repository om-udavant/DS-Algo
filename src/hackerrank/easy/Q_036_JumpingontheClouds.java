package hackerrank.easy;

public class Q_036_JumpingontheClouds {

    public static void main(String[] args) {

        int[] c = {0, 0, 1, 0, 0, 1, 1, 0};
        int k = 2;

        int result = jumpingOnClouds(c, k);

        System.out.println(result);
    }

    private static int jumpingOnClouds(int[] c, int k) {

        int index = 0;
        int e = 100;

        for (int i = 0; i < c.length; i++) {
            index = (index + k) % c.length;
            if (c[index] == 1) {
                e = e - 3;
            } else {
                e = e - 1;
            }
            if (index == 0) {
                break;
            }
        }

        return e;
    }
}
