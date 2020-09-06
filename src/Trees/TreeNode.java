package Trees;

public class TreeNode <T extends Comparable<T>> {
    public TreeNode<T> left, right ;
    public T data;
    TreeNode( T element){
        this.data = element;
        left = right = null;
    }

}
