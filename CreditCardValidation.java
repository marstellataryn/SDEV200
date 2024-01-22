/** Marstella, Taryn */
/** SDEV200 M1A2*/

import java.util.Scanner;

public class CreditCardValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a  card number
        System.out.print("Enter a credit card number: ");
        long creditCardNumber = scanner.nextLong();

        // Check if the credit card number is valid and display the result
        if (isValidCreditCard(creditCardNumber)) {
            System.out.println("The credit card number is valid!");
        } else {
            System.out.println("Sorry, the credit card number is invalid.");
        }
    }

    // Check if the credit card number is valid using Luhn algorithm
    public static boolean isValidCreditCard(long number) {
        int totalSum = getDoubleEvenPlaceSum(number) + getOddPlaceSum(number);
        return (totalSum % 10 == 0) && isValidLength(number);
    }

    // Calculate the sum of double every second digit from right to left
    public static int getDoubleEvenPlaceSum(long number) {
        int sum = 0;
        long temp = number / 10;

        while (temp > 0) {
            sum += getDigit((int) (temp % 10) * 2);
            temp /= 100;
        }

        return sum;
    }

    // Get the sum of the digits in the odd places
    public static int getOddPlaceSum(long number) {
        int sum = 0;
        long temp = number;

        while (temp > 0) {
            sum += (int) (temp % 10);
            temp /= 100;
        }

        return sum;
    }

    // Return a single digit or the sum of two digits
    public static int getDigit(int number) {
        return (number < 10) ? number : (number % 10 + number / 10);
    }

    // Check if the credit card number has a valid length
    public static boolean isValidLength(long number) {
        int size = getNumberSize(number);
        return (size >= 13) && (size <= 16);
    }

    // Get the number of digits in a number
    public static int getNumberSize(long number) {
        int count = 0;

        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}

