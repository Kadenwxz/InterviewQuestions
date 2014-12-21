package bfs.findGroups;

public class FindGroups {
    public int findGroups(int[][] m){
        int res = 0;
        if(m == null || m.length == 0 || m[0].length == 0)return res;
        int h = m.length, w = m[0].length;
        for(int i = 0; i < h; i ++){
            for(int j = 0; j < w; j ++){
                if(m[i][j] == 0){
                    if(i - 1 >= 0 && m[i - 1][j] > 1){
                        m[i][j] = m[i - 1][j];
                    }else if(i + 1 < h && m[i + 1][j] > 1){
                        m[i][j] = m[i + 1][j];
                    }else if(j - 1 >= 0 && m[i][j - 1] > 1){
                        m[i][j] = m[i][j - 1];
                    }else if(j + 1 < w && m[i][j + 1] > 1){
                        m[i][j] = m[i][j + 1];
                    }else{
                        res ++;
                        m[i][j] = res + 1;
                    }
                }
            }
        }
        return res;
    }
}
