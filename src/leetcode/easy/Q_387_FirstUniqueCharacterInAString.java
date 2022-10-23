package leetcode.easy;

public class Q_387_FirstUniqueCharacterInAString {

    /*
     *
     *Given a string s, find the first non-repeating character in it and return its index.
     * If it does not exist, return -1.
     * */

    public static void main(String[] args) {

    }

    public int firstUniqChar(String s) {

        int[] store = new int[26];

        for (char c : s.toCharArray()) {
            store[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (store[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;

    }
}
