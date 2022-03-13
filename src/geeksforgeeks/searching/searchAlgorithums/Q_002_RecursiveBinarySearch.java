package geeksforgeeks.searching.searchAlgorithums;

public class Q_002_RecursiveBinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int n = arr.length;
        int find = 10;
        int result = binarySearch(arr, 0, n - 1, find);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result);
    }

    private static int binarySearch(int[] arr, int l, int r, int find) {

        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == find) {
                return mid;
            }

            if (arr[mid] > find) {
                return binarySearch(arr, l, mid - 1, find);
            }

            return binarySearch(arr, mid + 1, r, find);
        }

        return -1;
    }

}
