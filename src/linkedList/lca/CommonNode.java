package linkedList.lca;

import java.util.List;

import linkedList.ListNode;

public class CommonNode {
    public ListNode commonNode(List<ListNode> A){
        if(A == null || A.size() == 0)return null;
        if(A.size() == 1)return A.get(0);
        int minLen = Integer.MAX_VALUE;
        for(ListNode cur : A)minLen = Math.min(minLen, getLen(cur));
        
        // Move to the same level
        for(int i = 0; i < A.size(); i ++){
            ListNode cur = A.get(i);
            int len = getLen(cur);
            cur = A.get(i);
            for(int j = 0; j < len - minLen; j ++)cur = cur.next;
            A.add(i, cur);
        }
        
        // Find the common Node
        ListNode res = null;
        boolean hasFound = false;
        while(!hasFound){
            hasFound = true;
            res = A.get(0);
            for(int i = 0; i < A.size(); i ++){
                ListNode cur = A.get(i);
                if(cur != res){
                    hasFound = false;
                }
                A.add(i, cur.next);
            }
        }
        return res;
    }
    
    private int getLen(ListNode node){
        int count = 0;
        while(node != null){
            count ++;
            node = node.next;
        }
        return count;
    }
}
