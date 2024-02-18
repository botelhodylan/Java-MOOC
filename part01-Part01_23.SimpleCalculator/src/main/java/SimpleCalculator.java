
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int a = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int b = Integer.valueOf(scanner.nextLine());
        int c = a+b;
        int d = a-b;
        int e = a*b;
        double f = (1.0)*a/b;
        System.out.println(a+ " + " +b+ " = " +c);
        System.out.println(a+ " - " +b+ " = " +d);
        System.out.println(a+ " * " +b+ " = " +e);
        System.out.println(a+ " / " +b+ " = " +f);


    }
}
