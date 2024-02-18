
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        double val = Double.valueOf(scan.nextLine());
        double val1 = (100 + (val-5000) * .08);
        double val2 = (1700 + (val-25000) * .1);
        double val3 = (4700 + (val-55000) * .12);
        double val4 = (22100 + (val-200000) * .15);
        double val5 = (142100 + (val-1000000) * .17);

        if (!(val >= 5000)) {
            System.out.println("No tax!");
        } else if (val >= 5000 && val <= 25000) {
            System.out.println("Tax: " +val1);
        } else if (val > 25000 && val <= 55000) {
            System.out.println("Tax: " +val2);
        } else if (val > 55000 && val <= 200000) {
            System.out.println("Tax: " +val3); 
        } else if ( val > 200000 && val <= 1000000) {
            System.out.println("Tax: " +val4);
        } else {
            System.out.println("Tax: " +val5);
        }
    }
}
