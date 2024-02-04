// Geometric Object class
public abstract class GeometricObject implements Comparable<GeometricObject> {
  private String color;
  private boolean filled;
  private java.util.Date dateCreated;

  // default constructor
  protected GeometricObject() {
    dateCreated = new java.util.Date();
  }
// construcotr with parameters
  protected GeometricObject(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  }
  // Getter and setter methods
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public boolean isFilled() {
    return filled;
  }
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  @Override
  public int compareTo(GeometricObject o) {
    double thisArea = this.getArea();
    double otherArea = o.getArea();

    if (thisArea < otherArea) {
      return -1;
    } else if (thisArea > otherArea) {
      return 1;
    } else {
      return 0;
    }
      
  }                
  
  public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
    return (obj1.compareTo(obj2) >= 0) ? obj1 : obj2;
  }

  public abstract double getArea();

  public abstract double getPerimeter();

  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
  }
}  