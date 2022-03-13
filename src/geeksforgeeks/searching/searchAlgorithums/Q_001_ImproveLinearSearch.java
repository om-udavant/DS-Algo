package geeksforgeeks.searching.searchAlgorithums;

public class Q_001_ImproveLinearSearch {

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 5, 8, 6, 78};
        int find = 8;

        search(arr, find);
    }

    private static void search(int[] arr, int find) {

        int left = 0;
        int right = arr.length - 1;
        int length = arr.length;
        int postion = -1;

        for(left = 0; left <= right;){

            if(arr[left] == find){
                postion = left;
                System.out.println("Element found in Array at " + (postion + 1) + " Position with " + (left + 1) + " Attempt.");
                break;
            }

            if(arr[right] == find){
                postion = right;
                System.out.println("Element found in Array at " + (postion + 1) + " Position with " + (length - right) + " Attempt.");
                break;
            }

            left++;
            right--;
        }

        if (postion == -1){
            System.out.println("Not found in Array with " + left + " Attempt.");
        }
    }
}
