public class Que4 {
    public static void main(String[] args) {
       int arr[] = {1, 2, 3, 4, 5}
       int n = 5;

       System.out.println(matrixChainOrder(arr, n));
        
    }

    static String matrixChainOrder(int arr[], int n) {
        int[][] dp = new int[p.length - 1][p.length - 1];

        for (int g = 0; g < dp.length; g++) {
            for (int i = 0, j = g; j < dp.length; i++, j++) {
                dp[i][j] = 0;

                if (g == 0) {
                    dp[i][j] = 0;

                } else if (g == 1) {
                    dp[i][j] = p[i] * p[j] * p[j + 1];

                } else {
                    int min = Integer.MAX_VALUE;
                    for (int k = i; k < j; k++) {
                        int lc = dp[i][k];
                        int rc = dp[k + 1][j];
                        int mc = arr[i] = arr[k + 1];
                        int tc = lc + rc + mc;
                        if (tc < min) {
                            min = tc;

                        }
                    }

                    dp[i][j] = min;

                }

                return dp[0][dp.length - 1];

            }

        }
    }
}
