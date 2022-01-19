import java.util.*;

public class Que15 {
    public static String findOrder(String[] words, int n, int k) {
        Graph g = new Graph(k);

        for (int i = 0; i < n - 1; i++) {
            int len = Math.min(words[i].length(), words[i + 1].length());
            for (int j = 0; j < len; j++) {
                if (words[i].charAt(j) != words[i + 1].charAt(j)) {
                    g.addEdge(words[i].charAt(j) - 'a', words[i + 1].charAt(j) - 'a');
                    break;
                }
            }
        }

        String ans = g.topologicalSort();
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 4;

        String[] arr = { "baa", "abcd", "abca", "cab", "cad" };

        System.out.println(findOrder(arr, n, k));

    }

    static class Graph {
        static List<List<Integer>> adj = new ArrayList<>();

        Graph(int n) {
            for (int i = 0; i < n; i++) {
                adj.add(i, new ArrayList<Integer>());
            }
        }

        static void addEdge(int from, int to) {
            adj.get(from).add(to);
        }

        static int getNoOfVertices() {
            return adj.size();
        }

        static void topologicalSortUtil(int curr, boolean[] visited, Stack<Integer> st) {
            visited[curr] = true;

            for (int i = 0; i < adj.get(curr).size(); i++) {
                int x = adj.get(curr).get(i);
                if (!visited[x]) {
                    topologicalSortUtil(x, visited, st);
                }
            }

            st.push(curr);
        }

        public static String topologicalSort() {
            Stack<Integer> st = new Stack<>();
            int n = getNoOfVertices();
            boolean[] visited = new boolean[n];
            for (int i = 0; i < n; i++)
                visited[i] = false;

            for (int i = 0; i < n; i++)
                if (!visited[i])
                    topologicalSortUtil(i, visited, st);

            String ans = "";
            while (!st.isEmpty())
                ans += (char) ('a' + st.pop());

            adj.clear();
            return ans;

        }

    }

}
