import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args) {
      System.out.println("JJJJJ      EEEEE");
      System.out.println("  JJ        E    ");
      System.out.println("  JJ        EEEE ");
      System.out.println("J JJ        E    ");
      System.out.println("JJJ         EEEEE");

      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      System.out.print("Enter a 5 chracter string: ");
      if (input.length() != 5) {
        System.out.println("Invalid input. Please enter exactly 5 characters. ");
      return;
    }
          
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
      
      
     /*input.close();*/
     temp.close();
  }
