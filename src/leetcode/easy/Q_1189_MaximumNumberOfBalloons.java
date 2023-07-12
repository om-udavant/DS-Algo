package leetcode.easy;

public class Q_1189_MaximumNumberOfBalloons {

    /*
     * Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.
     * You can use each character in text at most once. Return the maximum number of instances that can be formed.
     *
     */

    public static void main(String[] args) {

    }

    public int maxNumberOfBalloons(String text) {

        if (text.length() < 6) {
            return 0;
        }

        int balloon[] = new int[5];

        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b':
                    balloon[0]++;
                    break;
                case 'a':
                    balloon[1]++;
                    break;
                case 'l':
                    balloon[2]++;
                    break;
                case 'o':
                    balloon[3]++;
                    break;
                case 'n':
                    balloon[4]++;
                    break;
            }
        }

        balloon[2] /= 2;
        balloon[3] /= 2;

        if (balloon[2] <= 0 || balloon[3] <= 0) {
            return 0;
        }

        int min = balloon[0];

        for (int i = 1; i < 5; i++) {
            if (balloon[i] < min) {
                min = balloon[i];
            }
        }

        if (min <= 0) {
            return 0;
        }


        return min;


    }
}
