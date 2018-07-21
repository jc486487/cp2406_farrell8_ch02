import java.util.Scanner;
public class ChiliToGo
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);
        int ADULT = 7;
        int CHILD = 4;

        System.out.print("Enter the number of adult meals ordered >> ");
        int adult_meals = inputDevice.nextInt();

        System.out.print("Enter the number of child meals ordered >> ");
        int child_meals = inputDevice.nextInt();

        int money_adults = ADULT*adult_meals;

        int money_child = CHILD*child_meals;

        int total_cost = money_adults + money_child;

        System.out.println("Money collected for adult's meal = $" + money_adults + ". \nMoney collected for children's meal = $" +
                money_child + ".\nTotal collection = $" + total_cost);
    }
}
