public class Que6 {
    public static void main(String[] args) {
        int N = 2;
        int R = 2;

        System.out.println(power(N, R));

    }

    static long power(int N, int R) {
        long pow = 1L;

        for (int i = 0; i < N; i++) {
            pow = pow * N;
        }

        return pow;

    }

}
