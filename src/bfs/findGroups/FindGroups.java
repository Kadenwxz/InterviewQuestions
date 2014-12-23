package bfs.findGroups;

public class FindGroups {
    int h = 0, w = 0;
    public int findGroups(int[][] m){
        if(m == null || m.length == 0 || m[0].length == 0)return 0;
        h = m.length;
        w = m[0].length;
        // Initialize each group
        for(int i = 0; i < h; i ++){
            for(int j = 0; j < w; j ++){
                if(m[i][j] == 0){
                    m[i][j] = i * w + j + 2;
                }
            }
        }
        // Merge all the groups
        for(int i = 0; i < h; i ++){
            for(int j = 0; j < w; j ++){
                if(m[i][j] > 1){
                    merge(m, i, j, i - 1, j);
                    merge(m, i, j, i + 1, j);
                    merge(m, i, j, i, j - 1);
                    merge(m, i, j, i, j + 1);
                }
            }
        }
        // count distinct id
        int res = 0;
        for(int i = 0; i < h; i ++){
            for(int j = 0; j < w; j ++){
                if(m[i][j] > 1){
                    int src = find(m, i, j);
                    if(src > 1){
                        res ++;
                        set(m, src, 1);
                    }
                }
            }
        }
        return res;
    }
    
    private int find(int[][] m, int i, int j){
        int a = i, b = j;
        if(i < 0 || i >= h || j < 0 || j >= w || m[i][j] == 1)return 1;
        while(m[i][j] > 1 && m[i][j] != i * w + j + 2){
            int val = m[i][j];
            i = (val - 2)/w;
            j = (val - 2)%w;
        }
        // Compress path
        m[a][b] = m[i][j];
        return m[i][j];
    }
    
    private void merge(int[][] m, int a, int b, int c, int d){
        if(c < 0 || c >= h || d < 0 || d >= w || m[a][b] == 1 || m[c][d] == 1)return;
        int n1 = find(m, a, b), n2 = find(m, c, d);
        int max = Math.max(n1,  n2);
        set(m, n1, max);
        set(m, n2, max);
    }
    
    private void set(int[][] m, int src, int dest){
        int i = (src - 2) / w, j = (src - 2) % w;
        m[i][j] = dest;
    }
}
