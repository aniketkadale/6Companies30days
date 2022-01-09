// Goldman Sachs Question15 - https://practice.geeksforgeeks.org/problems/array-pair-sum-divisibility-problem3257/1#

import java.util.*;

public class Que15 {
    public static void main(String[] args) {
        int[] arr = { 9, 5, 7, 3 };
        int k = 6;

        System.out.println(canPair(arr, k));

    }

    static boolean canPair(int[] arr, int k) {

        if (arr.length % 2 == 1)
            return false;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int rem = ((arr[i] % k) + k) % k;
            if (!map.containsKey(rem)) {
                map.put(rem, 0);
            }

            map.put(rem, map.get(rem) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            int rem = ((arr[i] % k) + k) % k;

            if (2 * rem == k) {

                if (map.get(rem) % 2 == 1)
                    return false;
            } else if (rem == 0) {
                if (map.get(rem) % 2 == 1)
                    return false;

            } else {
                if (map.get(k - rem) != map.get(rem))
                    return false;
            }
        }

        return true;
    }

}
