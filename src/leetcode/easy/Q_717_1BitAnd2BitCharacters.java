package leetcode.easy;

public class Q_717_1BitAnd2BitCharacters {

    /*
     * We have two special characters:
     *   - The first character can be represented by one bit 0.
     *   - The second character can be represented by two bits (10 or 11).
     * Given a binary array bits that ends with 0, return true if the last character must be a one-bit character.
     *
     */

    public static void main(String[] args) {

    }

    public boolean isOneBitCharacter(int[] bits) {

        int count = 0;
        for (int i = bits.length - 2; i >= 0 && bits[i] != 0; i--) {
            count++;
        }
        if (count % 2 > 0) {
            return false;
        }

        return true;

    }
}
