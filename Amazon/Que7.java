import java.util.*;

public class Que7 {
    public static void main(String[] args) {
        String str = "aabc";

        System.out.println(FirstNonRepeating(str));

    }

    public static String FirstNonRepeating(String A) {

        StringBuilder sb = new StringBuilder();
        Queue<Character> que = new LinkedList<>();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            que.add(ch);

            while (!que.isEmpty()) {
                if (map.containsKey(que.peek()) && map.get(que.peek()) > 1) {
                    que.poll();
                } else {
                    break;
                }
            }

            if (que.isEmpty()) {
                sb.append('#');
            } else {
                sb.append(que.peek());
            }
        }

        return sb.toString();

    }

}
