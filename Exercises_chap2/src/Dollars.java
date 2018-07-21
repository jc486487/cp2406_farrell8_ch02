import java.util.Scanner;

public class Dollars
{
    public static void main(String[] args)
    {
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Enter the number of Dollars: ");
        double dollar = inputDevice.nextDouble();

        double cents2 = dollar * 100;
        int cents = (int) Math.round(cents2);

        int twenties = 0, tens = 0, fives = 0 , ones = 0;

        if (cents >= 20)
        {
            twenties = cents/20;
            cents = cents%20;
        }

        if (cents >= 10)
        {
            tens = cents/10;
            cents = cents%10;
        }

        if (cents >= 5)
        {
            fives = cents/5;
            cents = cents%5;
        }

        ones = cents;

        System.out.println("The currency denomination of the dollar = " + twenties + " - 20s, " + tens + " - 10s, " +
                fives + " - 5s,  " + ones + " - 1s");
    }
}
