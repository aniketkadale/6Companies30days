public class Que8 {
    public static void main(String[] args) {
        int n = 4;

        System.out.println(countWays(n));

    }

    static Long countWays(int m) {
        Long ans[] = new Long[m + 1];

        ans[0] = 1L;
        ans[1] = 1L;

        for (int i = 2; i <= m; i++) {
            ans[i] = (ans[i - 2] + 1);

        }

        return ans[m];

    }

}
