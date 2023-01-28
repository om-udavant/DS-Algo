package leetcode.easy;

import java.util.LinkedList;
import java.util.List;

public class Q_705_DesginHashSet {

    /**
     * Design a HashSet without using any built-in hash table libraries.
     *
     * Implement MyHashSet class:
     *
     * - void add(key) Inserts the value key into the HashSet.
     * - bool contains(key) Returns whether the value key exists in the HashSet or not.
     * - void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
     *
     * Your MyHashSet object will be instantiated and called as such:
     * MyHashSet obj = new MyHashSet();
     * obj.add(key);
     * obj.remove(key);
     * boolean param_3 = obj.contains(key);
     */

    public static void main(String[] args) {

    }

    int buckets = 15000;
    List<Integer> arr[];

    private int hashingFunction(int key) {
        return key % buckets;
    }

    public void MyHashSet() {
        arr = new LinkedList[15000];
    }

    public void add(int key) {
        int idx = hashingFunction(key);

        if (arr[idx] == null) {
            arr[idx] = new LinkedList<>();
        }

        List<Integer> list = arr[idx];

        if (!list.contains(key)) {
            list.add(key);
        }
    }

    public void remove(int key) {
        int idx = hashingFunction(key);
        if (arr[idx] != null) {
            List<Integer> list = arr[idx];
            for (int i = 0; i < list.size(); i++) {
                if (key == list.get(i)) {
                    list.remove(i);
                }
            }
        }
    }

    public boolean contains(int key) {
        int idx = hashingFunction(key);
        if (arr[idx] != null) {
            List<Integer> list = arr[idx];
            for (int i = 0; i < list.size(); i++) {
                if (key == list.get(i)) {
                    return true;
                }
            }
        }

        return false;
    }
}
