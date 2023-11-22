package Tree.BinaryTree.Question;

import java.util.*;

public class BTRightSideView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<Integer> result = rightSideView(root);
        System.out.println(Arrays.toString(result.toArray()));

    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();

                if (i == levelSize - 1) {
                    result.add(currentNode.val);
                }

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }

        }
        return result;
    }
}

//LeetCode : 199 : https://leetcode.com/problems/binary-tree-right-side-view/