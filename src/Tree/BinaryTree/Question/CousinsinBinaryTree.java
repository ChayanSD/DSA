package Tree.BinaryTree.Question;


public class CousinsinBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);     // Left child with value 9
        root.right = new TreeNode(20);   // Right child with value 20
        root.right.left = new TreeNode(15); // Left child of right node with value 15
        root.right.right = new TreeNode(7); // Right child of right node with value 7
        System.out.println(isCousins(root,9,20));
    }

    public static boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (
                level(root,xx,0)==level(root,yy,0) && !isSibling(root,xx,yy)
        );
    }

    private static boolean isSibling(TreeNode node, TreeNode x, TreeNode y) {
        if (node == null) {
            return false;
        }
        return (
                (node.left==x && node.right==y) ||
                        (node.left==y && node.right==x) ||
                        isSibling(node.left,x,y) ||
                        isSibling(node.right,x,y)
                );
    }


private static int level(TreeNode node,TreeNode x,int lev){
    if(node == null){
        return 0;
    }
    if(node == x){
        return lev;
    }
    int l = level(node.left,x,lev+1);
    if(l!=0){
        return l;
    }
    return level(node.right,x,lev+1);
}
    private static TreeNode findNode(TreeNode node, int x) {
        if (node == null) {
            return null;
        }
        if (node.val == x) {
            return node; //find the node
        }
        //call left and right via recursion
        TreeNode n = findNode(node.left, x);
        if (n != null) {
            return n;
        }
        return findNode(node.right, x);
    }
}

//LeetCode : 993 : https://leetcode.com/problems/cousins-in-binary-tree/