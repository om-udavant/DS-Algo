package hackerrank.medium;

import java.util.*;

public class Q_002_ClimbingTheLeaderboard {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static void main(String[] args) {

        List<Integer> ranked = new ArrayList<>();
        ranked.add(100);
        ranked.add(100);
        ranked.add(50);
        ranked.add(40);
        ranked.add(40);
        ranked.add(20);
        ranked.add(10);

        List<Integer> player = new ArrayList<>();
        player.add(5);
        player.add(25);
        player.add(50);
        player.add(120);

        List<Integer> ans = climbingLeaderboard(ranked, player);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }

    private static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {

        Set<Integer> rds = new HashSet<Integer>(ranked);
        List<Integer> ans = new ArrayList<>();
        int ps = player.size();

        List<Integer> rdl = new ArrayList<>(rds);
        Collections.sort(rdl, Collections.reverseOrder());

        int index;
        for (int i = 0; i < ps; i++) {
            index = binarySearch(rdl, player.get(i));
            ans.add(index + 1);
        }

        return ans;
    }

    private static int binarySearch(List<Integer> a, Integer target) {

        int start = 0;
        int end = a.size() - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == a.get(mid)) {
                return mid;
            } else if (target > a.get(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end + 1;
    }
}
