package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_1380_LuckyNumbersInAMatrix {

    public static void main(String[] args) {

    }

    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList();
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rowMin = new int[m];
        int[] index = new int[m];
        int[] colMax = new int[n];

        for(int i = 0; i < m; i++){
            int min = matrix[i][0];
            int ind = 0;
            for(int j = 0; j < n; j++){
                if(min > matrix[i][j]){
                    ind = j;
                    min = matrix[i][j];
                }
            }
            rowMin[i] = min;
            index[i] = ind;
        }

        for(int i = 0; i < n; i++){
            int max = matrix[0][i];
            for(int j = 0; j < m; j++){
                if(max < matrix[j][i]){
                    max = matrix[j][i];
                }
            }
            colMax[i] = max;
        }
        matrix = null;

        for(int i = 0; i < m; i++){
            if(rowMin[i] == colMax[index[i]]){
                list.add(rowMin[i]);
            }
        }
        rowMin = null;
        colMax = null;
        return list;
    }

}
