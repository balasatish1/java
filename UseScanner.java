import java.util.Scanner;
import java.io.IOException;

public class UseScanner {
  public static void main (String args[]) {
    Scanner reader = new Scanner(System.in);
    
      System.out.print("Enter your name : ");
      String name = reader.nextLine();
      System.out.println(name);
      System.out.print("Enter you age : ");
      int age = reader.nextInt();
      System.out.println(age);
 

  }
}