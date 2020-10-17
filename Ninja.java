import java.util.Scanner;
import java.lang.Math;

public class Ninja {

    public static void main(String[] args) {
        int n = 154;
        int a, b, c;
        a = n % 10;
        b = (n / 10) % 10;
        c = n / 100;
        int sum = a + b + c;

        System.out.println(sum);

        Scanner input = new Scanner(System.in);

        double x = input.nextDouble();
        double y = input.nextDouble();

        double night = x % y;

        if (night == 0) {
            System.out.println("Can divide");

        } else {
            System.out.println("Cannot divide");

        }
        double license = x / y;
        System.out.println(license);

    }

}
