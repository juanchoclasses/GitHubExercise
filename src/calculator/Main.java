package calculator;

import java.util.Scanner;

/**
 * The main class that provides a command-line interface for the Calculator.
 * This class demonstrates the usage of the Calculator class by allowing users
 * to perform basic arithmetic operations through a simple text-based interface.
 *
 * @author Your Name
 * @version 1.0
 */
public class Main {

  /**
   * The main entry point of the application.
   * Creates a calculator instance and provides an interactive command-line interface
   * for performing arithmetic operations.
   *
   * @param args command line arguments (not used)
   */
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nCalculator Menu:");
      System.out.println("1. Add");
      System.out.println("2. Subtract");
      System.out.println("3. Multiply");
      System.out.println("4. Divide");
      System.out.println("5. Exit");
      System.out.print("Choose an operation (1-5): ");

      int choice = scanner.nextInt();

      if (choice == 5) {
        System.out.println("Goodbye!");
        break;
      }

      System.out.print("Enter first number: ");
      int a = scanner.nextInt();
      System.out.print("Enter second number: ");
      int b = scanner.nextInt();

      try {
        switch (choice) {
          case 1:
            System.out.println("Result: " + calculator.add(a, b));
            break;
          case 2:
            System.out.println("Result: " + calculator.subtract(a, b));
            break;
          case 3:
            System.out.println("Result: " + calculator.multiply(a, b));
            break;
          case 4:
            System.out.println("Result: " + calculator.divide(a, b));
            break;
          default:
            System.out.println("Invalid choice!");
        }
      } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
      }
    }

    scanner.close();
  }
}