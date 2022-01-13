package geeksforgeeks.arrays.queries;

// Java Program to compute sum of ranges for different range
// queries.

import java.util.ArrayList;

class Query{
    int left,right;

    Query(int left, int right){
        this.left = left;
        this.right = right;
    }
}

public class Q_001_MosAlgorithm {

    public static void main(String[] args){
        int[] arr = {1, 1, 2, 1, 3, 4, 5, 2, 8};
        int n = arr.length;

        ArrayList<Query> query = new ArrayList<Query>();
        query.add(new Query(0, 4));
        query.add(new Query(1, 3));
        query.add(new Query(2, 4));

        int m = query.size();
        querySum(n, arr, query, m);
    }

    private static void querySum(int n, int[] arr, ArrayList<Query> query, int m) {

        for(int i = 0; i < m; i++){

            int l = query.get(i).left, r = query.get(i).right;

            int sum = 0;
            for(int j = l; j <= r; j++){
                sum += arr[j];
            }

            System.out.println("Sum of [" + l + ", " + r + "] is " + sum);
        }
    }
}
