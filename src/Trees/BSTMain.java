package Trees;

public class BSTMain {
    public static void main(String[] args) {

        BinarySerachTree<Integer> bst = new BinarySerachTree<>();
        bst.insert(15);
        bst.insert(6);
        bst.insert(18);
        bst.insert(3);
        bst.insert(7);
        bst.insert(17);
        bst.insert(20);
        bst.insert(2);
        bst.insert(4);
        bst.insert(13);
   //     bst.insert(9);
     //   bst.inoderTraversal();
        /*System.out.println(bst.treeMaxim().data);
        System.out.println(bst.treeMin().data);
        */
       /* System.out.println(bst.successor(15));
        System.out.println(bst.successor(13));
        System.out.println(bst.successor(4));
        System.out.println(bst.successor(9));*/
       System.out.println(bst.isTreebalance());
    }
}
