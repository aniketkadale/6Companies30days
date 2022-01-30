public class Que10 {
    public static void main(String[] args) {
        int[][] isConnected = {
                { 1, 1, 0 },
                { 1, 1, 0 },
                { 0, 0, 1 }
        };

        System.out.println(findCircleNum(isConnected));

    }

    public static int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int nums = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                dfs(isConnected, visited, i);
                nums++;
            }
        }

        return nums;
    }

    private static void dfs(int[][] isConnected, boolean[] visited, int i) {
        int n = isConnected.length;
        for (int j = 0; j < n; j++) {
            if (visited[j] == false && isConnected[i][j] == 1) {
                visited[j] = true;
                dfs(isConnected, visited, i);
            }
        }
    }

}
