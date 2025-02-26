public class NumberCheck {
    public static void main(String[] args) {
        
        double num = -5.2;  
        
        String result = (num > 0) ? "The number is positive." :
                        (num < 0) ? "The number is negative." :
                        "The number is zero.";

      
        System.out.println(result);
    }
}
