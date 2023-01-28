package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q_706_DesignHashMap {

    /**
     * Design a HashMap without using any built-in hash table libraries.
     *
     * Implement the MyHashMap class:
     *
     * - MyHashMap() initializes the object with an empty map.
     * - void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map,
     * update the corresponding value.
     * - int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
     * - void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
     *
     * Your MyHashMap object will be instantiated and called as such:
     * MyHashMap obj = new MyHashMap();
     * obj.put(key,value);
     * int param_2 = obj.get(key);
     * obj.remove(key);
     */

    public static void main(String[] args) {

    }

    List<Pair>[] arr;

    public void MyHashMap() {
        arr = new List[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }
    }

    public void put(int key, int value) {
        int idx = key % 100;
        List<Pair> list = arr[idx];
        boolean existingReplaced = false;
        for (int i = 0; i < list.size(); i++) {
            Pair cur = list.get(i);
            if (cur.getKey() == key) {
                cur.setVal(value);
                existingReplaced = true;
                break;
            }
        }

        if (!existingReplaced) {
            list.add(new Pair(key, value));
        }
    }

    public int get(int key) {
        int idx = key % 100;
        List<Pair> list = arr[idx];
        for (int i = 0; i < list.size(); i++) {
            Pair cur = list.get(i);
            if (cur.getKey() == key) {
                return cur.getVal();
            }
        }
        return -1;
    }

    public void remove(int key) {

        int idx = key % 100;
        List<Pair> list = arr[idx];
        for (int i = 0; i < list.size(); i++) {
            Pair cur = list.get(i);
            if (cur.getKey() == key) {
                list.remove(i);
                break;
            }
        }

    }

    class Pair {
        int key;
        int val;

        public Pair() {
        }

        public Pair(int key, int val) {
            this.key = key;
            this.val = val;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }
}
