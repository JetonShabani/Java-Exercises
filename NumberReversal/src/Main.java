//For a given input number, return the number in reverse.
// So, an input of 3956 should return 6593.



import java.util.*;
public class Main
{
    public static void main(String[] args) {
        int d = 0;
        int Result = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("enter a number: ");

        d = Integer.parseInt(in.nextLine());

        while(d > 0)
        {
            Result = (Result * 10) + d % 10;
            d = d / 10;
        }

        System.out.println("\nThe Reversed Number Is: " + Result);

    }
}