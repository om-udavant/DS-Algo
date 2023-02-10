package codechief.interviewpreparation.basicProgrammingEasy;

import java.util.Scanner;

public class Q_008_TaxiCost {

    /*
     * Problem Code:RAIN8TEST
     *
     */

    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long cost = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 1 || (i != 0 && arr[i - 1] == 1)) {
                    cost += x;
                }
            }
            System.out.println(cost);
            t--;
        }

    }
}
