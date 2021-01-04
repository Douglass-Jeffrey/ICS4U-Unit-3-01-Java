/*
* This program uses recursion to reverse a string.
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2021-01-04
* Class StringReverser.
*/

public class StringReverser {

  /**
   * Function reverses the string.
   */
  public static String reverser(String someString) {
    
    // check if string is empty
    if (someString.isEmpty()) {
      return someString;
    // enter reverser function again if it is not empty
    } else {
      return reverser(someString.substring(1)) + someString.charAt(0);
    }
  }

  /**
   * Main function.
   */
  public static void main(String[] args) {
    String recString = "Recursion";
    System.out.println("Original String: " + recString);
    System.out.println("Reversed String: " + reverser(recString));
  }
}
