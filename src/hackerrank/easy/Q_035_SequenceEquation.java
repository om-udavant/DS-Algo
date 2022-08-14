package hackerrank.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_035_SequenceEquation {

    /*
     * Complete the 'permutationEquation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY p as parameter.
     */

    public static void main(String[] args) {

        List<Integer> p = new ArrayList<>();
        p.add(4);
        p.add(3);
        p.add(5);
        p.add(1);
        p.add(2);

        List<Integer> result = permutationEquation(p);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result);
        }

    }

    private static List<Integer> permutationEquation(List<Integer> p) {
        ArrayList<Integer> list = new ArrayList<>();
        int x = 1, y = 0;
        while (x <= p.size()) {
            for (int i = 0; i < p.size(); i++) {
                if (p.get(i) == x) {
                    for (int j = 0; i < p.size(); j++) {
                        if (p.get(j) == (i + 1)) {
                            y = j + 1;
                            break;
                        }
                    }
                    list.add(y);
                    y = 0;
                    x++;
                    break;
                }
            }
        }

        return list;
    }
}
