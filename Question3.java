import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */

    Scanner scanner = new Scanner(System.in);  // Renamed in to scanner

    // Read the first integer
    System.out.print("Enter an integer: ");
    int num1 = scanner.nextInt();

    // Read the second integer (using the same scanner object)
    System.out.print("Enter another integer: ");
    int num2 = scanner.nextInt();

    // Multiply the integers and print the result
    System.out.println(num1 * num2);

    scanner.close();  // Close the scanner to avoid resource leaks
  }
}


