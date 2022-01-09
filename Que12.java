// Goldman Sachs Question12 - https://www.geeksforgeeks.org/program-to-find-number-of-squares-on-a-chessboard/

public class Que12 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countSquares(n));

    }

    static int countSquares(int n) {

        return (n * (n + 1) / 2) * (2 * n + 1) / 3;

    }

}
