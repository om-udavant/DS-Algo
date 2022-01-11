package geeksforgeeks.arrays.rearrangement;

public class Q_001_RearrangeArray {

    public static void main(String[] args){

        int[] arr = { -1, -1, 6, 1, 9, 3, 10, 2, 4, -1};
        int n = arr.length;

        rearrange(arr, n);
    }

    private static void rearrange(int[] arr, int n) {

        int i, j, temp;

        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){

                if(arr[j] == i){

                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;

                }

            }
        }

        for(i = 0; i < n; i++){

            if(arr[i] != i){
                arr[i] = -1;
            }
        }

        System.out.println("Array after Rearranging");
        for(i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
