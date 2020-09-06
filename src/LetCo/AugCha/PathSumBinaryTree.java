package LetCo.AugCha;


public class PathSumBinaryTree {
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

    public int pathSum(TreeNode root, int sum) {

        return dfs(root, sum) + dfs(root.left, sum) + dfs(root.right, sum);
    }

    private int dfs(TreeNode root, int sum) {
        if (root == null) return 0;
        int count = 0;
        sum -= root.val;
        if (sum == 0) ++count;
        count += dfs(root.left, sum);
        count += dfs(root.right, sum);
        return count;
    }

    public static void main(String[] args) {

    }
}
