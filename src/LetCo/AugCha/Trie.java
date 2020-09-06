package LetCo.AugCha;

public class Trie {
    Node rootNode;

    public class Node {
        Node[] children = new Node[26];
        boolean isTerminate = false;

        public Node next(final char c) {
            return children[c - 'a'];
        }
    }

    public Trie() {
        rootNode = new Node();
    }

    public void add(String word) {
        Node currentNode = rootNode;
        for (char ch : word.toCharArray()) {

            if (currentNode.children[ch-'a'] == null) {
                currentNode.children[ch-'a'] = new Node();
            }
            currentNode = currentNode.next(ch);
        }
        currentNode.isTerminate = true;
    }
    public boolean search(String word) {
        return dfsSearch(rootNode, word, 0);
    }

    public boolean dfsSearch(Node p, String word, int start) {
        if (p.isTerminate && start == word.length())
            return true;

        if (start >= word.length())
            return false;

        char c = word.charAt(start);

        if (c == '.') {
            boolean tResult = false;
            for (int j = 0; j < 26; j++) {
                if (p.children[j] != null) {
                    if (dfsSearch(p.children[j], word, start + 1)) {
                        tResult = true;
                        break;
                    }
                }
            }

            if (tResult)
                return true;
        } else {
            int index = c - 'a';

            if (p.children[index] != null) {
                return dfsSearch(p.children[index], word, start + 1);
            } else {
                return false;
            }
        }

        return false;
    }
    public boolean searchBack(String word) {
        Node node = rootNode;

        for (int i=0; i < word.length() ; i++) {
            System.out.println("rnga"+word.charAt(i));
                if (word.charAt(i) == '.') {
                    boolean res = false;
                    for (int j=0 ; j < 26 ; j++) {
                            System.out.println(word.charAt(i) + " " + node.children[j]);
                            if (node.children[j] != null && searchBack(word.substring(i+1))) {
                                res = true;
                                break;
                            }
                    }

                    if(res){
                        return  true;
                    }
                }
                if (node == null || node.next(word.charAt(i)) == null) {
                    return false;
                }
                node = node.next(word.charAt(i));
        }
        if(!node.isTerminate) return  false;
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.add("bad");
        trie.add("dad");
        System.out.println(trie.searchBack(".ad"));
    }

}
