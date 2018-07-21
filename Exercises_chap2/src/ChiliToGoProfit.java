import java.util.Scanner;
public class ChiliToGoProfit
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);
        int ADULT = 7;
        int CHILD = 4;

        double PRODUCE_ADULT = 4.35;
        double PRODUCE_CHILD = 3.10;

        double profit_adult = ADULT - PRODUCE_ADULT;
        double profit_child = CHILD - PRODUCE_CHILD;

        System.out.print("Enter the number of adult meals ordered >> ");
        int adult_meals = inputDevice.nextInt();

        System.out.print("Enter the number of child meals ordered >> ");
        int child_meals = inputDevice.nextInt();

        double money_adults = profit_adult*adult_meals;
        money_adults = Math.round(money_adults * 100D)/100D;

        double money_child = profit_child*child_meals;
        money_child = Math.round(money_child * 100D)/100D;

        double total_cost = money_adults + money_child;
        total_cost = Math.round(total_cost * 100D)/100D;

        System.out.print("Profit collected for adult's meal = $" + money_adults + ". \nProfit collected for children's meal = $" +
                money_child + ".\nTotal Profit collection = $" + total_cost);
    }
}
