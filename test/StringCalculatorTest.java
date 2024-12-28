package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.*;
import app.StringCalculator;

public class StringCalculatorTest{
    @Test // ? @Test Annotation marks a method as a test method that will be run by the JUnit framework.
    public void shouldReturnZeroOnEmptyString(){
        StringCalculator calc = new StringCalculator();
        assertEquals(0, calc.add(""), "Empty string should return 0");
    }
}