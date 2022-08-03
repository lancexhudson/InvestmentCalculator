package com.techelevator;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingsRate {

    public static void prompt() {
        Scanner keyboardScanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        System.out.println("-----------------------------------------------");
        System.out.println(" DISCLAIMER: This is NOT investment advice");
        System.out.println("  Past performance != Future Performance");
        System.out.println(" Save what you can & Do your own research");
        System.out.println("------------------------------------------------");
        System.out.println("");
        System.out.print("(1) to Confirm & Continue: ");
        String subInput = keyboardScanner.nextLine();
        System.out.println("");

        System.out.println("---------------------------------------------");
        System.out.println("  Calculate your Savings Rate: ");
        System.out.println("---------------------------------------------");
        System.out.println("");
        System.out.print("What is your annual Salary? ");
        BigDecimal annualSalary = new BigDecimal(keyboardScanner.nextLine());
        System.out.println("");
        System.out.print("What percentage of your income would you like to save? ");
        BigDecimal percentBeingSaved = new BigDecimal(keyboardScanner.nextLine());
        System.out.println("");

        System.out.println("---------------------------------------------");
        System.out.println("  Determine the frequency of savings contribution ");
        System.out.println("---------------------------------------------");
        System.out.println("(1) Weekly:");
        System.out.println("(2) Bi-Weekly");
        System.out.println("(3) Monthly");
        System.out.println("(4) Annually");
        System.out.println("(5) All of the Above");
        System.out.println("");
        System.out.print("Would you like your savings rate displayed? ");

        int paydayContribution = Integer.parseInt(keyboardScanner.nextLine());
        System.out.println("");

        if (paydayContribution == 1) {

            BigDecimal weeklySavings = new BigDecimal(".00192307692");
            BigDecimal biWeeklySavings = new BigDecimal(".003846154");
            BigDecimal annualSavings = new BigDecimal("0.10");
            MathContext m = new MathContext(5);
            BigDecimal OnePercentBSaved = new BigDecimal(".1");
            BigDecimal weeklyRateAmount = new BigDecimal(decimalFormat.format(percentBeingSaved.multiply(annualSalary.multiply(weeklySavings).multiply(OnePercentBSaved))));

            System.out.println("With an income of " + "$" + decimalFormat.format(annualSalary) + " per year, ");
            System.out.println("Your weekly savings rate of " + percentBeingSaved + "%" + " " + "is equal to " + "$" + weeklyRateAmount);

        } else if (paydayContribution == 2) {
            BigDecimal weeklySavings = new BigDecimal(".00192307692");
            BigDecimal biWeeklySavings = new BigDecimal(".003846154");
            BigDecimal annualSavings = new BigDecimal("0.10");
            MathContext m = new MathContext(5);
            BigDecimal OnePercentBSaved = new BigDecimal(".1");
            BigDecimal biWeeklyRateAmount = new BigDecimal( decimalFormat.format(percentBeingSaved.multiply(annualSalary.multiply(biWeeklySavings).multiply(OnePercentBSaved))));

            System.out.println("With an income of " + "$" + decimalFormat.format(annualSalary) + " per year, ");
            System.out.println("Your bi-weekly savings rate of " + percentBeingSaved + "%" + " " + "is equal to " + "$" + biWeeklyRateAmount);

        } else if (paydayContribution == 3) {
            BigDecimal weeklySavings = new BigDecimal(".00192307692");
            BigDecimal biWeeklySavings = new BigDecimal(".003846154");
            BigDecimal annualSavings = new BigDecimal("0.10");
            MathContext m = new MathContext(5);
            BigDecimal OnePercentBSaved = new BigDecimal(".1");
            BigDecimal moSavingsMultiply = new BigDecimal("4");
            BigDecimal monthlyRateAmount = new BigDecimal(decimalFormat.format(percentBeingSaved.multiply(annualSalary.multiply(weeklySavings).multiply(OnePercentBSaved)).multiply(moSavingsMultiply)));

            System.out.println("With an income of " + "$" + decimalFormat.format(annualSalary) + " per year, ");
            System.out.println("Your monthly savings rate of " + percentBeingSaved + "%" + " " + "is equal to " + "$" + monthlyRateAmount);

        } else if (paydayContribution == 4) {
            BigDecimal weeklySavings = new BigDecimal(".00192307692");
            BigDecimal biWeeklySavings = new BigDecimal(".003846154");
            BigDecimal annualSavings = new BigDecimal("0.10");
            MathContext m = new MathContext(5);
            BigDecimal OnePercentBSaved = new BigDecimal(".1");
            BigDecimal annualRateAmount = new BigDecimal(0);

            System.out.println("With an income of " + "$" + decimalFormat.format(annualSalary) + " per year, ");
            System.out.println("Your annual savings rate of " + percentBeingSaved + "%" + " " + "is equal to " + "$" +
                    decimalFormat.format(percentBeingSaved.multiply(annualSalary.multiply(annualSavings).multiply(OnePercentBSaved))));

        } else if (paydayContribution == 5) {
            BigDecimal weeklySavings = new BigDecimal(".00192307692");
            BigDecimal biWeeklySavings = new BigDecimal(".003846154");
            BigDecimal annualSavings = new BigDecimal("0.10");
            MathContext m = new MathContext(5);
            BigDecimal OnePercentBSaved = new BigDecimal(".1");
            BigDecimal moSavingsMultiply = new BigDecimal("4");
            System.out.println("With an income of " + "$" + decimalFormat.format(annualSalary)  + " per year, ");
            System.out.println("Your weekly savings rate of " + percentBeingSaved + "%" + " " + "is equal to " + "$" +
                    decimalFormat.format(percentBeingSaved.multiply(annualSalary.multiply(weeklySavings).multiply(OnePercentBSaved))));
            System.out.println("Your bi-weekly savings rate of " + percentBeingSaved + "%" + " " + "is equal to " + "$" +
                    decimalFormat.format(percentBeingSaved.multiply(annualSalary.multiply(biWeeklySavings).multiply(OnePercentBSaved))));
            System.out.println("Your monthly savings rate of " + percentBeingSaved + "%" + " " + "is equal to " + "$" +
                    decimalFormat.format(percentBeingSaved.multiply(annualSalary.multiply(weeklySavings).multiply(OnePercentBSaved)).multiply(moSavingsMultiply)));
            System.out.println("Your annual savings rate of " + percentBeingSaved + "%" + " " + "is equal to " + "$" +
                    decimalFormat.format(percentBeingSaved.multiply(annualSalary.multiply(annualSavings).multiply(OnePercentBSaved))));

        }
    }
}






//
//The three lines of code below are helpful when figuring out what 10% savings rate is
//               System.out.println("------ this stuff below is good ------");
//                       System.out.println("Your weekly savings rate of 10% =" + " $" + annualSalary.multiply(weeklySavings).round(m).setScale(0, RoundingMode.CEILING) + ". ");
//                       System.out.println("Your bi-weekly savings rate of 10% =" + " $" + annualSalary.multiply(biWeeklySavings).round(m).setScale(0, RoundingMode.CEILING) + ". ");
//                       System.out.println("Your annual savings rate of 10% =" + " $" + annualSalary.multiply(annualSavings).round(m).setScale(0, RoundingMode.CEILING) + ". ");