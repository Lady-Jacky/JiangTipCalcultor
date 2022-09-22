import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to the Tip Calculator!");
        System.out.print("How much people are in your group?");
        int people = scan.nextInt();
        System.out.print("What is the tip percentage? (Choose from 0-100):");
        int tip = scan.nextInt();
        double priceTotal = 0;
        double prices = 0;
        System.out.println("Enter a cost in dollars and cents (Insert -1 to end adding prices):");
        priceTotal = scan.nextDouble();
        while (prices != 0) {
            System.out.println("Enter a cost in dollars and cents (Insert -1 to end adding prices):");
            prices = scan.nextDouble();
            priceTotal += prices;
            System.out.println(priceTotal);

        }

    }
    }

