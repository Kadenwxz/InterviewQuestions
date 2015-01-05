package trie.insertAndSearch;

import trie.Trie;

public class TrieOperation {
    
    Trie root = new Trie();
    boolean hasNull = false;
    
    public void addWord(String s){
        if(s == null){
            hasNull = true;
            return;
        }
        addWord(s, 0, root);
    }
    
    private void addWord(String s, int index, Trie node){
        if(s.length() == index){
            node.isLeaf = true;
            return;
        }
        char c = s.charAt(index);
        if(node.ch[c] == null)node.ch[c] = new Trie();
        addWord(s, index + 1, node.ch[c]);
    }
    
    public boolean search(String s){
        if(s == null)return hasNull;
        return search(s, 0, root);
    }
    
    private boolean search(String s, int index, Trie node){
        if(node == null)return false;
        if(s.length() == index)return node.isLeaf;
        char c = s.charAt(index);
        if(c == '.'){
            for(Trie tmp : node.ch){
                if(search(s, index + 1, tmp))return true;
            }
            return false;
        }
        return search(s, index + 1, node.ch[c]);
    }
}