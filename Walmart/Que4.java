public class Que4 {
    public static void main(String[] args) {
        int m = 2; 
        int n = 2;

        System.out.println(NumberOfPath(m, n));
        
    }

    public static int NumberOfPath(int m, int n) {
        if (m == 1 || n == 1)
            return 1;

        return NumberOfPath(m - 1, n) + NumberOfPath(m, n - 1);

    }

}
