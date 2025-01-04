class Rectangle {
  int height = 0;
  int width = 0;
  int area = 0;

  void getHeightAndWidth(int h, int w) {
    height = h;
    width = w;
  }

  void calculateArea() {
    area = height * width;
  }

}

public class ClassObject {
  public static void main(String args[]) {
    Rectangle rectangleObj = new Rectangle();
    rectangleObj.getHeightAndWidth(14, 20);
    rectangleObj.calculateArea();
    System.out.println("Area of the rectangle : " + rectangleObj.area);
  }
}