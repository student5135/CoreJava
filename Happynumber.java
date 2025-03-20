 class Happynumber {
    // Method to calculate the sum of squares of digits
    public static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;  // Extract last digit
            sum += digit * digit;  // Square the digit and add to sum
            num /= 10;  // Remove last digit
        }
        return sum;
    }

    // Method to check if a number is a Happy Number
    public static boolean isHappyNumber(int num) {
        int slow = num, fast = num;
        do {
            slow = sumOfSquares(slow);  // Move one step
            fast = sumOfSquares(sumOfSquares(fast));  // Move two steps
        } while (slow != fast);  // Detect cycle
        
        return slow == 1;  // If cycle ends at 1, it is a happy number
    }

    public static void main(String[] args) {
        int number = 19;  // Hardcoded input (Change this value as needed)
        
        if (isHappyNumber(number)) {
            System.out.println(number + " is a Happy Number.");
        } else {
            System.out.println(number + " is NOT a Happy Number.");
        }
    }
}
