package leetcode.medium;

import java.util.LinkedList;
import java.util.List;

public class Q_0017_LetterCombinationsOfAPhoneNumber {

    /**
     * Given a string containing digits from 2-9 inclusive,
     * return all possible letter combinations that the number could represent.
     * Return the answer in any order.
     * A mapping of digits to letters (just like on the telephone buttons) is given below.
     * Note that 1 does not map to any letters.
     */

    public static void main(String[] args) {

    }

    public List<String> letterCombinations(String digits) {

        LinkedList<String> output = new LinkedList();
        if (digits.length() == 0) {
            return output;
        }

        output.add("");
        String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (int i = 0; i < digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            while (output.peek().length() == i) {
                String permutation = output.remove();
                for (char c : map[index].toCharArray()) {
                    output.add(permutation + c);
                }
            }
        }

        return output;

    }
}
