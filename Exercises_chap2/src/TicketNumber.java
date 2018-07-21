import javax.swing.JOptionPane;
public class TicketNumber
{
    public static void main(String[] args)
    {
        String ticket_number = JOptionPane.showInputDialog("Enter the six-digit ticket number: ");
        String last_number = ticket_number.substring(5, 6);
        String new_number = ticket_number.substring(0, 5);

        int number = Integer.parseInt(new_number);
        int last = Integer.parseInt(last_number);

        int remainder = number % 7;

        if (remainder == last)
        {
            JOptionPane.showMessageDialog(null, "True");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "False");
        }
    }
}
