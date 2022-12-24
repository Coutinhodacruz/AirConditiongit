package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {

    @Test
    void EnterInteger(){
        //test
        Arithmetic arithmetic = new Arithmetic();
       int multiply = arithmetic.EnterInteger(10);
        assertEquals(10,multiply);

    }
    @Test
    void SecondInteger(){
        //test
        Arithmetic arithmetic = new Arithmetic();
        int multiply = arithmetic.SecondInteger(15);
        assertEquals(15,multiply);
    }
    @Test
    void SquareIntegers(){
        //test
        Arithmetic arithmetic = new Arithmetic();
        int multiply = arithmetic.SquareIntegers(10 * 10);
        assertEquals(10000,multiply);
    }
    @Test
    void SquareOfNumber(){
        //test
        Arithmetic arithmetic = new Arithmetic();
        int multiply = arithmetic.SquareOfNumber(15 * 15);
        assertEquals(50625, multiply);
    }
    @Test
    void AddSquareNumber(){
        //test
        Arithmetic arithmetic = new Arithmetic();
        int sum = arithmetic.AddSquareNumber(10 + 15);
        assertEquals(10 + 15,sum);
    }

}
