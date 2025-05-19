package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for the Calculator implementation.
 * This class contains unit tests for all arithmetic operations
 * provided by the Calculator class.
 *
 * @author Your Name
 * @version 1.0
 */
public class CalculatorTest {
  
  private final Calculator calculator = new Calculator();
  
  /**
   * Tests the addition operation of the calculator.
   * Verifies that the calculator correctly adds two numbers,
   * including positive numbers and numbers with different signs.
   */
  @Test
  public void testAdd() {
    assertEquals(5, calculator.add(2, 3));
    assertEquals(0, calculator.add(-2, 2));
  }
  
  /**
   * Tests the subtraction operation of the calculator.
   * Verifies that the calculator correctly subtracts two numbers,
   * including cases where the result is negative or zero.
   */
  @Test
  public void testSubtract() {
    assertEquals(-1, calculator.subtract(2, 3));
    assertEquals(0, calculator.subtract(2, 2));
  }
  
  /**
   * Tests the multiplication operation of the calculator.
   * Verifies that the calculator correctly multiplies two numbers,
   * including cases with zero and positive numbers.
   */
  @Test
  public void testMultiply() {
    assertEquals(6, calculator.multiply(2, 3));
    assertEquals(0, calculator.multiply(0, 5));
  }
  
  /**
   * Tests the division operation of the calculator.
   * Verifies that the calculator correctly divides two numbers,
   * including cases with decimal results.
   */
  @Test
  public void testDivide() {
    assertEquals(2.0, calculator.divide(10, 5), 0.0001);
    assertEquals(0.5, calculator.divide(1, 2), 0.0001);
  }
  
  /**
   * Tests that division by zero throws an ArithmeticException.
   * Verifies that the calculator properly handles the error case
   * of attempting to divide by zero.
   */
  @Test(expected = ArithmeticException.class)
  public void testDivideByZero() {
    calculator.divide(1, 0);
  }
  
  /**
   * Tests the power operation of the calculator.
   * Verifies that the calculator correctly raises a number to a power,
   * including cases with zero, negative, and positive exponents.
   */
  /*
  @Test
  public void testPower() {
    assertEquals(8, calculator.power(2, 3));
    assertEquals(1, calculator.power(5, 0));
    assertEquals(0.25, calculator.power(2, -2), 0.0001);
  }
  */
}