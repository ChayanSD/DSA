package Tree.BinaryTree.Question;

public class LeetCode116 {
    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public static void main(String[] args) {
     Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left =  new Node(4);
        root.left.right =  new Node(5);
        root.right.left =  new Node(6);
        root.right.right =  new Node(7);

        //Print the tree
       connect(root);
        printTree(root);


    }

    public static void printTree(Node root) {
        if (root == null) {
            return;
        }
        // In-order traversal
        printTree(root.left);
        System.out.println("Node value: " + root.val + ", Next value: " + (root.next != null ? root.next.val : "null"));
        printTree(root.right);
    }

    public static Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Node leftMost = root;
        while (leftMost.left != null){
            Node current = leftMost;
            while(current != null){
                current.left.next = current.right;

                if (current.next != null){
                    current.right.next = current.next.left; //It will connect the bridge.
                }
                current = current.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }
}
