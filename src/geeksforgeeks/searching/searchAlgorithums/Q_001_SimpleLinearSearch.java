package geeksforgeeks.searching.searchAlgorithums;

public class Q_001_SimpleLinearSearch {

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 5, 8, 6, 78};
        int find = 8;

        int result = search(arr, find);

        if (result == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element is present at the index " + result);
        }
    }

    private static int search(int[] arr, int find) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                return i;
            }
        }
        return -1;
    }
}
