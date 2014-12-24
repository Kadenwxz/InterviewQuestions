package bfs.findGroups;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindGroupsTest {

    @Test
    public void test() {
        int[][] m = {{0, 0, 1, 1, 1},
                     {0, 1, 1, 1, 0},
                     {0, 1, 1, 1, 0},
                     {1, 0, 1, 1, 1},
                     {1, 1, 1, 1, 1}};
        FindGroups findGroups = new FindGroups();
        int res = findGroups.findGroups(m);
        assertEquals(3, res);
        int A = 1, B = 2, n = 3;
        int len = (int)Math.ceil(0.5);
        System.out.println(len);
    }

}
