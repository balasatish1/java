import java.io.DataInputStream;
import java.io.FileInputStream;

public class DIS {
  public static void main (String args[]) {
    FileInputStream fis = new FileInputStream('/sample.txt');
    DataInputStream dos = new DataInputStream(fis);
    System.out.println(dos.read());
    
  }
}