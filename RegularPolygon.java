/** Marstella, Taryn */
/** SDEV200 */

public class RegularPolygon {
    private int n; // number of sides
    private double side; // length of side
    private double x; // x-coordinate of center
    private double y; // y-coordinate of center

    // No-arg constructor
    public RegularPolygon() {
        this.n = 3;
        this.side = 1.0;
        this.x = 0.0;
        this.y = 0.0;
    }

    // Constructor with specified number of sides and length of side
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0.0;
        this.y = 0.0;
    }

    // Constructor with specified number of sides, length of side, and coordinates
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Accessor methods
    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Mutator methods
    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method to calculate perimeter of the polygon
    public double getPerimeter() {
        return n * side;
    }

    // Method to calculate area of the polygon
    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        // Create RegularPolygon objects
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        // Display perimeter and area for each object
        displayPolygonInfo(polygon1, "Polygon 1");
        displayPolygonInfo(polygon2, "Polygon 2");
        displayPolygonInfo(polygon3, "Polygon 3");
    }

    // Helper method to display perimeter and area of a RegularPolygon object
    private static void displayPolygonInfo(RegularPolygon polygon, String name) {
        System.out.println(name + ":");
        System.out.println("Perimeter: " + polygon.getPerimeter());
        System.out.println("Area: " + polygon.getArea());
        System.out.println();
    }
}

