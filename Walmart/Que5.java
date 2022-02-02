class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Que5 {

    Node root;

    int toSumTree(Node node) {
        if (node == null)
           return 0;
        
        int ori = node.data;
        
        node.data = toSumTree(node.left) + toSumTree(node.right);
        
        return (node.data + ori);
        
    }

  
    void printInorder(Node node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    public static void main(String[] args) {
        
    }

    
   

}