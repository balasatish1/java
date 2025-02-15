import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.System;

public class ReadData {
  public static void main (String args[]) {
    InputStreamReader input = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(input);

    try {
      System.out.print("Enter you name : ");
      String myName = reader.readLine();

      System.out.print("Enter your age : ");
      int age = Integer.parseInt(reader.readLine());


      System.out.println("Your name is " + myName + " Your age is"+ age);
    } catch (IOException e) {
      System.out.println("There is an error in reading");
      e.printStackTrace();
    }
  }
}