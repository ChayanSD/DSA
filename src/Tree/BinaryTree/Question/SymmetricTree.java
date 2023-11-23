package Tree.BinaryTree.Question;

import java.util.*;

public class SymmetricTree {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        //skip the root
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while (!queue.isEmpty()){
            TreeNode left = queue.poll(); //remove from front
            TreeNode right = queue.poll(); //remove from front

            if(left == null && right == null){
                continue;
            }
            if(left==null || right ==null){
                return false;
            }
            if(left.val != right.val){
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }

        return true;
    }

    //approach 2
    public boolean isSymmetric1(TreeNode root){
        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode n1, TreeNode n2) {
        if(n1 == null && n2 == null){
            return true;
        }
        if (n1 == null || n2 == null) {
            return false;
        }

        return
                ( n1.val == n2.val
                && isMirror(n1.left, n2.right)
                && isMirror(n1.right, n2.left)
                );
    }

}
//LeeCode: 101 : https://leetcode.com/problems/symmetric-tree/