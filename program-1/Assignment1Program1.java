import java.util.Scanner;
import java.util.Random;

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
    double farenheitTemp;
    Scanner temp = new Scanner(System.in);
    System.out.println("Enter a number in Farenheit: ");
    farenheitTemp = temp.nextDouble();
    double celsuis = (farenheitTemp - 32.0) * 5.0 / 9.0;
    System.out.println(celsuis);
  }
  int max = 16384;
  int min = 32;
  Random number = new Random();
  int randNumber = number.nextInt(max - min + 1) + min;
  System.out.println("Random number generated: " + randNumber);
  }
  System.out.println("Your new string is" + celsuis + reversedMiddle + randNumber);

  }
}

//temp.close();
