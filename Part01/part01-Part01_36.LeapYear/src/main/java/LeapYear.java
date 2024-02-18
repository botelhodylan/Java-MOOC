
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int a = Integer.valueOf(scan.nextLine());

        if (a % 100 == 0 && a % 400 != 0) {
            System.out.println("This year is not a leap year.");
        } else if (a % 4 != 0) {
            System.out.println("This year is not a leap year.");
        } else if (a % 4 == 0 || a % 100 == 0 && a % 400 == 0){
            System.out.println("This year is a leap year.");
        } else {
            System.out.println("This year is not a leap year.");
        }
    }
}
