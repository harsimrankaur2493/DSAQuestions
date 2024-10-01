package trees;
import java.util.*;

public class leverOrderTraversal {
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++; // Increment index to process the next element
            if (nodes[idx] == -1) {
                return null; // Base case: no node to add (leaf reached)
            }

            // Create new node for the current index
            Node newNode = new Node(nodes[idx]);

            // Recursively build the left and right subtrees
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode; // Return the root of the current subtree
        }
    }

    public static void levelTraversal(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }

            }else{
                System.out.print(currNode.data);
                if(currNode.left != null){
                    q.add(currNode.left);
                }if(currNode.right != null){
                    q.add(currNode.right);
                }

            }
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        // Building the tree
        BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(root.data);

        levelTraversal(root);

        // You can add additional methods to traverse the tree (like in-order, pre-order)
        // and print the tree structure for better visualization.
        //TC = O(n)
    }
    
}
