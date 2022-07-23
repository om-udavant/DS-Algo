package hackerrank.medium;

public class Q_001_FormingMagicSquare {

    /*
     * Complete the 'formingMagicSquare' function below.
     *
     * You will be given a 3x3 matrix s of integers in the inclusive range[1, 9].
     * We can convert any digit a to any other digit b in the range[1, 9] at cost of |a - b|.
     * Given s, convert it into a magic square at minimal cost. Print this cost on a new line.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY s as parameter.
     */

    public static void main(String[] args) {

        int[][] s = {{5, 3, 4}, {1, 5, 8}, {6, 4, 2}};

        int result = formingMagicSquare(s);
        System.out.println(result);
    }

    private static int formingMagicSquare(int[][] s) {

        int[][][] allPossibleMatrix = {

                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},

                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},

                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},

                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},

                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},

                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},

                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},

                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
        };

        int minCost = Integer.MAX_VALUE;

        for (int m = 0; m < 8; m++) {
            int cost = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    cost += Math.abs(s[i][j] - allPossibleMatrix[m][i][j]);
                }
            }

            minCost = Math.min(minCost, cost);
        }
        return minCost;
    }

}
