import java.util.*;

public class Que3 {
    public static void main(String[] args) {
        int N = 1;
        int K = 1;

        System.out.println(kvowelwords(N, K));

    }

    static public int kvowelwords(int N, int K) {
        int i, j;
        long MOD = 1000000007;
        long dp[][] = new long[N + 1][K + 1];

        for (int ii = 0; ii <= N; ii++)
            Arrays.fill(dp[ii], 0l);

        long sum = 1;
        for (i = 1; i <= N; i++) {
            dp[i][0] = sum * 21l;
            dp[i][0] %= MOD;
            sum = dp[i][0];

            for (j = 1; j <= K; j++) {

                if (j > i)
                    dp[i][j] = 0l;
                else if (j == i)
                    dp[i][j] = power(5l, i, MOD);
                else
                    dp[i][j] = dp[i - 1][j - 1] * 5l;
                dp[i][j] %= MOD;
                sum += dp[i][j];
                sum %= MOD;
            }
        }

        return (int) sum;
    }

    static long power(long x, long y, long p) {
        long res = 1l;
        x = x % p;
        if (x == 0)
            return 0;

        while (y > 0) {
            if (y % 2 == 1)
                res = (res * x) % p;
            y = y >> 1;
            x = (x * x) % p;
        }

        return res;
    }

}
