package leetcode.easy;

public class Q_171_ExcelSheetColumnNumber {

    /*
     *
     * Given a string columnTitle that represents the column title as appears in an Excel sheet,
     * return its corresponding column number.
     *
     * */

    public int titleToNumber(String columnTitle) {

        int product = 0;
        int j = 0;

        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            product += (columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, j);
            j++;
        }
        return product;
    }
}
