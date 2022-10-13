package leetcode.easy;

public class Q_168_ExcelSheetColumnTitle {

    /*
     *
     * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
     *
     * */

    public String convertToTitle(int columnNumber) {

        StringBuilder s = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;

            s.append((char) ('A' + (columnNumber % 26)));

            columnNumber = columnNumber / 26;
        }

        return s.reverse().toString();

    }

}
