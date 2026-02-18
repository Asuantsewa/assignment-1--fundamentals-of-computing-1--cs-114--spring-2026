import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args) {
      System.out.println("JJJJJ      EEEEE");
      System.out.println("  J        E    ");
      System.out.println("  J        EEEE ");
      System.out.println("J J        E    ");
      System.out.println(" J         EEEEE");

      /*Scanner input = new Scanner(System.in);
      System.out.print("Enter a 5 chracter string: ");
      /*String inpuString = input.nextLine();
      if (input.length() != 5) {
        System.out.println("Invalid input. Please enter exactly 5 characters. ");
        return;
         String middleString = input.substring(1,4);
         String reversedmiddleString = new String(middleString). reversedMiddle().toString();
      }*/
      double farenheitTemp;
     Scanner temp = new Scanner(System.in);
     System.out.println("Enter a nimber in Farenheit: ");
     farenheitTemp = temp.nextDouble();
      double celsuis = (farenheitTemp - 32) / 1.98;
      int intcelsuis = (int) celsuis;
      System.out.println(intcelsuis);
      
      
     input.close();
  }
}
