import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        double itemPrice = 0;
       final double FREE_SHIP = 100;
       final double SHIP_RATE = .02;
       double shipCost = 0;
       double totalCost = 0;
       String trash = "";

        System.out.print("enter the item price: ");
        if(console.hasNextInt())
        {
            itemPrice = console.nextDouble();
            console.nextLine();

            if (itemPrice >= FREE_SHIP)
            {
                shipCost = 0;
                totalCost = itemPrice;
            }
            else
            {
                shipCost = SHIP_RATE * itemPrice;
                totalCost = itemPrice + shipCost;
            }
            System.out.println("the ship cost is " + shipCost);
            System.out.println("the total cost is " + totalCost);
        }
        else   // dont have an int need clear the trash
        {
            trash = console.nextLine();
            System.out.println("you entered " + trash + "not a numebr!");
            System.out.println("run the program again with correct input");
        }
    }
}