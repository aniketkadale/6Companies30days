import java.util.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Que11 {
    public static void main(String[] args) {
        int n = 2;

        System.out.println(generate(n));

    }

    static ArrayList<String> generate(int N) {

        ArrayList<String> res = new ArrayList<String>();

        Queue<String> q = new LinkedList<>();

        q.add("1");

        while (N-- > 0) {

            String s1 = q.peek();
            q.poll();

            res.add(s1);

            String s2 = s1;

            q.add(s1 + '0');
            q.add(s2 + '1');
        }

        return res;
    }

}
