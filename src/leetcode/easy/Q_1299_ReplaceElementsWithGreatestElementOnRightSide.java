package leetcode.easy;

public class Q_1299_ReplaceElementsWithGreatestElementOnRightSide {

    /*
     * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
     * After doing so, return the array.
     *
     */

    public static void main(String[] args) {

    }

    public int[] replaceElements(int[] arr) {


        int[] ans = new int[arr.length];
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            ans[i] = max;
            if (arr[i] >= max) max = arr[i];
        }
        return ans;

      /*
      for(int i = 0; i < arr.length; i++){

        int max = 0;
        for(int j = i; j < arr.length - 1; j++){
          max = Math.max(arr[j + 1], max);
        }

        arr[i] = max;

      }

      arr[arr.length - 1] = -1;

      return arr;
*/
    }

}
