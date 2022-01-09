// Goldman Sachs Question6 - https://leetcode.com/problems/greatest-common-divisor-of-strings/

public class Que6 {
    public static void main(String[] args) {
        String s1 = "ABCABC";
        String s2 = "ABC";

        System.out.println(gcdOfStrings(s1, s2));

    }

    static String gcdOfStrings(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        int maxLen = Math.min(l1, l2);

        for (int i = maxLen; i >= 1; i--) {
            if (l1 % i == 0 && l2 % i == 0 && str1.substring(0, i).equals(str2.substring(0, i))) {
                String temp1 = str1.substring(i) + str1.substring(0, i);
                String temp2 = str2.substring(i) + str2.substring(0, i);
                if (temp1.equals(str1) && temp2.equals(str2)) {
                    return str1.substring(0, i);
                }
            }
        }

        return "";

    }

}
