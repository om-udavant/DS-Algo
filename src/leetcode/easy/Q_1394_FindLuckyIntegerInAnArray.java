package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Q_1394_FindLuckyIntegerInAnArray {

    public static void main(String[] args) {

    }

    public int findLucky(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int n : arr)
        {
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        int res = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getKey() == entry.getValue() )
            {
                res = entry.getKey();
            }
        }

        if(res == 0)
        {
            return -1;
        }
        return res;

    }

}
