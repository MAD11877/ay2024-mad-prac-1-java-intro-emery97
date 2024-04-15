/* DoubleTest ✘ java.util.NoSuchElementException*/

import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */

    Scanner in = new Scanner(System.in);

    // Read the first integer
    int num1 = in.nextInt();
    Scanner ini = new Scanner(System.in);
    // Read the second integer
    int num2 = ini.nextInt();

    // Multiply the integers and print the result
    System.out.println(num1 * num2);
  }
}
