import java.util.Scanner;

public class javafunctions2 {

    public static void printhello() {
        System.out.println("Hello");
        System.out.println("hello 1");
    
    }

    public static void CalaulateSum() {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;    
            System.out.println("Sum is " + sum);
        }
    }

    public static void main(String[] args) {
        
    CalaulateSum();

    }
    
}
