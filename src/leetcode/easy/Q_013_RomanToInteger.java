package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Q_013_RomanToInteger {

    /*
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     * For example,
     * 2 is written as II in Roman numeral, just two ones added together.
     * 12 is written as XII, which is simply X + II.
     * The number 27 is written as XXVII, which is XX + V + II.
     * */

    public static void main(String[] args) {

    }

    public int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                ans += map.get(s.charAt(i));
            } else {
                ans -= map.get(s.charAt(i));
            }
        }

        ans += map.get(s.charAt(s.length() - 1));
        return ans;

    }
}
