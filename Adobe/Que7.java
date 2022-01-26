import java.util.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Que7 {
    public static void main(String[] args) {
        int[] arr = { 5, 25, 4, 8, 32, 6 };

        System.out.println(startGame('a', arr, 0, arr.length - 1, new ArrayList<>()));

    }

    private static List<Integer> startGame(char startWith, int[] coins, int start, int end, List coinsCollectedByA) {

        if (start >= end) {
            if (startWith == 'a') {
                coinsCollectedByA.add(coins[end]);
            }
            return coinsCollectedByA;
        }

        int coinCollected = ((coins[start] + coins[end - 1]) > (coins[start + 1] + coins[end])) ? coins[start]
                : coins[end];

        if (((coins[start] + coins[end - 1]) > (coins[start + 1] + coins[end]))) {
            start++;
        } else {
            end--;
        }

        if (startWith == 'a') {
            coinsCollectedByA.add(coinCollected);
            startWith = 'b';
        } else {
            startWith = 'a';
        }

        return startGame(startWith, coins, start, end, coinsCollectedByA);
    }

}
