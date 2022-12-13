package leetcode.easy;

import java.util.PriorityQueue;

public class Q_703_KthLargestElementInAStream {

    /*
     * Design a class to find the kth largest element in a stream. Note that it is the kth largest element in the sorted order,
     * not the kth distinct element.
     * Implement KthLargest class:
     * KthLargest(int k, int[] nums) Initializes the object with the integer k and the stream of integers nums.
     * int add(int val) Appends the integer val to the stream and returns the element representing the kth largest element in the stream.
     */

    public Q_703_KthLargestElementInAStream(PriorityQueue<Integer> minHeap, int k) {
        this.minHeap = minHeap;
        this.k = k;
    }

    public static void main(String[] args) {

    }

    private PriorityQueue<Integer> minHeap;
    private int k;

    public void KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        for (Integer i : nums) {
            add(i);
        }
    }

    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }

        return minHeap.peek();

    }
}
