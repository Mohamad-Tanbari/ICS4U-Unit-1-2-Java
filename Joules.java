/*
* E = mc² calculator.
*
* @author Mohamad T
* @version 1.0
* @since 2024-9-24
*/

import java.util.Scanner;

/**
 * The main Joules class.
 */
final class Joules {

    /**
     * Speed of light variable.
     */
    static final double SPEED_OF_LIGHT = 2.998 * (Math.pow(10, 8));

    /**
     * Prevent instantiation.
     */
    private Joules() { }

    /**
     * The main method to run the energy calculator.
     *
     * @param args command line inputs
     */
    public static void main(String[] args) {
        // Create scanner object to read input from the user
        final Scanner scanner = new Scanner(System.in);

        // Get input
        System.out.printf("Enter the mass of an object in kilograms: ");
        final String massAsString = scanner.nextLine();

        // Close scanner
        scanner.close();

        // Verify input
        try {
            final double mass = Double.parseDouble(massAsString);

            // Calculate
            final double energy = mass * (Math.pow(SPEED_OF_LIGHT, 2));

            // Output
            System.out.println(mass + " kg of mass would produce " + energy
                              + " J of energy.");
        } catch (NumberFormatException error) {
            System.out.println("You entered an invalid input! "
                              + error.getMessage());
        }

        // Done
        System.out.println("\nDone.");
    }
}
