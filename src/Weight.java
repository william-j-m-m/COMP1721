import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        // reading in the value from the user
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter weight in kilogram: ");
        double kiloWeight = myObj.nextDouble();

        // converting to ounces, then pounds and ounces
        double ounces = kiloWeight * 35.274;
        int pounds = (int) Math.floor((ounces / 16));
        double remainingOunces = ounces % 16;

        // outputting in required format
        System.out.printf("Equivalent imperial weight is %d lb %f oz", pounds, remainingOunces);

    }
}
