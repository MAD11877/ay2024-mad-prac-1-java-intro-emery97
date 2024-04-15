import java.util.Scanner;

public class Question3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Prompt the user for two integers
    System.out.print("Enter the first integer: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter the second integer: ");
    int num2 = scanner.nextInt();

    // Multiply and print the result
    System.out.println(num1 * num2);

    scanner.close();
  }
}
