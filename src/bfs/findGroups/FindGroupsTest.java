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
    }

}
