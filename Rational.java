import java.math.BigInteger;
import java.util.Scanner;

public class Rational {
  private BigInteger numerator;
  private BigInteger denominator;

  public Rational() {
    this(BigInteger.ZERO, BigInteger.ONE);
  }

  public Rational(BigInteger numerator, BigInteger denominator) {
    BigInteger gcd = numerator.gcd(denominator);
    this.numerator = numerator.divide(gcd);
    this.denominator = denominator.divide(gcd);
  }

  public Rational add(Rational secondRational) {
    BigInteger numerator = numerator.multiply(secondRational.getDenominator()).add(secondRational.getNumerator().multiply(denominator));
    BigInteger denominator = this.denominator.multiply(secondRational.denominator);
    return new Rational(numerator, denominator);
  }
  
  public Rational subtract(Rational secondRational) {
    BigInteger numerator = numerator.multiply(secondRational.getDenominator()).subtract(secondRational.getNumerator().multiply(denominator));
    BigInteger denominator = denominator.multiply(secondRational.getDenominator);
    return new Rational(numerator, denominator);
  }
  
  public Rational multiply(Rational secondRational) {
    BigInteger numerator = numerator.multiply(secondRational.getNumerator());
    BigInteger denominator = denominator.multiply(secondRational.getDenominator());
    return new Rational(numerator, denominator);
  }

  public Rational divide(Rational secondRational) {
    BigInteger numerator = numerator.multiply(secondRational.getDenominator());
    BigInteger denominator = denominator.multiply(secondRational.getNumerator());
    return new Rational(numerator, denominator);
  }

  public BigInteger getNumerator() {
    return numerator;
  }
  
  public BigInteger getDenominator() {
    return denominator;
  }

  @Override
  public String toString() {
    if (denominator.equals(BigInteger.ONE)) {
      return numerator.toString();
    } else {
      return numerator + "/" + denominator;
    }
  }

  public double toDouble() {
    return numerator.doubleValue() / denominator.doubleValue();
  }
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // * Get user input ** /
    System.out.print("Please enter the first rational number: ");
    BigInteger num1 = input.nextBigInteger();
    BigInteger den1 = input.nextBigInteger();
    Rational rational1 = new Rational(num1, den1);

    System.out.print("Please enter the second rational number: ");
    BigInteger num2 = input.nextBigInteger();
    BigInteger den2 = input.nextBigInteger();
    Rational rational2 = new Rational(num2, den2);

    // * print results **/
    System.out.println(rational1 + " + " + rational2 + " = " + rational1.add(rational2));
    System.out.println(rational1 + " - " + rational2 + " = " + rational1.subtract(rational2));
    System.out.println(rational1 + " * " + rational2 + " = " + rational1.multiply(rational2));
    System.out.println(rational1 + " / " + rational2 + " = " + rational1.divide(rational2));
    System.out.println(rational2 + " is approximately " + rational2.toDouble());
  }
  