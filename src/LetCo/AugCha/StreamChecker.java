package LetCo.AugCha;

public class StreamChecker {

    public class Node {
        Node[] children = new Node[26];
        boolean isTerminate = false;

        public Node next(final char c) {
            return children[c - 'a'];
        }
    }
    private  Node rootNode ;
    public StreamChecker(String[] words) {
         rootNode = new Node();

        for (String word : words) {
            Node currentNode = rootNode;
            for (int i = word.length()-1 ; i >=0; i--) {
                if (currentNode.children[word.charAt(i) - 'a'] == null) {
                    currentNode.children[word.charAt(i) - 'a'] = new Node();
                }
                currentNode = currentNode.next(word.charAt(i));
            }
            currentNode.isTerminate = true;
        }

    }

    public boolean query(char letter) {
        int index = letter - 'a';
        if(rootNode.children[index] != null && rootNode.children[index].isTerminate)
            return  true;
        else
            search(letter , rootNode);
        return false;
    }
    private boolean search(char letter , Node rootNode){
        if (rootNode.children[letter -'c'].isTerminate && rootNode.children[letter - 'a'] != null)
            return true;
        for (int i=0; i < 26 ; i++){
            if (rootNode.children[i] != null)
                search(letter , rootNode.children[i] );
        }

        return false;
    }
    public static void main(String[] args) {

    }
}
