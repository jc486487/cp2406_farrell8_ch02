import java.util.Scanner;
public class NauticalMilesInteractive
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter the number of nautical miles >> ");
        double nauticalMile = inputDevice.nextDouble();
        double KILOMETERS = 1.852;
        double MILES = 1.150779;
        System.out.println("The nautical mile of " + nauticalMile + "NM in Kilometers = " +(nauticalMile*KILOMETERS) + "Km and in miles = " + (nauticalMile*MILES) + "M");
    }
}
