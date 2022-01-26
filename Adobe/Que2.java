public class Que2 {
    public static void main(String[] args) {
        int[] nums = { 1, 7, 10, 13, 14, 19 };
        int n = 6;

        System.out.println(lengthOfLongestAP(nums, n));

    }

    static int lengthOfLongestAP(int[] nums, int n) {

        if (n <= 2) {
            return n;
        }

        int maxLength = 2;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = nums[j] - nums[i];
                int nextTarget = nums[j] + diff;
                int currentLongestLength = 2;

                for (int k = 0; k < n; k++) {

                    if (nums[k] == nextTarget) {
                        currentLongestLength += 1;
                        maxLength = Math.max(maxLength, currentLongestLength);
                        nextTarget = nextTarget + diff;
                    }
                }
            }
        }

        return maxLength;

    }

}
