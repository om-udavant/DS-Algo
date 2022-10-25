package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_412_FizzBuzz {

    /*
     *
     * Given an integer n, return a string array answer (1-indexed) where:
     * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
     * answer[i] == "Fizz" if i is divisible by 3.
     * answer[i] == "Buzz" if i is divisible by 5.
     * answer[i] == i (as a string) if none of the above conditions are true.
     * */

    public static void main(String[] args) {

    }

    public List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                list.add("FizzBuzz");
                continue;
            } else if (i % 3 == 0) {
                list.add("Fizz");
                continue;
            } else if (i % 5 == 0) {
                list.add("Buzz");
                continue;
            } else {
                list.add(Integer.toString(i));
            }
        }

        return list;

    }
}
