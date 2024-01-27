package leetcode.TopInterview150.medium;

import java.util.*;

public class Q_0380_InsertDeleteGetRandom {

    /*
     * Implement the RandomizedSet class:
     *   - RandomizedSet() Initializes the RandomizedSet object.
     *   - bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
     *   - bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
     *   - int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
     * You must implement the functions of the class such that each function works in average O(1) time complexity.
     *
     */

    public static void main(String[] args) {

    }

    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> arr = new ArrayList<>();
    Random random = new Random();

    public Q_0380_InsertDeleteGetRandom() {

    }

    public boolean insert(int val) {

        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, arr.size());
        arr.add(val);
        return true;

    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        int index = map.get(val);

        if (index != arr.size() - 1) {
            int tailVal = arr.get(arr.size() - 1);
            int currentVal = arr.get(index);
            arr.set(index, tailVal);
            arr.remove(arr.size() - 1);
            map.remove(currentVal);
            map.put(tailVal, index);
        } else {
            int tailVal = arr.remove(arr.size() - 1);
            map.remove(tailVal);
        }

        return true;

    }

    public int getRandom() {
        int randomIndex = random.nextInt(arr.size());
        return arr.get(randomIndex);
    }
}
