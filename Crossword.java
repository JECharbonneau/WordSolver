import java.util.Scanner;

public class Crossword{
  Scanner s = new Scanner(System.in);
  Combinations coms = new Combinations();
  Dictionary dict = new Dictionary();

  // Constructor

  // Methods
    // public void runCrossword()
      // Take Input from User
        // How many letters in word
          // Would also have to ask for letters known and their positions
        // Enter a string with '_' representing blank letters

      // Break down Input
        // Figure out how to put a string into a char array
          // What to do about spaces
        // Could also try using two arrays, like a subnet so you don't worry about spaces??
          // Might not work as well or be as effiecent, but it'd be easier

      // Make a method call to Combinations class, crosswordCombinations method

      // Make a method call to Dictionary class, findWord method

      // Print possible words
}
