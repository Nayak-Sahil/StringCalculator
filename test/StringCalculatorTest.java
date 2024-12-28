package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import app.StringCalculator;

public class StringCalculatorTest{

    StringCalculator calc;

    @BeforeEach // ? @BeforeEach: lifecycle annotation (run before each test method).
    public void setup(){    
        calc = new StringCalculator();
    }

    @Test // ? @Test: marks a method as a test method that will be run by the JUnit framework.
    public void shouldReturnZeroOnEmptyString(){
        assertEquals(0, calc.add(""), "Empty string should return 0");
    }

    @Test
    public void shouldReturnSameOnSingleDigit(){
        assertEquals(1, calc.add("1"), "Number should return the same number");
    }

    @Test
    public void shouldReturnSumOnTwoDigits(){
        assertEquals(3, calc.add("1,2"), "Sum of two numbers should return the sum");
    }
}