// Main Method
import java.util.Scanner;

public class WordSolver {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Crossword cross = new Crossword();
    Combinational combo = new Combinational();

    // ask for which type of Method
    System.out.println("Welcome to WordSolver!");
    System.out.println();
    System.out.println("Please choose a mode:");
    System.out.println("0 - Exit");
    System.out.println("1 - Crossword");
    System.out.println("2 - Combinational");
    System.out.print("Input: ");
    int c = s.nextInt();

    // switch and method calls (Crossword and Combinational) in while
    while (c != 0) {
      switch (c) {
        case 1:
          cross.runCrossword();
          break;
        case 2:
          combo.runCombinational();
          break;
        default:
          System.out.println("Please enter a valid input.")
      }
      System.out.println();
      System.out.println("Please choose a mode:");
      System.out.println("0 - Exit");
      System.out.println("1 - Crossword");
      System.out.println("2 - Combinational");
      System.out.print("Input: ");
      c = s.nextInt();
    }

    System.out.println();
    System.out.println("Thank you for using WordSolver!");
  }
}
