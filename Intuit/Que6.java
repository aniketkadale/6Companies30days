public class Que6 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 3, 1 };
        int target = 3;

        System.out.println(findInMountainArray(target, mountainArr));

    }

    public static int findInMountainArray(int target, MountainArray mountainArr) {

        int n = mountainArr.length();
        int r = n - 1;
        int l = 0;
        int m = 0;
        while (l <= r) {
            m = l + (r - l) / 2;
            int a1 = m - 1 >= 0 ? mountainArr.get(m - 1) : Integer.MIN_VALUE;
            int a2 = mountainArr.get(m);
            int a3 = m + 1 <= n - 1 ? mountainArr.get(m + 1) : Integer.MIN_VALUE;

            if (a1 < a2 && a3 < a2) {
                break;
            }

            if (a2 > a1 && a3 > a2) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        int peak = m;

        r = peak;
        l = 0;
        while (l <= r) {
            m = l + (r - l) / 2;
            int a2 = mountainArr.get(m);
            if (a2 == target) {
                return m;
            }

            if (a2 < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        r = n - 1;
        l = peak + 1;
        while (l <= r) {
            m = l + (r - l) / 2;
            int a2 = mountainArr.get(m);
            if (a2 == target) {
                return m;
            }

            if (a2 < target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return -1;

    }

}
