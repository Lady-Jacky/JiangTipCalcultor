import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        //These below codes help determine the total price of the items to prepare for the tips
        System.out.println("Welcome to the Tip Calculator!");
        System.out.print("How much people are in your group?: ");
        int people = scan.nextInt();
        System.out.print("What is the tip percentage? (Choose from 0-100): ");
        int tip = scan.nextInt();
        double priceTotal = 0;
        double prices = 0;
        System.out.println("Enter a cost in dollars and cents (Insert -1 to end adding prices): ");
        priceTotal = scan.nextDouble();
        while (prices != -1) {
            System.out.println("Enter a cost in dollars and cents (Insert -1 to end adding prices): ");
            prices = scan.nextDouble();
            priceTotal += prices;
        }
        //adds a 1 to the total price because the -1 was also added before
        if (prices == -1){
            priceTotal += 1;
        }

        double tipper = tip/100.00;
        double totalTip = priceTotal * tipper;
        double total = priceTotal * (1+tipper);
        double costPer = priceTotal/people;
        double tipPer = totalTip/people;
        double totalCostPer = total/people;

        String priceDeciTotal = formatter.format(priceTotal);
        String totalDeciTip = formatter.format(totalTip);
        String totalRound = formatter.format(total);
        String costPerRound = formatter.format(costPer);
        String tipRound = formatter.format(tipPer);
        String totalRound2 = formatter.format(totalCostPer);

        System.out.println("----------------------------------------");
        System.out.println("Total Bill Before Tip: $" + priceDeciTotal);
        System.out.println("Tip Percentage: " + tip + "%");
        System.out.println("Total tip: $" + totalDeciTip);
        System.out.println("Total bill with tip: $" + totalRound);
        System.out.println("Per person cost before tip: " + costPerRound);
        System.out.println("Tip per person: " + tipRound);
        System.out.println("Total cost per person: " + totalRound2);
        }
    }

