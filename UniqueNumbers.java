 class UniqueNumbers {
    public static void main(String[] args) {
        // Define individual numbers
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 10; // Change this to test for uniqueness

        // Check uniqueness using conditions
        if (num1 != num2 && num1 != num3 && num1 != num4 && num1 != num5 &&
            num2 != num3 && num2 != num4 && num2 != num5 &&
            num3 != num4 && num3 != num5 &&
            num4 != num5) {
            System.out.println("All numbers are unique.");
        } else {
            System.out.println("Numbers are not unique.");
        }
    }
}
