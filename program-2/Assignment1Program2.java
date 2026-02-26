import java.util.Scanner;

public class Assignment1Program2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a base 10 number to convert betweeen (0 - 80): ");
    int base10Number = scanner.nextInt();
    if( base10Number < 0 || base10Number > 80){
    return;
    }

  System.out.print("Enter the target base (between 2 and 9): ");
  int targetBase = scanner.nextInt();

  if (targetBase < 2 || targetBase > 9) {
    System.out.println("Invalid base. Please enter a base between 2 and 9.");
    return;
  }
  String convertedNumber = convertToBase(base10Number, targetBase);
    System.out.println("Converted number: " + convertedNumber);

  int largest4DigitNumber = (int) Math.pow(targetBase, 4) - 1;
    System.out.println("Largest 4 digit number in base " + targetBase + ": " + largest4DigitNumber);
  }
  public static String convertToBase(int number, int base) {
    if (number == 0) {
    return "";
    }
    int remainder = number % base;
    char digit = (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + remainder - 10);
    return convertToBase(number / base, base) + digit;
  }
//scanner.close();
}
