
import java.util.*;
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;

    }

    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean _val, boolean _isLeaf, Node _topLeft, Node _topRight, Node _bottomLeft, Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};

public class Que11 {
    public static void main(String[] args) {
        int[][] grid = {
                { 0, 1 },
                { 1, 0 }
        };

        System.out.println(Arrays.toString(construct(grid)));


    }

    public static Node construct(int[][] grid) {
        return build(grid, 0, 0, grid.length - 1, grid[0].length - 1);
    }

    public static Node build(int[][] grid, int r1, int c1, int r2, int c2) {

        if (r1 > r2 || c1 > c2) {
            return null;
        }

        if (isLeafNode(grid, r1, c1, r2, c2)) {
            return new Node(grid[r1][c1] == 1, true, null, null, null, null);
        }

        int rmid = r1 + (r2 - r1) / 2;
        int cmid = c1 + (c2 - c1) / 2;

        return new Node(false, false,
                build(grid, r1, c1, rmid, cmid),
                build(grid, r1, cmid + 1, rmid, c2),
                build(grid, rmid + 1, c1, r2, cmid),
                build(grid, rmid + 1, cmid + 1, r2, c2));
    }

    private static boolean isLeafNode(int[][] grid, int r1, int c1, int r2, int c2) {
        int val = grid[r1][c1];

        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                if (val != grid[i][j]) {
                    return false;
                }
            }
        }

        return true;

    }

}
