/*BMITest ✘ expected:<[]0.1> but was:<[Enter your height in meters: Enter your weight in kilograms: Your BMI is: ]0.1>*/

import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {    
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    Scanner in = new Scanner(System.in);

    // Prompt user to enter height
    System.out.print("");
    double height = in.nextDouble();

    // Prompt user to enter weight
    System.out.print("");
    double weight = in.nextDouble();

    // Calculate BMI
    double BMI = weight / (height * height);

    // Print BMI
    System.out.println(BMI);
  }
}
