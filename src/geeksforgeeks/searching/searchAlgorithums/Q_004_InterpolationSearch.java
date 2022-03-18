package geeksforgeeks.searching.searchAlgorithums;

public class Q_004_InterpolationSearch {

    public static void main(String[] args){
        int[] arr = {1, 0, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};

        int n = arr.length;
        int find = 33;

        int index = interpolation(arr, 0, n - 1, find);

        if (index != -1)
            System.out.println("Element found at index "
                    + index);
        else
            System.out.println("Element not found.");
    }

    public static int interpolation(int arr[], int low, int high, int find)
    {
        int pos;

        if (low <= high && find >= arr[low] && find <= arr[high]) {

            pos = low + (((high - low) / (arr[high] - arr[low])) * (find - arr[low]));

            if (arr[pos] == find){
                return pos;
            }

            if (arr[pos] < find){
                return interpolation(arr, pos + 1, high, find);
            }

            if (arr[pos] > find){
                return interpolation(arr, low, pos - 1, find);
            }
        }
        return -1;
    }
}

