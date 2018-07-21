public class InchesToFeet
{
    public static void main(String[] args)
    {
        int inches = 86;
        int FOOT = 12;
        int feet = inches/FOOT;
        int remainingInches = inches%FOOT;
        System.out.println(inches + " inches is " + feet + " feet and " + remainingInches + " inches.");
    }
}
