import java.util.Scanner;
public class InchesToFeetInteractive
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter the number of inches >> ");
        int inches = inputDevice.nextInt();
        int FOOT = 12;
        int feet = inches/FOOT;
        int remainingInches = inches%FOOT;
        System.out.println(inches + " inches is " + feet + " feet and " + remainingInches + " inches.");
    }
}
