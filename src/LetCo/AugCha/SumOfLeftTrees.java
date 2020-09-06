package LetCo.AugCha;

public class SumOfLeftTrees {
    private int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {

        sum(root);
        return sum;
    }

    private void sum(TreeNode root) {

        if (root == null) return;
        System.out.println(sum);
        if ( root.left != null)
            if(root.left.left == null && root.left.right == null)
                sum += root.left.val;
            else
                sum(root.left);
        sum(root.right);
    }
}
