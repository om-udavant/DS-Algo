package leetcode.easy;

import java.util.HashSet;

public class Q_771_JewelsAndStones {

    /*
     * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
     * Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
     * Letters are case sensitive, so "a" is considered a different type of stone from "A".
     *
     */

    public static void main(String[] args) {

    }

    public int numJewelsInStones(String jewels, String stones) {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }

        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}
