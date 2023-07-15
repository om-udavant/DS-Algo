package leetcode.easy;

public class Q_1217_MinimumCostToMoveChipsToTheSamePosition {

    /*
     * We have n chips, where the position of the ith chip is position[i].
     * We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:
     *   - position[i] + 2 or position[i] - 2 with cost = 0.
     *   - position[i] + 1 or position[i] - 1 with cost = 1.
     * Return the minimum cost needed to move all the chips to the same position.
     *
     */

    public static void main(String[] args) {

    }

    public int minCostToMoveChips(int[] position) {
        int[] count = new int[2];

        for (int chip : position){
            ++count[chip % 2];  // even - count[0] or odd - count[1]
        }

        return Math.min(count[0], count[1]);

    }
}
