import java.util.Scanner;

public class MinutesConversion
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter the number of minutes >> ");
        int minutes = inputDevice.nextInt();

        int HOURS = 60;
        int DAYS = 1440;

        double total_hours = minutes / HOURS;
        double total_days = minutes / DAYS;

        System.out.println(minutes + " minutes equals " + total_hours + " hours and equals " + total_days + " days.");
    }
}
