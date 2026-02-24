import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args) {
    System.out.println("JJJJJ      EEEEE");
    System.out.println("   JJ       E    ");
    System.out.println("   JJ       EEEE ");
    System.out.println("J  JJ       E    ");
    System.out.println(" JJ        EEEEE");

  try (Scanner scanner = new Scanner(System.in)) {
    System.out.print("Enter a 5 chracter string: ");
    String input = scanner.nextLine();
    if (input.length() != 5) {
    System.out.println("Invalid input. Please enter exactly 5 characters. ");
    return; 
    }else{
      String middle = input.substring(1,4);
      String reversedMiddle = new StringBuilder(middle).reverse().toString();
      System.out.println(reversedMiddle);
    }
  }
  }
}

//temp.close();

//System.out.println("Enter a 5-character string: ");

//String input = scanner.nextLine();

// Check if the input is exactly 5 characters long
//if (input.length() != 5) {
  //System.out.println("Invalid input. Please enter exactly 5 characters.");
  
  //return; // Stop the program if it's not 5 characters


// Remove the first and last characters, and reverse the middle three
//String middle = input.substring(1, 4); // Get characters at index 1, 2, 3
//String reversedMiddle = new StringBuilder(middle).reverse().toString();
//System.out.println("Processed string: " + reversedMiddle);
