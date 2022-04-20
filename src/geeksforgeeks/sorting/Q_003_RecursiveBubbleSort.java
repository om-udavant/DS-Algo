package geeksforgeeks.sorting;

public class Q_003_RecursiveBubbleSort {

    public static void main(String[] args){
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;

        Q_003_RecursiveBubbleSort ob = new Q_003_RecursiveBubbleSort();

        ob.bubbleSort(arr, n);
        ob.printarr(arr, n);
    }

    private void printarr(int[] arr, int n) {
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private void bubbleSort(int[] arr, int n) {

        if(n == 1){
            return;
        }

        for(int i = 0; i < n - 1; i++){
            if(arr[i] > arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubbleSort(arr, n-1);
    }
}
