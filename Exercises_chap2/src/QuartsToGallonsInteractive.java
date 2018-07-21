import java.util.Scanner;
public class QuartsToGallonsInteractive
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);
        int QUARTS = 4;
        System.out.print("Enter the number of quarts required for the job >> ");
        int quartsForJob = inputDevice.nextInt();
        int gallons = quartsForJob/QUARTS;
        int leftQuarts = quartsForJob%QUARTS;
        System.out.println("A job that needs " + quartsForJob + " quarts requires " + gallons + " gallons plus " + leftQuarts + " quarts");
    }
}
