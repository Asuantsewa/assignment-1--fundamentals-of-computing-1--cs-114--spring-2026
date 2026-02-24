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
        System.out.println( reversedMiddle);
        scanner.close();
      }
     double farenheitTemp;
     Scanner temp = new Scanner(System.in);
     System.out.println("Enter a nimber in Farenheit: ");
     farenheitTemp = temp.nextDouble();
      double celsuis = (farenheitTemp - 32) / 1.98;
      int intcelsuis = (int) celsuis;
      System.out.println(intcelsuis);
  temp.close();
  scanner.close();
  }
