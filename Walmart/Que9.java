public class Que9 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(getNumber(n));

    }

    public static int getNumber(int n) {

        return guessNumberRec(new int[n + 1][n + 1], 1, n);
    }

    public static int guessNumberRec(int[][] arr, int left, int right) {
        if (left >= right)
            return 0;
        if (arr[left][right] != 0)
            return arr[left][right];
        arr[left][right] = Integer.MAX_VALUE;
        for (int a = left; a <= right; a++) {
            arr[left][right] = Math.min(arr[left][right],
                    a + Math.max(guessNumberRec(arr, left, a - 1), guessNumberRec(arr, a + 1, right)));
        }
        return arr[left][right];
    }

}
