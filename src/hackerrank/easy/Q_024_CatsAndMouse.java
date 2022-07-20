package hackerrank.easy;

public class Q_024_CatsAndMouse {

    /*
     *
     * the form of x, y, and z representing the respective positions
     * for cats A and B, and for mouse C. Complete the function catAndMouse
     * to return the appropriate answer.
     *
     * If cat A catches the mouse first, print Cat A.
     * If cat B catches the mouse first, print Cat B.
     * If both cats reach the mouse at the same time,
     * print Mouse C as the two cats fight and mouse escapes.
     *
     */

    public static void main(String[] args) {
        int x = 1, y = 2, z = 3;

        String result = catAndMouse(x, y, z);

        System.out.println(result);
    }

    private static String catAndMouse(int x, int y, int z) {

        int a = Math.abs(x - z);
        int b = Math.abs(y - z);
        if (a == b) {
            return "Mouse C";
        } else if (a < b) {
            return "Cat A";
        } else {
            return "Cat B";
        }
    }
}
