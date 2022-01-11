package geeksforgeeks.arrays.rearrangement;

//Java program to push zeroes to back of array

public class Q_006_PushZero {

    public static void main (String[] args)
    {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        rearrange(arr, 0, n - 1);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }

    static void rearrange(int arr[], int start, int end) {

        int temp;

        while(start < end){

            if(arr[start] == 0){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                while (arr[end] == 0){
                    end--;
                }
            }
            start++;
        }

    }


}
