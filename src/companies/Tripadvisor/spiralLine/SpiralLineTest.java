package companies.Tripadvisor.spiralLine;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import companies.Tripadvisor.spiralLine.SpiralLine.Pair;

public class SpiralLineTest {

    @Test
    public void test() {
        SpiralLine solution = new SpiralLine();
        List<Pair> res = solution.getSpiral(20);
        for(Pair tmp : res){
            System.out.println(tmp);
        }
    }

}
