// Goldman Sachs Question3 - https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/

public class Que3 {
    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4 };
        int k = 10;

        System.out.println(numSubarrayProductLessThanK(a, k));

    }

    public static int numSubarrayProductLessThanK(int[] a, int k) {

        if (k <= 1)
            return 0;

        int product = 1;
        int ans = 0;

        int left = 0;
        int right = 0;

        while (right < a.length) {
            product *= a[right];

            while (product >= k) {
                product /= a[left];
                left++;
            }

            ans += right - left + 1;
            right++;

        }

        return ans;

    }

}
