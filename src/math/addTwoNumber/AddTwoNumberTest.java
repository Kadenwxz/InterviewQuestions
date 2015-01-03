package math.addTwoNumber;

import static org.junit.Assert.*;
import org.junit.Test;

public class AddTwoNumberTest {
    @Test
    public void AddTwoNumberTest(){
        AddTwoNumber solution = new AddTwoNumber();
        assertEquals(2, solution.add(0, 2));
        assertEquals(4, solution.add(-1, 5));
    }
}
