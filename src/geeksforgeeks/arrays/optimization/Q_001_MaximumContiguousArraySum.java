package geeksforgeeks.arrays.optimization;

public class Q_001_MaximumContiguousArraySum {

    public static void main(String[] args){

        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

        System.out.println("Maximum Contiguous Array sum is " + maxArraySum(arr));
    }

    private static int maxArraySum(int[] arr) {

        int n = arr.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for(int i = 0; i < n; i++){
            max_ending_here = max_ending_here + arr[i];

            if(max_ending_here > max_so_far){
                max_so_far = max_ending_here;
            }
            if(max_ending_here < 0){
                max_ending_here = 0;
            }
        }

        return max_so_far;
    }
}
