public class TestGeometricObject {
  public static void main(String[] args) {
    Circle circle1 = new Circle(5);
    Circle circle2 = new Circle(7);

    Rectangle rectangle1 = new Rectangle(4, 6);
    Rectangle rectangle2 = new Rectangle(3, 8);

    GeometricObject largerCircle = GeometricObject.max(circle1, circle2);
    GeometricObject largerRectangle = GeometricObject.max(rectangle1, rectangle2);

    System.out.println("The larger circle has area: " + largerCircle.getArea());
    System.out.println("The larger rectangle has area: " + largerRectangle.getArea());
  }
}