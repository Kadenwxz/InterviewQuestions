package tree.printTreeWithIndent;

import static org.junit.Assert.*;

import org.junit.Test;

import tree.TreeNode;

public class PrintTreeWithIndentTest {

    @Test
    public void printTreeWithIndentTest(){
        TreeNode a = new TreeNode(1), b = new TreeNode(2), c = new TreeNode(3), 
                 d = new TreeNode(4), e = new TreeNode(5), f = new TreeNode(6);
        a.left = b; a.right = c;
        b.left = d; b.right = f;
        c.left = e;
        PrintTreeWithIndent solution = new PrintTreeWithIndent();
        solution.printTree(a);
    }
}
