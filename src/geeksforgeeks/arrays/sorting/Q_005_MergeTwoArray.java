package geeksforgeeks.arrays.sorting;

// Java program to Merge an array of
// size n into another array of size m + n

public class Q_005_MergeTwoArray {

    public static void main(String[] args){
        int mPlusN[] = { 2, 8, -1, -1, -1, 13, -1, 15, 20 };
        int N[] = { 5, 7, 9, 25 };
        int n = N.length;
        int m = mPlusN.length - n;
        
        moveToEnd(mPlusN, m + n);

        merge(mPlusN, N, m, n);
        
        printArray(mPlusN, m + n);
    }

    private static void printArray(int[] mPlusN, int size) {

        int i;
        for (i = 0; i < size; i++){
            System.out.print(mPlusN[i] + " ");
        }

        System.out.println("");
    }

    private static void merge(int[] mPlusN, int[] N, int m, int n) {

        int i = n;

        int j = 0;

        int k = 0;

        while (k < (m + n))
        {
            if ((i < (m + n) && mPlusN[i] <= N[j]) || (j == n)) {
                mPlusN[k] = mPlusN[i];
                k++;
                i++;
            }
            else
            {
                mPlusN[k] = N[j];
                k++;
                j++;
            }
        }
    }

    private static void moveToEnd(int[] mPlusN, int size) {

        int i, j = size - 1;
        for (i = size - 1; i >= 0; i--) {
            if (mPlusN[i] != -1) {
                mPlusN[j] = mPlusN[i];
                j--;
            }
        }
    }
}
