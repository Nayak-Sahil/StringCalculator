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

    @Test
    public void shouldHandleNewLineDelimiter(){
        assertEquals(6, calc.add("1\n2,3"), "New line delimiter should be handled");
        assertEquals(6, calc.add("1\n2\n3"), "New line delimiter should be handled");
        assertEquals(6, calc.add("1,2\n3"), "New line delimiter should be handled");
        //! Note: "1,\n3" is invalid input, it means after comma there should be a number.
    }

    @Test
    public void shouldHandleCustomDelimiter(){
        assertEquals(3, calc.add("//;\n1;2"), "Custom delimiter should be handled");
        assertEquals(3, calc.add("//.\n1.2"), "Custom delimiter should be handled");
        assertEquals(3, calc.add("//|\n1|2"), "Custom delimiter should be handled");
    }
}