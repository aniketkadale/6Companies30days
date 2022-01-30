public class Que7 {
    public static void main(String[] args) {
        int[] weights = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int days = 5;

        System.out.println(shipWithinDays(weights, days));

    }

    public static int shipWithinDays(int[] weights, int days) {

        int left = 0, right = 0;
        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }
        while (left < right) {
            int mid = (left + right) / 2, requirement = 1, tillnow = 0;
            for (int w : weights) {
                if (tillnow + w > mid) {
                    requirement += 1;
                    tillnow = 0;
                }
                tillnow += w;
            }
            if (requirement > days)
                left = mid + 1;
            else
                right = mid;
        }
        return left;

    }

}
