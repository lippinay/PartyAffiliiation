import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String partyAfil = "";

        // Prompt user for party affiliation
        System.out.print("Enter your party affiliation [R, D, I]: ");
        partyAfil = in.nextLine();

        // Use equalsIgnoreCase to compare user input with R, D, or I
        if (partyAfil.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant!");
        }
        else if (partyAfil.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        }
        else if (partyAfil.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Man!");
        }
        else
        {
            // Default case for unknown input
            System.out.println("I don't know what party this is: " + partyAfil);
        }

        // Close the scanner resource
        in.close();
    }
}
