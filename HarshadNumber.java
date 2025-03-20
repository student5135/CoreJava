 class HarshadNumber {
    // Method to calculate the sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;  // Extract last digit and add to sum
            num /= 10;  // Remove last digit
        }
        return sum;
    }

    // Method to check if a number is a Harshad Number
    public static boolean isHarshadNumber(int num) {
        int sum = sumOfDigits(num);
        return num % sum == 0;  // Check divisibility
    }

    public static void main(String[] args) {
        int number = 18;  // Hardcoded input (Change this value as needed)

        if (isHarshadNumber(number)) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is NOT a Harshad Number.");
        }
    }
}
