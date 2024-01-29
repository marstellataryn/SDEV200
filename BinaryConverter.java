public class BinaryFormatException extends Exception {
  public BinaryFormatExcepion(String message) {
    super(message);
  }

public class BinaryConverter {
  public static void main(String[] args) {
    try {
      System.out.println(bin2Dec("1101")); // valid binary string
      System.out.println(bin2Dec("1234")); // throws BinaryFormatException
    } catch (BinaryFormatException e) {
        System.out.println("Exception: " + e.getMessage());
    }
  }

  public static int bin2Dec(String binaryString) throws BinaryFormatException {
    for (int i = 0; i < binaryString.length(); i++) {
      char ch = binaryString.charAt(i);
      if (ch != '0' && ch != '1') {
        throw new BinaryFormatException("Invalid binary string: " + binaryString);
      }
    }
    
    return Integer.parseInt(binaryString, 2);
}
}