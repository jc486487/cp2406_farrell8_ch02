public class QuartsToGallons
{
    public static void main(String[] args)
    {
        int QUARTS = 4;
        int quartsForJob = 18;
        int gallons = quartsForJob/QUARTS;
        int leftQuarts = quartsForJob%QUARTS;
        System.out.println("A job that needs " + quartsForJob + " quarts requires " + gallons + " gallons plus " + leftQuarts + " quarts");
    }
}
