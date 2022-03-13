package geeksforgeeks.searching.searchAlgorithums;

public class Q_003_JumpSearch {

    public static void main(String[] args) {
        int[] arr = {15, 21, 35, 44, 57, 63, 77, 89, 90, 101, 110, 124, 131, 142, 158, 167};
        int x = 77;

        int index = jump(arr, x);

        if (index == -1) {
            System.out.println("Element is not present.");
        } else {
            System.out.println("Element is present at the Index : " + index);
        }

    }

    private static int jump(int[] arr, int x) {

        int n = arr.length;
        int m = (int) Math.floor(Math.sqrt(n));
        int current = 1;

        while (current < n && x > arr[current]) {
            current += m;
        }

        if (arr[current - 1] == x) {
            return (current - 1);
        }

        for (int i = current; i < n; i++) {
            if (x == arr[i]) {
                return i;
            }

        }

        return -1;
    }
}
