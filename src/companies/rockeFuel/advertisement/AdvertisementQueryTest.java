package companies.rockeFuel.advertisement;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import companies.rockeFuel.advertisement.AdvertisementQuery.Advertisement;

public class AdvertisementQueryTest {
    @Test
    public void test() {
        AdvertisementQuery solution = new AdvertisementQuery();
        List<Advertisement> list = Arrays.asList(solution.new Advertisement("121", "new"), solution.new Advertisement("130", "new york"), 
                solution.new Advertisement("145", "new york time square"), solution.new Advertisement("156", "new york department store"));
        solution.construct(list);
        solution.print();
        System.out.println(solution.getValue("new york department store"));
    }

}
