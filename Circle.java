public class Circle extends GeometricObject implements Comparable<Circle> {
  private double radius;

  // constructor to set radius
  public Circle(double radius) {
    this.radius = radius;
  }

  // getter method for radius
  public double getRadius() {
    return radius;
  }

  // setter method for radius
  public void setRadius(double radius) {
    this.radius = radius;
  }

  // method to calculate area
  @Override
  public double getArea() {
    return Math.PI * radius * radius;
  }

  // method to calculate aand return perimeter
  @Override
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  // compare the two circles
  @Override
  public int compareTo(Circle otherCircle) {
    if (this.radius < otherCircle.radius) {
      return -1;
    } else if (this.radius > otherCircle.radius) {
      return 1;
    } else {
      return 0;
    } 
  }
  // check if circles are equal
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    Circle otherCircle = (Circle) obj;
    return Double.compare(otherCircle.radius, radius) == 0;
  }
}
