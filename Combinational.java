import java.util.Scanner;

public class Combinational{
  Scanner s = new Scanner(System.in);
  Combinations coms = new Combinations();
  Dictionary dict = new Dictionary();

  // Constructor
  public Combinational() {}

  // Methods
    public void runCombinational(){
      char lArray[] = new char[];
      String possibleWords[] = new String[];
      String words[] = new String[];

      // Take Input from User
        System.out.println();
        System.out.println();
        System.out.println("You've chosen Combinational");
        System.out.println();

        System.out.print("Please enter the letters:");
        String lString = s.nextLine();

        // Break down Input
        for (int i = 0; i < lString.length; i++) {
          // *** String -> char Array
        }

        // Make a method call to  Combinations class, combinationalCombinations
          // Method
        possibleWords[] = coms.combinationalCombinations(lArray);

        // Make a call to  dictionary class, findWord Method
        words[] = dict.findWord(possibleWords);

        // Print possible words
        System.out.println("Possible Words:");
        System.out.println("--------------------");

        for (int i = 0; i < words.length; i++) {
          System.out.println(words[i]);
        }
      }
}
