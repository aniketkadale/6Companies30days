import java.util.*;

public class Que9 {
    public static void main(String[] args) {
        int[][] heights = {
                { 1, 2, 2, 3, 5 },
                { 3, 2, 3, 4, 4 },
                { 2, 4, 5, 3, 1 },
                { 6, 7, 1, 4, 5 },
                { 5, 1, 1, 2, 4 }
        };

        System.out.println(pacificAtlantic(heights));

    }

    public static List<List<Integer>> pacificAtlantic(int[][] M) {

        List<List<Integer>> ans = new ArrayList<>();
        if (M.length == 0)
            return ans;
        int y = M.length, x = M[0].length;
        byte[] dp = new byte[x * y];
        for (int i = 0; i < x; i++) {
            dfs(0, i, 1, M[0][i], M, dp, ans);
            dfs(y - 1, i, 2, M[y - 1][i], M, dp, ans);
        }
        for (int i = 0; i < y; i++) {
            dfs(i, 0, 1, M[i][0], M, dp, ans);
            dfs(i, x - 1, 2, M[i][x - 1], M, dp, ans);
        }
        return ans;

    }

    static void dfs(int i, int j, int w, int h, int[][] M, byte[] dp, List<List<Integer>> ans) {
        int ij = i * M[0].length + j;
        if ((dp[ij] & w) > 0 || M[i][j] < h) return;
        dp[ij] += w;
        h = M[i][j];
        if (dp[ij] == 3) ans.add(Arrays.asList(i,j));
        if (i + 1 < M.length) dfs(i+1, j, w, h, M, dp, ans);
        if (i > 0) dfs(i-1, j, w, h, M, dp, ans);
        if (j + 1 < M[0].length) dfs(i, j+1, w, h, M, dp, ans);
        if (j > 0) dfs(i, j-1, w, h, M, dp, ans);
    }

}
