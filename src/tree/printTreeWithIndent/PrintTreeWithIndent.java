package tree.printTreeWithIndent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import tree.TreeNode;

public class PrintTreeWithIndent {
    public void printTree(TreeNode root){
        if(root == null)return;
        List<List<TreeNode>> list = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        list.add(Arrays.asList(root));
        queue.offer(root);
        int nodeNum = 1, h = 0;
        while(nodeNum > 0){
            nodeNum = 0;
            List<TreeNode> tmp = new ArrayList<>();
            int count = queue.size();
            for(int i = 0; i < count; i ++){
                TreeNode cur = queue.poll();
                TreeNode left = cur == null ? null : cur.left;
                TreeNode right = cur == null ? null : cur.right;
                if(left != null)nodeNum ++;
                if(right != null)nodeNum ++;
                queue.offer(left);
                queue.offer(right);
                tmp.add(left);
                tmp.add(right);
            }
            if(nodeNum > 0)list.add(tmp);
            h ++;
        }
        for(int i = 0; i < list.size(); i ++){
            int blankNum = (1 <<(h - i - 1)) - 1;
            List<TreeNode> cur = list.get(i);
            for(int j = 0; j < cur.size(); j ++){
                printBlank(blankNum);
                if(cur.get(j) == null){
                    System.out.print(" ");
                }else{
                    System.out.print(cur.get(j).val);
                }
                printBlank(blankNum);
                if(j < cur.size() - 1)System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    private void printBlank(int num){
        for(int i = 0; i < num; i ++)System.out.print(" ");
    }
}
