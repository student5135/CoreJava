class DigitCategory {
    public static void main(String[] args) {
        int Num = 98;
        String Result = (Num / 10 == 0) ? Num + " is a single-digit" :
                        (Num / 100 == 0) ? Num + " is a double-digit" :
                        (Num / 1000 == 0) ? Num + " is a three-digit" :
                        Num + " is more than three digits";

        System.out.println(Result);
    }
}
