import java.util.HashMap;
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner in = new Scanner(System.in);
    int count = in.nextInt();

    // Create a HashMap to store the occurrences of each integer
    HashMap<Integer, Integer> occurrences = new HashMap<>();

    // Read the integers and count their occurrences
    for (int i = 0; i < count; i++) {
      int num = in.nextInt();
      occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
    }

    // Find the mode (number with the highest occurrence)
    int mode = 0;
    int maxCount = 0;

    for (int num : occurrences.keySet()) {
      if (occurrences.get(num) > maxCount) {
        maxCount = occurrences.get(num);
        mode = num;
      }
    }

    // Print the mode
    System.out.println(mode);
  }
}
