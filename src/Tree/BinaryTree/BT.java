package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BT {

    static class Node{
        int data;
        Node left;
        Node right;
    public Node(int data){
            this.data = data;
            this.left= null;
            this.right= null;
        }
    }

    static int index = -1;
    //For traversing the entire tree we need index.
    //Initially index -1; means null
    public static Node build(int [] nodes){
        index++; //When the function call increment the index -1 to 0; 0 represent our root.
        if(nodes[index]==-1){
            return null;
        }
        Node node = new Node(nodes[index]);
        node.left=build(nodes);
        node.right=build(nodes);
        return node;
    }
    //Preorder traversal(DFS)
    public static void preOrder(Node root){
       if(root ==null){
           return;
       }
        System.out.print(root.data+" ");
       preOrder(root.left);
       preOrder(root.right);
    }
//Inorder traversal(DFS)
public static void inOrder(Node root){
    if(root ==null){
        return;
    }
    preOrder(root.left);
    System.out.print(root.data+" ");
    preOrder(root.right);
}
//Postorder traversal(BFS)
public static void postOrder(Node root){
    if(root ==null){
        return;
    }
    preOrder(root.left);
    preOrder(root.right);
    System.out.print(root.data+" ");
}
//Important : LevelOrder Traversal(BFS)
    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); //null means in this case new line.
        while(!q.isEmpty()){
            //remove added item from queue and called them currentNode.
            Node cNode = q.remove();
            if(cNode == null){
                System.out.println();
                if (q.isEmpty()){
                    break;//If reaches at the last just break from the loop.
                }else {
                    q.add(null);//If not then again add null cause after printing one level then we need a new Line.
                }
            }else {
                System.out.print(cNode.data +" ");
                if(cNode.left != null){
                    q.add(cNode.left);
                }
                if(cNode.right != null){
                    q.add(cNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
   int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    BT tree = new BT();
    Node root = tree.build(nodes);
        System.out.println(root.data);
//        preOrder(root);
        levelOrder(root);
    }
}
