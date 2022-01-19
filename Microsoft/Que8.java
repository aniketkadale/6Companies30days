import java.util.*;
public class Que8 {
    class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
            nextRight = null;
        }
    }
    public static void main(String[] args) {
        
    }
    
    public static void connect(Node root) {
       
        Queue<Node> q = new LinkedList<>(); 
        q.add(root);
        
       
        Node prev=null;
      
        Node end = root;
        Node nextend = null;
        
        while(!q.isEmpty())  {
            
            Node temp = q.peek();
            q.poll();
            
            
            if(temp.left!=null)  {
                q.add(temp.left); 
                nextend = temp.left;
            }

            if(temp.right!=null) {
                q.add(temp.right); 
                nextend = temp.right; 
            }
          
          
            if(prev!=null) 
            prev.nextRight = temp;
           
           
            if(temp == end) {
                temp.nextRight = null;
                prev = null;
               
                end = nextend;
            }
          
            else 
            prev = temp;
        }
    }
}
