import java.util.Scanner;
public class Eggs
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter the number of eggs in the order >> ");
        int eggs = inputDevice.nextInt();
        double DOZEN_EGGS = 3.25;
        double PER_EGG = 0.45;
        int dozen = eggs/12;
        int loose_eggs = eggs%12;
        double price_for_dozen = dozen*DOZEN_EGGS;
        double price_for_eggs = PER_EGG*loose_eggs;
        double total_cost = price_for_dozen+price_for_eggs;
        System.out.print("You ordered " + eggs + " eggs.");
        System.out.print(" That's " + dozen + " dozen at $" + DOZEN_EGGS + " per dozen and " + loose_eggs + " loose eggs" +
                " at 45 cents each for a total of $" + total_cost + ".");
    }
}
