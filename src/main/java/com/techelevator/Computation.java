package com.techelevator;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.Scanner;

import static com.techelevator.TopMenu.keyboardScanner;


public class Computation {


    private int investmentLength;
    private BigDecimal userContribution;
    public int yearsOfSaving;
    public int yearsUntilRetirement;
    private BigDecimal annualSalary;
    private BigDecimal percentBeingSaved;


    public String calculateInflationHalving(BigDecimal userContribution) {
        BigDecimal yearsUntilCashIsHalved = new BigDecimal("0");
        BigDecimal ruleOf72 = new BigDecimal("72");
        BigDecimal currentInflationRate = new BigDecimal("9.1");

        yearsUntilCashIsHalved = ruleOf72.divide(currentInflationRate);

        String newLine = System.getProperty("line.separator");
        return String.join(newLine,
                "Given the current inflation rate of 9.1%, your cash savings of " + userContribution,
                "will lose half of it's purchasing power in " + yearsUntilCashIsHalved,
                newLine);
    }


    public String calculateCompoundGrowth(int investmentLength, BigDecimal userContribution, BigDecimal interest) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        BigDecimal totalUserStash = BigDecimal.ZERO;
        BigDecimal totalInterest = BigDecimal.ZERO;

        for (int year = 1; year <= investmentLength; year++) {

            totalUserStash = userContribution.add(totalUserStash);
            BigDecimal interestForThisYear = totalInterest.add(totalUserStash).multiply(interest);
            totalInterest = interestForThisYear.add(totalInterest);
        }
        String newLine = System.getProperty("line.separator");
        return String.join(newLine,
                "Your total contribution: " + "$" + decimalFormat.format(totalUserStash),
                "Total interest earned: " + "$" + decimalFormat.format(totalInterest),
                "Contribution + Interest: " + "$" + decimalFormat.format(totalUserStash.add(totalInterest)),
                newLine);
    }

    public String calculateForRetirement(BigDecimal userContribution, BigDecimal interest, int userAge) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        BigDecimal totalUserStash = BigDecimal.ZERO;
        BigDecimal totalInterest = BigDecimal.ZERO;
        int retirementAge = 65;
        yearsUntilRetirement = (retirementAge - userAge);

        for (int year = 1; year <= yearsUntilRetirement; year++) {

            totalUserStash = userContribution.add(totalUserStash);
            BigDecimal interestForThisYear = totalInterest.add(totalUserStash).multiply(interest);
            totalInterest = interestForThisYear.add(totalInterest);
        }
        String newLine = System.getProperty("line.separator");
        return String.join(newLine,
                "Your total contribution: " + "$" + decimalFormat.format(totalUserStash),
                "Total interest earned: " + "$" + decimalFormat.format(totalInterest),
                "Contribution + Interest: " + "$" + decimalFormat.format(totalUserStash.add(totalInterest)),
                newLine);
    }

    //  public String calculateSavingsRate(BigDecimal annualSalary, BigDecimal percentBeingSaved) {
//        DecimalFormat decimalFormat = new DecimalFormat("#.##");
//        decimalFormat.setGroupingUsed(true);
//        decimalFormat.setGroupingSize(3);
//
//        BigDecimal weeklySavings = new BigDecimal(".00192307692");
//        BigDecimal biWeeklySavings = new BigDecimal(".003846154");
//        BigDecimal annualSavings = new BigDecimal("0.10");
//        MathContext m = new MathContext(5);
//        BigDecimal OnePercentBSaved = new BigDecimal(".1");
//        BigDecimal moSavingsMultiply = new BigDecimal("4");
//        System.out.println("With an income of " + "$" + decimalFormat.format(annualSalary) + " per year, ");
//        System.out.println("Your weekly savings rate of " + percentBeingSaved + "%" + " " + "is equal to " + "$" +
//                decimalFormat.format(percentBeingSaved.multiply(annualSalary.multiply(weeklySavings).multiply(OnePercentBSaved))));
//        System.out.println("Your bi-weekly savings rate of " + percentBeingSaved + "%" + " " + "is equal to " + "$" +
//                decimalFormat.format(percentBeingSaved.multiply(annualSalary.multiply(biWeeklySavings).multiply(OnePercentBSaved))));
//        System.out.println("Your monthly savings rate of " + percentBeingSaved + "%" + " " + "is equal to " + "$" +
//                decimalFormat.format(percentBeingSaved.multiply(annualSalary.multiply(weeklySavings).multiply(OnePercentBSaved)).multiply(moSavingsMultiply)));
//        System.out.println("Your annual savings rate of " + percentBeingSaved + "%" + " " + "is equal to " + "$" +
//                decimalFormat.format(percentBeingSaved.multiply(annualSalary.multiply(annualSavings).multiply(OnePercentBSaved))));
//
//    }
//}



    public static void preTaxSavingsCalc () {
        BigDecimal taxableIncome = BigDecimal.ZERO;
        BigDecimal incomeRemainder = BigDecimal.ZERO;

        BigDecimal taxTier1 = new BigDecimal(".10");
        BigDecimal taxTier2 = new BigDecimal(".12");
        BigDecimal taxTier3 = new BigDecimal(".22");
        BigDecimal taxTier4 = new BigDecimal(".24");
        BigDecimal taxTier5 = new BigDecimal(".32");
        BigDecimal taxTier6 = new BigDecimal(".35");
        BigDecimal taxTier7 = new BigDecimal(".37");

        BigDecimal incomeTier1 = new BigDecimal("0.00");
        BigDecimal incomeTier2 = new BigDecimal("10276.00");
        BigDecimal incomeTier3 = new BigDecimal("41776.00");
        BigDecimal incomeTier4 = new BigDecimal("89076.00");
        BigDecimal incomeTier5 = new BigDecimal("170051.00");
        BigDecimal incomeTier6 = new BigDecimal("215591.00");
        BigDecimal incomeTier7 = new BigDecimal("539901.00");

        final BigDecimal tier1cost = (incomeTier2.subtract(incomeTier1));
        final BigDecimal tier2cost = (incomeTier3.subtract(incomeTier2));
        final BigDecimal tier3cost = (incomeTier4.subtract(incomeTier3));
        final BigDecimal tier4cost = (incomeTier5.subtract(incomeTier4));
        final BigDecimal tier5cost = (incomeTier6.subtract(incomeTier5));
        final BigDecimal tier6cost = (incomeTier7.subtract(incomeTier6));

        BigDecimal tier1tax = new BigDecimal(taxableIncome.compareTo(incomeTier1));
        BigDecimal tier2tax = new BigDecimal(taxableIncome.compareTo(incomeTier3.subtract(incomeTier2)));




//        Scanner input = scanner;
//
//        double baseIncome = 0;
//        double taxTier = .10;
//        double incomeTier = input.nextDouble();
//        double taxTier2Test = .12;
//        double incomeTier2Test = 10276.00;
//
//        if (incomeTier > baseIncome) {
//            (incomeTier * taxTier)
//        } else
//                double n1, n2, n3;
//                n1 = readme.nextDouble();
//                n2 = readme.nextDouble();
//                n3 = n1 + n2;
//                System.out.println("Total = " + n3);
//            }
//        }

//        if (annualIncome.compareTo(incomeTier1) > 0) {
//            System.out.println(annualIncome.multiply(taxTier1));
//        }
    }





}
