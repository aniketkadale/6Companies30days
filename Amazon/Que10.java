import java.util.*;

public class Que10 {
    public static void main(String[] args) {
        char[] nuts = { '@', '%', '$', '#', '^' };
        char[] bolts = { '%', '@', '#', '$', '^' };
        int n = 5;

        matchPairs(nuts, bolts, n);

    }

    static void matchPairs(char nuts[], char bolts[], int n) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nuts[i], i);

        }

        for (int i = 0; i < n; i++) {
            if (map.containsKey(bolts[i])) {
                nuts[i] = bolts[i];

            }
        }

        Arrays.sort(nuts);
        Arrays.sort(bolts);

        System.out.println(nuts);
        System.out.println(bolts);
    }

}
