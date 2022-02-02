public class Que3 {
    public static void main(String[] args) {
        String colors = "AAABABB";

        System.out.println(winnerOfGame(colors));
        
    }

    public static boolean winnerOfGame(String colors) {
        int canMoveA = 0, canMoveB = 0, continuesA = 0, continuesB = 0;
        for (int i = 0; i < colors.length(); i++) {
            char c = colors.charAt(i);
            if (c == 'A') {
                if (continuesA != 0) {
                    continuesA++;
                    if (continuesA >= 3) {
                        canMoveA++;
                    }
                } else {
                    continuesA++;
                    continuesB = 0;
                }
            } else {
                if (continuesB != 0) {
                    continuesB++;
                    if (continuesB >= 3) {
                        canMoveB++;
                    }
                } else {
                    continuesB++;
                    continuesA = 0;
                }
            }
        }

        return canMoveA > canMoveB;
    }
}
    

