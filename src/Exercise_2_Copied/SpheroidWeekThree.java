import java.util.Scanner;
import java.lang.Math;

public class SpheroidWeekThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Equatorial and Polar radii (in km): ");
        double equatorial = input.nextDouble();
        double polarRadii = input.nextDouble();

        if (equatorial <= 0) {
            System.out.println("Error: equatorial radius must be larger than 0");
        }
        else if (polarRadii <= 0) {
            System.out.println("Error: polar radius must be larger than 0");
        }
        else if (polarRadii > equatorial) {
            System.out.println("Error: equatorial radius must be larger than polar radius");
        }
        else {
            double eccentricity = Math.sqrt(1 - (Math.pow(polarRadii, 2) / (Math.pow(equatorial, 2))));
            double volume = (4 * Math.PI * Math.pow(equatorial, 2) * polarRadii) / 3;

            System.out.printf("Eccentricity = %.3f\n", eccentricity);
            System.out.printf("Volume = %g cubic km\n", volume);
        }
    }
}
