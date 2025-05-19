package calculator;

/**
 * A simple calculator class that provides basic arithmetic operations.
 * This class supports addition, subtraction, multiplication, and division operations
 * with both integer and floating-point numbers.
 *
 * @author Your Name
 * @version 1.0
 */
public class Calculator {

  /**
   * Adds two numbers together.
   *
   * @param a the first number to add
   * @param b the second number to add
   * @return the sum of a and b
   */
  public int add(int a, int b) {
    return a + b;
  }

  /**
   * Subtracts the second number from the first number.
   *
   * @param a the number to subtract from
   * @param b the number to subtract
   * @return the difference between a and b
   */
  public int subtract(int a, int b) {
    return a - b;
  }

  /**
   * Multiplies two numbers together.
   *
   * @param a the first number to multiply
   * @param b the second number to multiply
   * @return the product of a and b
   */
  public int multiply(int a, int b) {
    return a * b;
  }

  /**
   * Divides the first number by the second number.
   * Note: Division by zero will throw an ArithmeticException.
   *
   * @param a the dividend
   * @param b the divisor
   * @return the quotient of a divided by b
   * @throws ArithmeticException if b is zero
   */
  public double divide(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("Division by zero is not allowed");
    }
    return (double) a / b;
  }

  /**
   * Raises a number to a power.
   *
   * @param base     the base number
   * @param exponent the exponent
   * @return the result of base raised to the power of exponent
   */
  /* 
  public double power(double base, double exponent) {
    return Math.pow(base, exponent);
  } */
}