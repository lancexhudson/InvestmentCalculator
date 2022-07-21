package com.techelevator;

import java.math.BigDecimal;
import java.text.DecimalFormat;


public class Computation {

    private int investmentLength;
    private BigDecimal userContribution;
    public int yearsUntilRetirement;  // does this work?


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


}
