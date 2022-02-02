import java.util.*;

public class Que7 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(3);
    
        int N = 5;

        System.out.println(find3Numbers(list, N));

    }

    static ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        int max = n - 1;
        int min = 0;
        int i = 0;

        int[] smaller = new int[n];
        smaller[0] = -1;
        for (i = 1; i < n; i++) {
            if (arr.get(i) <= arr.get(min)) {
                min = i;
                smaller[i] = -1;
            } else
                smaller[i] = min;
        }

        int[] greater = new int[n];
        greater[n - 1] = -1;
        for (i = n - 2; i >= 0; i--) {
            if (arr.get(i) >= arr.get(max)) {
                max = i;
                greater[i] = -1;
            } else
                greater[i] = max;
        }

        ArrayList<Integer> r = new ArrayList<Integer>();

        for (i = 0; i < n; i++) {
            if (smaller[i] != -1 && greater[i] != -1) {

                r.add(arr.get(smaller[i]));
                r.add(arr.get(i));
                r.add(arr.get(greater[i]));
                return r;
            }
        }

        return r;
    }

}
