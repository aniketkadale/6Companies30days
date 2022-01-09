// Goldman Sachs Question7 - https://practice.geeksforgeeks.org/problems/find-the-position-of-m-th-item1723/1/

public class Que7 {
    public static void main(String[] args) {
        int n = 5;
        int m = 2;
        int k = 1;

        System.out.println(findPosition(n, m, k));

    }

    static int findPosition(int N, int M, int K) {
        if (M <= N - K + 1)
            return M + K - 1;

        M -= (N - K + 1);

        if (M % N == 0) {
            return N;
        } else {
            return (M % N);
        }

    }
}
