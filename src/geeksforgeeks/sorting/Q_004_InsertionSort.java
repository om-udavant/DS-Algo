package geeksforgeeks.sorting;

public class Q_004_InsertionSort {
    public static void main(String[] args){
        int arr[] = { 12, 11, 13, 5, 6 };
        
        Q_004_InsertionSort ob = new Q_004_InsertionSort();
        ob.insertionSort(arr);
        
        printarr(arr);
        
    }

    private static void printarr(int[] arr) {

        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int temp = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
}
