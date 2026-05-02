public class swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static int multiply(int a , int b) {
        int product = a*b;
        return product;
    }

    public static int divide(int a , int b) {
        int quotient = a/b;
        return quotient;
    }
}
