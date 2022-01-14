public class Que2 {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 4, 7, 3, 2, 5 };

        System.out.println(longestMountain(arr));

    }

    public static int longestMountain(int[] arr) {
        int n = arr.length;
        int ans = 0;

        for (int i = 1; i <= n - 2;) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int count = 1;
                int j = i;
                while (j > 0 && arr[j] > arr[j - 1]) {
                    j--;
                    count++;
                }

                while (i < n - 1 && arr[i] > arr[i + 1]) {
                    i++;
                    count++;
                }

                ans = Math.max(count, ans);

            } else {
                i++;
            }
        }

        return ans;

    }

}
