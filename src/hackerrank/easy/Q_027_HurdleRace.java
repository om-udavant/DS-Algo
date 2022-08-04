package hackerrank.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q_027_HurdleRace {

    /*
     * Complete the 'hurdleRace' function below.
     *
     * A video player plays a game in which the character competes in a hurdle race.
     * Hurdles are of varying heights, and the characters have a maximum height they can jump.
     * There is a magic potion they can take that will increase their maximum jump height by 1
     * unit for each dose. How many doses of the potion must the character take to be able to jump
     * all the hurdles. If the character can already clear all of the hurdles, return 0.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static void main(String[] args) {

        List<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(6);
        height.add(3);
        height.add(5);
        height.add(2);

        int k = 4;

        int result = hurdleRace(k, height);

        System.out.println(result);
    }

    private static int hurdleRace(int k, List<Integer> height) {

        int max = Collections.max(height);
        /*
         for(int i = 0; i < height.size(); i++){
            if(height.get(i) > max){
                max = height.get(i);
            }
        }
        */

        if (max > k) {
            return Math.abs(k - max);
        } else {
            return 0;
        }
    }
}
