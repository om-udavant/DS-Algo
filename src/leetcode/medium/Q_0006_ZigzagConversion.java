package leetcode.medium;

public class Q_0006_ZigzagConversion {

    /*
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * And then read line by line: "PAHNAPLSIIGYIR"
     * Write the code that will take a string and make this conversion given a number of rows:
     * string convert(string s, int numRows);
     *
     */

    public static void main(String[] args) {

    }

    public String convert(String s, int numRows) {

        StringBuilder[] sb = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }

        char[] arr = s.toCharArray();
        int n = arr.length;
        int index = 0;

        while (index < n) {
            for (int j = 0; j < numRows && index < n; j++) {
                sb[j].append(arr[index++]);
            }

            for (int j = numRows - 2; j > 0 && index < n; j--) {
                sb[j].append(arr[index++]);
            }
        }

        StringBuilder res = sb[0];
        for (int i = 1; i < numRows; i++) {
            res.append(sb[i].toString());
        }

        return res.toString();

    }

}
