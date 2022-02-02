import java.util.*;
public class Que14 {
    public static void main(String[] args) {
      
        System.out.println(findMaximumNum("61892795431", 4));
        
    }

    public static String findMaximumNum(String str, int k) {
        int N = str.length();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.valueOf(str.charAt(i) + "");
        }
        int swaps = 0;
        for (int i = 0; i < N - 1; i++) {
            if (swaps == k)
                break;
            int maxIndex = findMaxInRange(arr, i + 1, N - 1);
            if (arr[i] < arr[maxIndex]) {
                swap(arr, i, maxIndex);
                swaps++;
            }
        }

        String out = "";
        for (int i = 0; i < N; i++) {
            out = out + arr[i] + "";
        }

        return out;
    }

    private static int findMaxInRange(int[] arr, int i, int j) {
        int max = Integer.MIN_VALUE;
        int maxIndex = i;
        for (int k = i; k <= j; k++) {
            if (arr[k] >= max) {
                max = arr[k];
                maxIndex = k;
            }
        }
        return maxIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        System.out.println("swapping " + arr[i] + " and " + arr[j] + " from " + Arrays.toString(arr));
        int ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
    }

}
