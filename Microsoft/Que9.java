public class Que9 {
    public static void main(String[] args) {

    }

    class Node {

        int data;
        Node left, right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    static class Tree {
        static int c = 0;

        Tree() {
            c = 0;
        }

       static int countSubtreesWithSumXUtil(Node root, int x) {
            if (root == null)
                return 0;

            int ls = countSubtreesWithSumXUtil(root.left, x);
            int rs = countSubtreesWithSumXUtil(root.right, x);

            int sum = ls + rs + root.data;

            if (sum == x)
                c++;

            return sum;
        }

       static int countSubtreesWithSumX(Node root, int x) {
            if (root == null)
                return 0;

            int ls = countSubtreesWithSumXUtil(root.left, x);

            int rs = countSubtreesWithSumXUtil(root.right, x);

            if ((ls + rs + root.data) == x)
                c++;

            return c;
        }

    }

}
