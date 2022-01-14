public class Que12 {
    public static void main(String[] args) {
        int n = 28;

        System.out.println(colName(n));

    }

    static String colName(long n) {

        String res = "";

        while (n > 0) {
            long x = n % 26;

            if (x == 0) {
                res = 'Z' + res;
                n = (n / 26) - 1;
            } else {
                res = (char) ('A' + (x - 1)) + res;
                n /= 26;
            }

        }

        return res;

    }

}
