// Goldman Sachs Question4 - https://practice.geeksforgeeks.org/problems/run-length-encoding/1/#

public class Que4 {
    public static void main(String[] args) {
        String str = "aabbcccd";

        System.out.println(encode(str));

    }

    static String encode(String str) {
        int n = str.length();
        String s = "";

        for (int i = 0; i < n; i++) {
            s += str.charAt(i);
            int count = 1;

            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            s += count + "";

        }

        return s;

    }

}
