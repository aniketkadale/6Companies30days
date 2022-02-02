import java.util.*;

public class Que13 {
    public static void main(String[] args) {

        String[] str = { "3", "6", "7", "10" };
        int k = 4;

        System.out.println(kthLargestNumber(str, k));
    }

    public static String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() != b.length())
                    return a.length() - b.length();
                return a.compareTo(b);
            }
        });
        return nums[nums.length - k];
    }
}

