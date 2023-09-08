package Tree.BinaryTree.Question;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class BFS {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3); // Root node with value 3
        root.left = new TreeNode(9);     // Left child with value 9
        root.right = new TreeNode(20);   // Right child with value 20
        root.right.left = new TreeNode(15); // Left child of right node with value 15
        root.right.right = new TreeNode(7); // Right child of right node with value 7

        // Call the levelOrder function to perform BFS traversal
        List<List<Integer>> result = levelOrder(root);

        // Print the result
        for (List<Integer> level : result) {
            System.out.println(level);

        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel);
        }


        return result;
    }
}
//LeetCode 102 (Medium)