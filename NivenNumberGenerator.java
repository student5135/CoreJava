import java.util.Random;

public class NivenNumberGenerator {

    // Function to check if a number is a Niven (Harshad) number
    public static boolean isNiven(int num) {
        int sumOfDigits = 0, temp = num;
        
        while (temp > 0) {
            sumOfDigits += temp % 10;  // Extract last digit and add to sum
            temp /= 10;  // Remove last digit
        }

        return (num % sumOfDigits == 0);  // Check divisibility
    }

    // Function to generate a random Niven number within a range
    public static int generateRandomNiven(int min, int max) {
        Random random = new Random();
        int num;

        do {
            num = random.nextInt(max - min + 1) + min; // Generate random number
        } while (!isNiven(num)); // Repeat until a Niven number is found

        return num;
    }

    public static void main(String[] args) {
        // Test the Niven number checker
        int testNum = 18;  // Example: 18 is a Niven number (1+8 = 9, and 18 is divisible by 9)
        System.out.println(testNum + " is a Niven Number? " + isNiven(testNum));

        // Generate a random Niven number between 10 and 100
        int randomNiven = generateRandomNiven(10, 100);
        System.out.println("Random Niven Number (10 to 100): " + randomNiven);
    }
}
