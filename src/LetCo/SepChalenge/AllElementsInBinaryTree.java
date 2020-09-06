package LetCo.SepChalenge;

import Trees.TreeNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AllElementsInBinaryTree {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        inOrderTraversal(root1, list1);
        inOrderTraversal(root2, list2);
        List<Integer> res = new ArrayList<>();
        res.addAll(list1);
        res.addAll(list2);
        Collections.sort(res);
        int i=0, j=0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) > list2.get(j) ) {
                res.add(list2.get(j));
                j++;

            } else {
                res.add(list1.get(i));
                i++;
            }
        }

        if (i >= list1.size()){
            while(j < list2.size()){
                res.add(list2.get(j));
                j++;
            }
        }
        else if (j>= list2.size()){
            while(i < list1.size()){
                res.add(list1.get(i));
                i++;
            }
        }
        return res;
    }

    private void inOrderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inOrderTraversal(root.left, list);
        list.add((Integer) root.data);
        inOrderTraversal(root.right, list);
    }

    public static void main(String[] args) {

    }
}
