import java.util.*;

public class Que12 {
    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        int n = 6;

        System.out.println(leaders(arr, n));

    }

    static ArrayList<Integer> leaders(int arr[], int n) {

        int maxEle = arr[n - 1];

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = n - 1; i >= 0; i--) {

            if (arr[i] >= maxEle) {

                maxEle = arr[i];

                res.add(maxEle);
            }
        }

        Collections.reverse(res);

        return res;
    }

}
