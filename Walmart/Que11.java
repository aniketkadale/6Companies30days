import java.util.*;

public class Que11 {
    public static void main(String[] args) {
        int n = 6;
        int[] speed = {2, 10, 3, 1, 5, 8};
        int[] efficiency = {5, 4, 3, 9, 7, 2}; 
        int k = 2;

        System.out.println(maxPerformance(n, speed, efficiency, k));
        
    }

    public static int maxPerformance(int n, int[] speed, final int[] efficiency, int k) {

        HashMap<Integer, Integer> indexes = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexes.put(i, efficiency[i]);

        }

        ArrayList<Integer> keySet = new ArrayList<>(indexes.keySet());
        Collections.sort(keySet, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return Integer.compare(efficiency[t1], efficiency[integer]);
            }
        });

        PriorityQueue<Integer> sp = new PriorityQueue<>();
        long sum = 0, max = 0;
        for (int key : keySet) {
            sp.add(speed[key]);
            sum += speed[key];

            long performance = sum * efficiency[key];
            if (max < performance) {
                max = performance;
            }

            if (sp.size() == k) {

                sum -= sp.poll();
            }
        }

        return (int) (max % 1000000007L);
    }

}
