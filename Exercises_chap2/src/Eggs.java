import java.util.Scanner;
public class Eggs
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Enter the number of eggs in the order >> ");
        int eggs = inputDevice.nextInt();
        double dozenEggs = 3.25;
        double perEgg = 0.45;
        int dozen = eggs/12;
        int loose_eggs = eggs%12;
        double price_for_dozen = dozen*dozenEggs;
        double price_for_eggs = perEgg*loose_eggs;
        double total_cost = price_for_dozen+price_for_eggs;
        System.out.print("You ordered " + eggs + " eggs.");
        System.out.print(" That's " + dozen + " dozen at $" + dozenEggs + " per dozen and " + loose_eggs + " loose eggs" +
                " at 45 cents each for a total of $" + total_cost + ".");
    }
}
