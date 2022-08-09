package hackerrank.easy;

public class Q_032_ViralAdvertising {

    /*
     * Complete the 'viralAdvertising' function below.
     *
     * HackerLand Enterprise is adopting a new viral advertising strategy.
     * When they launch a new product, they advertise it to exactly 5 people on social media.
     * On the first day, half of those 5 people like the advertisement and each shares it with
     * 3 of their friends. At the beginning of the second day, floor(5/2) * 3 = 2 * 3 = 6
     * people receive the advertisement.Each day, floor(recipients/2) of the
     * recipients like the advertisement and will share it with 3 friends on the following day.
     * Assuming nobody receives the advertisement twice, determine how many people have liked the
     * ad by the end of a given day, beginning with launch day as day 1.
     *
     * Example
     * n = 5
     *
     * Day Shared Liked Cumulative
     *  1      5     2       2
     *  2      6     3       5
     *  3      9     4       9
     *  4     12     6      15
     *  5     18     9      24
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static void main(String[] args) {

        int n = 5;

        int result = viralAdvertising(n);
        System.out.println(result);
    }

    private static int viralAdvertising(int n) {

        int shared = 5;
        int liked = 0;
        int cum = 0;

        for (int i = 0; i < n; i++) {
            liked = shared / 2;
            shared = liked * 3;
            cum = cum + liked;
        }

        return cum;

            /*int current = 5;
            int num = 2;
            for(int i =  1; i  < n; i++){
                current = (current / 2) * 3;
                num = num + (current/2);
            }
            return num;*/
    }
}
