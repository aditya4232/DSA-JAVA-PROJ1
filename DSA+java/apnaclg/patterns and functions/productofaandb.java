public class productofaandb {
    public static int multiply(int a , int b) {
        int product = a*b;
        return product;
    }

    public static int divide(int a , int b) {
        int quotient = a/b;
        return quotient;
    }
    
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;

        int resultMultiply = multiply(num1, num2);
        int resultDivide = divide(num1, num2);

        System.out.println("Multiplication: " + resultMultiply);
        System.out.println("Division: " + resultDivide);
    }
}
