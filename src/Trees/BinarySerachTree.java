package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySerachTree<T extends Comparable<T>> {

    private TreeNode<T> root;

    public void insert(T data) {

        if (root == null) {
            root = new TreeNode<>(data);
        } else {
            insert(root, data);
        }
    }

    private TreeNode<T> insert(TreeNode<T> root, T data) {
        if (root == null) {
            return new TreeNode<>(data);
        }
        if (root.data.compareTo(data) > 0) {
            root.left = insert(root.left, data);
        } else if (root.data.compareTo(data) < 0) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void inoderTraversal() {
        inorderTraversal(root);
    }

    public void preoderTraversal() {
        preorderTraversal(root);
    }

    public void postoderTraversal() {
        postorderTraversal(root);
    }

    private void preorderTraversal(TreeNode<T> root) {
        System.out.println(root.data);
        if (root.left != null) {
            inorderTraversal(root.left);
        }
        if (root.right != null) {
            inorderTraversal(root.right);
        }

    }

    private void postorderTraversal(TreeNode<T> root) {
        if (root.left != null) {
            inorderTraversal(root.left);
        }
        if (root.right != null) {
            inorderTraversal(root.right);
        }
        System.out.println(root.data);
    }

    private void inorderTraversal(TreeNode root) {
        if (root.left != null) {
            inorderTraversal(root.left);
        }
        System.out.println(root.data);
        if (root.right != null) {
            inorderTraversal(root.right);
        }
    }

    public void levelOrder() {
        levelOrder(root);
    }

    private void levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.println(temp.data);
            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
        }
    }

    public TreeNode<T> treeMaxim() {
        return treeMaxim(root);
    }

    private TreeNode<T> treeMaxim(TreeNode root) {
        if (root.right != null) {
            return treeMaxim(root.right);
        }
        return root;
    }

    public TreeNode<T> treeMin() {
        return treeMin(root);
    }

    private TreeNode<T> treeMin(TreeNode root) {
        if (root.left != null) {
            return treeMin(root.left);
        }
        return root;
    }

    public T successor(T t) {
        TreeNode searchNode = search(root, t);
        if (searchNode != null) {
            return successor(searchNode, t, root).data;
        }
        return null;
    }

    public boolean search(T t) {
        return search(root, t) != null;
    }

    private TreeNode search(TreeNode root, T t) {
        if (root.data.compareTo(t) > 0) {
            return search(root.left, t);
        } else if (root.data.compareTo(t) < 0) {
            return search(root.right, t);
        }
        return root;
    }

    private TreeNode<T> successor(TreeNode node, T t, TreeNode root) {
        if (node.right != null) {
            return treeMin(node.right);
        }
        TreeNode<T> temp = root.left;
        TreeNode<T> succ = null;
        while (temp != null) {
            if (t.compareTo(temp.data) < 0) {
                succ = temp;
                temp = temp.left;
            } else if (t.compareTo(temp.data) > 0)
                temp = temp.right;
            else
                break;
        }
        return succ != null ? succ : root;
    }

    public boolean isTreebalance() {
        return isBalance(root);
    }

    private boolean isBalance(TreeNode root) {
        if (root == null || root.left == null || root.right == null) {
            return true;
        }
        System.out.println(maxHeight(root));
        System.out.println(minHeight(root));
        return maxHeight(root) - minHeight(root) <= 1 ? true : false;
    }

    private int maxHeight(TreeNode root) {
        // int max =0 ;
        if (root == null) return 0;
        return 1 + Math.max(maxHeight(root.left), maxHeight(root.right));
    }

    private int minHeight(TreeNode root) {
        // int max =0 ;
        if (root == null) return 0;
        return 1 + Math.min(minHeight(root.left), minHeight(root.right));
    }

    public TreeNode deleteNode(TreeNode root , T key){
        //TreeNode deleteNode ;
       /* if (root.data.compareTo(key) ==0)
            deleteNode = root;
        else
            deleteNode = search(root, key);

        if(deleteNode.left == null && deleteNode.right == null)
            deleteNode = null;
        else if (deleteNode.left == null && deleteNode.right != null)
            deleteNode = deleteNode.right;
        else if (deleteNode.left != null && deleteNode.right == null)
            deleteNode = deleteNode.left;
        else {
            TreeNode  successor = treeMin(deleteNode.right);
            if (successor.left == null && successor.right == null)
            {
                TreeNode left = deleteNode.left;
                TreeNode right = deleteNode.right;
                deleteNode = successor;
                successor.left = left;
                successor.right = right;
            }
        }
        return  deleteNode;*/
       if (root == null) return  null;
       if (root.data.compareTo(key) > 0)
           root.right = deleteNode(root.right , key);
       else
           root.left = deleteNode(root.left , key);
       return null;
    }
}
