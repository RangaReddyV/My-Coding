package LetCo.AugCha;


import java.util.*;

   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class VerticalOrderTraversal {

    public  class Node {
        int hDistance;
        int vDistance;
        TreeNode node;
        public  Node(int hDistance , int vDistance , TreeNode node){
            this.hDistance = hDistance;
            this.vDistance = vDistance;
            this.node = node;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(0,0, root));
        int minHd = 0;
        int maxHd =0;
        Map<Integer, List<Node>> map = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            minHd = Math.min (minHd, currentNode.hDistance);
            maxHd = Math.max (maxHd, currentNode.hDistance);
            if (!map.containsKey (currentNode.hDistance))
                map.put (currentNode.hDistance, new ArrayList <>());
            map.get(currentNode.hDistance).add(currentNode);
            if (currentNode.node.left != null)
                queue.add (new Node (currentNode.hDistance - 1, currentNode.vDistance - 1, currentNode.node.left));
            if (currentNode.node.right != null)
                queue.add (new Node (currentNode.hDistance + 1, currentNode.vDistance - 1, currentNode.node.right));
        }
        int index = 0;
        for (int i=minHd; i < maxHd ; i++){
            Collections.sort(map.get(i), (x,y)->
            {
                if(x.vDistance == y.vDistance)
                    return x.node.val - y.node.val;
                else
                    return y.vDistance - x.vDistance;
            });
            res.add (new ArrayList <>());
            for (Node node : map.get (i))
            {
                res.get (index).add (node.node.val);
            }
            index++;
        }
 return  res;
    }


    public static void main(String[] args) {

    }
}
