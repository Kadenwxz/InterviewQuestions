package mergeSort.getMinRange;

import java.util.List;
import java.util.PriorityQueue;

public class GetMinRange {
    class Node implements Comparable<Node>{
        int row, index, val;
        public Node(int row, int index, int val){
            this.row = row;
            this.index = index;
            this.val = val;
        }
        public int compareTo(Node a){
            return this.val - a.val;
        }
    }
    public int[] getMinRange(List<int[]> A){
        int[] res = new int[2];
        if(A == null || A.size() == 0)return res;
        PriorityQueue<Node> minHeap = new PriorityQueue<>();
        // Initialize
        res[0] = Integer.MAX_VALUE;
        res[1] = Integer.MIN_VALUE;
        for(int i = 0; i < A.size(); i ++){
            int val = A.get(i)[0];
            res[0] = Math.min(res[0], val);
            res[1] = Math.max(res[0], val);
            Node node = new Node(i, 0, A.get(i)[0]);
            minHeap.add(node);
        }
        int max = res[1];
        while(true){
            Node node = minHeap.poll();
            int len = max - node.val;
            if(len < res[1] - res[0]){
                res[0] = node.val;
                res[1] = max;
            }
            if(A.get(node.row).length - 1 == node.index)break;
            Node tmp = new Node(node.row, node.index + 1, A.get(node.row)[node.index + 1]);
            max = Math.max(max, tmp.val);
            minHeap.add(tmp);
        }
        return res;
    }
}
