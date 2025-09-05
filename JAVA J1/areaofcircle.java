import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        double area = 3.14 * rad * rad;
        System.err.println(area);
    }
    
}
