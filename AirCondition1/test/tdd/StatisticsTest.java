package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsTest {
    @Test
    void AddFiveIntegers(){
        Statistics statistics = new Statistics();
        int sum = Statistics.AddFiveIntegers(2,4,6,8,2);
        assertEquals(22,sum);
    }
    @Test
    void LargestNumber(){
        Statistics statistics = new Statistics();
        assertEquals(6,Statistics.LargestNumber(2,3,5,6,4));
    }
    @Test
    void SmallestNumber(){
        Statistics statistics =  new Statistics();
        assertEquals(5,Statistics.SmallestNumber(8,5,9,6,7));
    }
}
