public class Que1 {
    public static void main(String[] args) {
        int[] price = { 10, 22, 5, 75, 65, 80 };
        int k = 2;

        System.out.println(maxProfit(price, k));

    }

    static int maxProfit(int price[], int k) {

        int n = price.length;

        if (n <= 1) {
            return 0;
        }

        int[][] profit = new int[k + 1][n];

        for (int i = 0; i <= k; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || j == 0) {
                    profit[i][j] = 0;
                } else {
                    int max_so_far = 0;
                    for (int x = 0; x < j; x++) {
                        int curr_price = price[j] - price[x] + profit[i - 1][x];
                        if (max_so_far < curr_price) {
                            max_so_far = curr_price;
                        }
                    }

                    profit[i][j] = Math.max(profit[i][j - 1], max_so_far);
                }
            }
        }

        return profit[k][n - 1];
    }
}
