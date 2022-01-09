// Goldman Sachs Question1 - https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/

import java.util.*;
public class Que1 {
    public static void main(String[] args) {
        String[] list = { "act", "god", "cat", "dog", "tac" };
        System.out.println(Anagrams(list));

    }

    public static List<List<String>> Anagrams(String[] string_list) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : string_list) {
            char chArray[] = str.toCharArray();
            Arrays.sort(chArray);
            String sorted = new String(chArray);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new LinkedList<String>());
            }

            map.get(sorted).add(str);
        }

        return new LinkedList<>(map.values());
    }
}