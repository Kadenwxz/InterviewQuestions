package operator.addition;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AdditionTest {
    
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    
    @Test
    public void overflowTest() throws Exception{
        int a = Integer.MAX_VALUE, b = 1;
        Addition solution = new Addition();
        thrown.expect(Exception.class);
        thrown.expectMessage("Integer Overflow!!!");
        solution.add(a, b);
    }
    
    @Test
    public void normalTest() throws Exception{
        Random random = new Random();
        Addition solution = new Addition();
        for(int i = 0; i < 1000; i ++){
            int a = random.nextInt(1000), b = random.nextInt(1000);
            assertEquals(a + b, solution.add(a, b));
        }
    }

}
