import java.util.Scanner;
public class Assignment1Program2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int base = 10;
    System.out.print(" Enter a base 10 numer to convert between (2 - 9)");
    int baseNumber = scanner.nextInt();

    if (baseNumber < 2 || baseNumber> 36) {
      System.out.println("Invalid base. Please enter a base between 2 and 36.");
    return;
  }
  System.out.println("The maximum, 4 digit, " + base +"number in base " + baseNumber + "is"); 


  }
}
