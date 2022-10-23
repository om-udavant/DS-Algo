package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_401_BinaryWatch {

    /*
     *
     * A binary watch has 4 LEDs on the top to represent the hours (0-11),
     * and 6 LEDs on the bottom to represent the minutes (0-59). Each LED represents a zero or one,
     * with the least significant bit on the right.
     * */

    public static void main(String[] args) {

    }

    public List<String> readBinaryWatch(int turnedOn) {

        List<String> list = new ArrayList<>();

        for (int hour = 0; hour < 12; hour++) {
            for (int min = 0; min < 60; min++) {

                if ((Integer.bitCount(hour) + Integer.bitCount(min)) == turnedOn) {

                    if (min < 10) {
                        list.add(String.format("%d:0%d", hour, min));
                    } else {
                        list.add(String.format("%d:%d", hour, min));
                    }
                }

            }
        }

        return list;

    }
}
