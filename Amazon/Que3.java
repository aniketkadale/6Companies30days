import java.util.*;

public class Que3 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int n = 9;
        int k = 3;

        System.out.println(max_of_subarrays(arr, n, k));

    }

    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {

        ArrayList<Integer> result = new ArrayList<Integer>(0);

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();

        int i = 0;

        for (i = 0; i < k; i++) {
            while (dq.isEmpty() == false && arr[i] >= arr[dq.peekLast()])
                dq.pollLast();

            dq.add(i);
        }

        for (; i < n; i++) {

            result.add(arr[dq.peek()]);

            while (dq.isEmpty() == false && (dq.peekFirst() <= i - k))
                dq.pollFirst();

            while (dq.isEmpty() == false && (arr[i] >= arr[dq.peekLast()]))
                dq.pollLast();

            dq.add(i);
        }

        result.add(arr[dq.peek()]);
        dq.pollFirst();

        return result;
    }

}
