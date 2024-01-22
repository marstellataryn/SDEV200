/** Marstella, Taryn */
/** SDEV200 6.9 */



public class Conversion {
  /** Convert feet to meters */
  public static double feetToMeters(double feet) {
    return 0.305 * feet;
  }
  /** Convert meters to feet */
  public static double metersToFeet(double meters) {
    return 3.279 * meters;
  
  }
  public static void main(String[] args) {
    // table header
    System.out.printf("%-12s%-12s\n", "Feet", "Meters");
    // table separator 
    System.out.println("----------------------------------");
    // table body
    for (int i = 1; i <= 10; i++) {
      double feetValue = i * 1.0;
      double metersValue = Conversion.feetToMeters(feetValue);  
      
      System.out.printf("%-12.2f%-12.2f\n", feetValue, metersValue);
      
    }
    System.out.println("\n");
    System.out.printf("%-12s%-12s\n", "Meters", "Feet");

    System.out.println("----------------------------------");
    for (int i = 5; i <= 12; i++) {
      double metersValue = i * 5.0;
      double feetValue = Conversion.metersToFeet(metersValue);
      
      
      System.out.printf("%-12.2f%-12.2f\n" , metersValue, feetValue);
}
  }
}
