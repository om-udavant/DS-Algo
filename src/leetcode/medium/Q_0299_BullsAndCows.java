package leetcode.medium;

public class Q_0299_BullsAndCows {

    /*
     * You are playing the Bulls and Cows game with your friend.
     *
     * You write down a secret number and ask your friend to guess what the number is.
     * When your friend makes a guess, you provide a hint with the following info:
     *   -The number of "bulls", which are digits in the guess that are in the correct position.
     *   -The number of "cows", which are digits in the guess that are in your secret number but are located in the wrong position.
     *    Specifically, the non-bull digits in the guess that could be rearranged such that they become bulls.
     *
     * Given the secret number secret and your friend's guess guess, return the hint for your friend's guess.
     *
     * The hint should be formatted as "xAyB", where x is the number of bulls and y is the number of cows. Note that both secret and guess may contain duplicate digits.
     *
     */

    public static void main(String[] args) {

    }

    public String getHint(String secret, String guess) {

        int[] num1 = new int[10];
        int[] num2 = new int[10];

        int A = 0;
        int B = 0;

        for (int i = 0; i < secret.length(); i++) {

            if (secret.charAt(i) == guess.charAt(i)) {
                A++;
                num1[secret.charAt(i) - '0']--;
            }

            num1[secret.charAt(i) - '0']++;

        }

        for (int i = 0; i < guess.length(); i++) {
            if (num1[guess.charAt(i) - '0'] != 0 && secret.charAt(i) != guess.charAt(i)) {
                B++;
                num1[guess.charAt(i) - '0']--;
            }
        }

        return (A + "A" + B + "B");

    }
}
