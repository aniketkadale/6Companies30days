public class Que8 {
    public static void main(String[] args) {
        int n = 2;

        System.out.println(height(n));

    }

    static int height(int N) {

        return (int) (-1 + Math.sqrt(1 + 8 * N)) / 2;

    }

}
