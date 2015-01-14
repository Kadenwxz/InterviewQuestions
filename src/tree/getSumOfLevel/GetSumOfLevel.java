package tree.getSumOfLevel;

import java.util.LinkedList;
import java.util.Queue;

import tree.TreeNode;

public class GetSumOfLevel {

    public int getSumOfLevel(TreeNode root, int n){
        if(root == null)return -1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        for(int i = 0; i < n - 1; i ++){
            int count = queue.size();
            for(int j = 0; j < count; j ++){
                TreeNode cur = queue.poll();
                if(cur.left != null)queue.offer(cur.left);
                if(cur.right != null)queue.offer(cur.right);
            }
            if(queue.isEmpty())return -1;
        }
        int res = 0;
        for(TreeNode node : queue)res += node.val;
        return res;
    }
}
