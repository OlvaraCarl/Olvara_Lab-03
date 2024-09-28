import java.util.Scanner;

public class Clock {

    // Procedure to convert the seconds to minutes
    public double SecondsToMinutes(double seconds) {
        // There are 60 seconds in a minute
        return seconds / 60;
    }

    // Procedure to convert the seconds to hours
    public double SecondsToHours(double seconds) {
        // There are 3600 seconds in an hour (60 * 60)
        return seconds / 3600;
    }

    // Procedure to convert the minutes to seconds
    public double MinutesToSeconds(double minutes) {
        // There are 60 seconds in a minute
        return minutes * 60;
    }

    // Procedure to convert the minutes to hours
    public double MinutesToHours(double minutes) {
        // There are 60 minutes in an hour
        return minutes / 60;
    }

    // Procedure to convert the hours to seconds
    public double HoursToSeconds(double hours) {
        // There are 3600 seconds in an hour (60 * 60)
        return hours * 3600;
    }

    // Procedure to convert the hours to minutes
    public double HoursToMinutes(double hours) {
        // There are 60 minutes in an hour
        return hours * 60;
    }

    // Main program for interaction with the user
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Clock clock = new Clock();
        char continueConverting;
        
        System.out.println("zun\nLaboratory Exercise");

        do {
            // Display or print
            System.out.println("[1] Seconds to Minutes");
            System.out.println("[2] Seconds to Hours");
            System.out.println("[3] Minutes to Seconds");
            System.out.println("[4] Minutes to Hours");
            System.out.println("[5] Hours to Seconds");
            System.out.println("[6] Hours to Minutes");

            // Ask the user to choose a conversion they wish to execute
            System.out.print("Choose the Conversion: ");
            int choice = input.nextInt();

            // Variable to store the value entered by the user
            double value, result = 0;

            // Ask the user for the value to convert the time
            System.out.print("Enter the Value: ");
            value = input.nextDouble();

            // Execute the conversion based on the user's choice
            switch (choice) {
                case 1:
                    result = clock.SecondsToMinutes(value);
                    System.out.println("Seconds to Minutes: " + result);
                    break;
                case 2:
                    result = clock.SecondsToHours(value);
                    System.out.println("Seconds to Hours: " + result);
                    break;
                case 3:
                    result = clock.MinutesToSeconds(value);
                    System.out.println("Minutes to Seconds: " + result);
                    break;
                case 4:
                    result = clock.MinutesToHours(value);
                    System.out.println("Minutes to Hours: " + result);
                    break;
                case 5:
                    result = clock.HoursToSeconds(value);
                    System.out.println("Hours to Seconds: " + result);
                    break;
                case 6:
                    result = clock.HoursToMinutes(value);
                    System.out.println("Hours to Minutes: " + result);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            // Ask if the user wants to execute another conversion
            System.out.print("Do you want to convert time? (Y/N): ");
            continueConverting = input.next().charAt(0);

            System.out.println("------------------------------------------");

        } while (continueConverting == 'Y' || continueConverting == 'y');
        
        System.out.println("Thank you for using the program!");
    }
}

