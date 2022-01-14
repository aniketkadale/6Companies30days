public class Que9 {
    public static void main(String[] args) {
        int[][] mat = {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };

        System.out.println(isValid(mat));

    }

    static int isValid(int mat[][]) {
        int r[][] = new int[9][9];
        int c[][] = new int[9][9];
        int s[][][] = new int[3][3][9];

        int number;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (mat[i][j] > 0 && mat[i][j] <= 9) {
                    number = mat[i][j] - 1;
                    if (r[i][number] != 0)
                        return 0;
                    r[i][number] = 1;
                    if (c[j][number] != 0)
                        return 0;
                    c[j][number] = 1;

                    if (s[i / 3][j / 3][number] != 0)
                        return 0;
                    s[i / 3][j / 3][number] = 1;
                }
            }
        }

        return 1;

    }

}
