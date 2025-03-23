 class MagicNumber {
    public static void main(String[] args) {
        int num = 19;  // Change this number to test other cases

        int sum = num;
        while (sum > 9) {  // Continue summing digits until single-digit remains
            int temp = sum;
            sum = 0;
            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }

        if (sum == 1) {
            System.out.println(num + " is a Magic Number.");
        } else {
            System.out.println(num + " is NOT a Magic Number.");
        }
    }
}
