import java.util.*;

public class Que12 {
    private static ArrayList[] graph;

    public static void main(String[] args) {

        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};

        System.out.println(Arrays.toString(findOrder(numCourses, prerequisites)));

    }

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        graph = new ArrayList[numCourses];

        int[] visit = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        for (int[] p : prerequisites) {
            graph[p[0]].add(p[1]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (dfsCyclic(i, visit, queue))
                return new int[0];
        }

        int i = 0;
        int[] result = new int[numCourses];
        while (!queue.isEmpty()) {
            result[i++] = queue.poll();
        }
        return result;
    }

    private static boolean dfsCyclic(int cur, int[] v, Queue<Integer> queue) {
        if (v[cur] == 1)
            return true;
        if (v[cur] == 2)
            return false;
        v[cur] = 1;
        for (int i = 0; i < graph[cur].size(); i++) {
            if (dfsCyclic((int) graph[cur].get(i), v, queue))
                return true;
        }
        v[cur] = 2;
        queue.offer(cur);
        return false;
    }

}
