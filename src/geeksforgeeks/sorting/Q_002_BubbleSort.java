package geeksforgeeks.sorting;

public class Q_002_BubbleSort {
    public static void main(String[] args) {

        Q_002_BubbleSort sort = new Q_002_BubbleSort();

        int[] arr = {64, 25, 12, 22, 11};

        sort.bubble(arr);
        sort.print(arr);
    }

    private void print(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private void bubble(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n -1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
    }
}
