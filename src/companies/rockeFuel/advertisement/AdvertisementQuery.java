package companies.rockeFuel.advertisement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdvertisementQuery {
    public class Advertisement{
        public String id, val;
        public Advertisement(String id, String val){
            this.id = id;
            this.val = val;
        }
    }
    
    class TrieNode{
        public TrieNode[] ch = new TrieNode[128];
        public List<String> ids = new ArrayList<>();
        public boolean isWord = false;
    }
    
    TrieNode root = new TrieNode();
    
    public void construct(List<Advertisement> list){
        root.isWord = true;
        for(Advertisement cur : list){
            String[] tokens = cur.val.split(" ");
            Arrays.sort(tokens);
            add(root, cur.id, tokens, 0, 0);
        }
    }
    
    private void add(TrieNode node, String id, String[] tokens, int c, int w){
        if(c == tokens[w].length()){
            w ++;
            c = 0;
            node.isWord = true;
        }
        if(w >= tokens.length){
            node.ids.add(id);
            return;
        }
        char cur = tokens[w].charAt(c);
        if(node.ch[cur] == null)node.ch[cur] = new TrieNode();
        add(node.ch[cur], id, tokens, c + 1, w);
    }
    
    public List<String> getValue(String s){
        List<String> res = new ArrayList<>();
        if(s == null || s.length() == 0)return res;
        String[] tokens = s.split(" ");
        Arrays.sort(tokens);
        query(root, tokens, res, 0, 0);
        return res;
    }
    
    private void query(TrieNode node, String[] tokens, List<String> res, int c, int w){
        if(node == null)return;
        if(c == tokens[w].length()){
            if(!node.isWord)return;
            c = 0;
            w ++;
        }
        if(w == tokens.length){
            res.addAll(node.ids);
            return;
        }
        if(c == 0)query(node, tokens, res, tokens[w].length(), w);
        char cur = tokens[w].charAt(c);
        query(node.ch[cur], tokens, res, c + 1, w);
    }
    
    public void print(){
        print(root);
    }
    
    private void print(TrieNode node){
        if(!node.ids.isEmpty())System.out.println(" " + node.ids);
        if(node.isWord)System.out.println(" ");
        for(int i = 0; i < node.ch.length; i ++){
            if(node.ch[i] != null){
                System.out.print((char)i);
                print(node.ch[i]);
            }
        }
        
    }
}
