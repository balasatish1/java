
class Addition {

  int sum() {
    return 0;
  }

  int sum(int x, int y) {
    return (x + y);
  }

  int sum(int x, int y, int z) {
    return (x + y + z);
  }

  float sum(float x, float y) {
    return (x + y);
  }

  double sum(double x, double y) {
    return (x + y);
  }
}

public class MethodOverloading {
  public static void main(String args[]) {
    Addition sumObj = new Addition();
    System.out.println(sumObj.sum());
    System.out.println(sumObj.sum(10, 20));
    System.out.println(sumObj.sum(10, 20, 30));
    System.out.println(sumObj.sum(123.36, 659.36));
    System.out.println(sumObj.sum((float) 45.36, (float) 85.69));
  }
}