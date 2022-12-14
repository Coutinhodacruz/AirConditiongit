
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComparisonTest {
    Comparison comparison;

    @BeforeEach
    void startAllTestWith(){
        comparison = new Comparison();
    }
    @Test
    void addThreeIntegers(){

       // Comparison comparison = new Comparison();

       int sum = comparison.addThreeIntegers(2,3,5);
        assertEquals(10,sum);
    }
    @Test
    void FindMinimumOfThreeIntegers(){

       // Comparison comparison = new Comparison();
        assertEquals(3, comparison.findMinimum(3,5,10));
    }
    @Test
    void findProductOfThreeIntegers(){
        assertEquals(8,comparison.findProduct(2,2,2));
    }
    @Test
    void findAverageOfThreeIntegers(){
        assertEquals(3, comparison.findAverage(2,2,2));
    }
}
