package leetcode.medium;

import java.util.HashMap;

public class Q_0012_IntegerToRoman {

    /*
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * For example, 2 is written as II in Roman numeral, just two one's added together.
     * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
     * Roman numerals are usually written largest to smallest from left to right.
     * However, the numeral for four is not IIII. Instead, the number four is written as IV.
     * Because the one is before the five we subtract it making four.
     * The same principle applies to the number nine, which is written as IX.
     * There are six instances where subtraction is used:
     *  -I can be placed before V (5) and X (10) to make 4 and 9.
     *  -X can be placed before L (50) and C (100) to make 40 and 90.
     *  -C can be placed before D (500) and M (1000) to make 400 and 900.
     * Given an integer, convert it to a roman numeral.
     *
     */

    public static void main(String[] args) {

    }

    public String intToRoman(int num) {

        StringBuilder str = new StringBuilder();

        while (num != 0) {

            if (num >= 1000) {
                num -= 1000;
                str.append("M");
            } else if (num >= 900) {
                num -= 900;
                str.append("CM");
            } else if (num >= 500) {
                num -= 500;
                str.append("D");
            } else if (num >= 400) {
                num -= 400;
                str.append("CD");
            } else if (num >= 100) {
                num -= 100;
                str.append("C");
            } else if (num >= 90) {
                num -= 90;
                str.append("XC");
            } else if (num >= 50) {
                num -= 50;
                str.append("L");
            } else if (num >= 40) {
                num -= 40;
                str.append("XL");
            } else if (num >= 10) {
                num -= 10;
                str.append("X");
            } else if (num >= 9) {
                num -= 9;
                str.append("IX");
            } else if (num >= 5) {
                num -= 5;
                str.append("V");
            } else if (num >= 4) {
                num -= 4;
                str.append("IV");
            } else if (num >= 1) {
                num -= 1;
                str.append("I");
            }

        }

        return str.toString();

        /*

        HashMap<Integer, String> map = new HashMap<>();
        fillMap(map);
        StringBuilder str = new StringBuilder();

        int temp = 1000;
       do{
            int n = num/temp;
            if(map.get(n*temp) != null){
                str.append(map.get(n*temp));
            }
            num %= temp;
            temp /= 10;
        }while(num > 0);

        return str.toString();0

         */

    }

    public void fillMap(HashMap<Integer, String> map) {
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(20, "XX");
        map.put(30, "XXX");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(60, "LX");
        map.put(70, "LXX");
        map.put(80, "LXXX");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(200, "CC");
        map.put(300, "CCC");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(600, "DC");
        map.put(700, "DCC");
        map.put(800, "DCCC");
        map.put(900, "CM");
        map.put(1000, "M");
        map.put(2000, "MM");
        map.put(3000, "MMM");
    }
}
