package com.techelevator;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options {

    Scanner keyboardScanner = new Scanner(System.in);

    public static void main(String args[]) {
        // this class is used for testing methods before implementing


        Scanner keyboardScanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
        BigDecimal userContribution = null;
        BigDecimal remainder = new BigDecimal(0);

        BigDecimal taxTier1 = new BigDecimal(".10");
        BigDecimal taxTier2 = new BigDecimal(".12");
        BigDecimal taxTier3 = new BigDecimal(".22");
        BigDecimal taxTier4 = new BigDecimal(".24");

        BigDecimal incomeTier1 = new BigDecimal("0.00");
        BigDecimal incomeTier2 = new BigDecimal("10276.00");
        BigDecimal incomeTier3 = new BigDecimal("41776.00");


        if (userContribution.compareTo(taxTier4) == -1) {
            remainder.compareTo(userContribution.subtract(taxTier3));
        } if (userContribution.compareTo(taxTier3) == -1) {
            
        }










//        System.out.println("hello friend");
//        Scanner scanner = new Scanner(System.in);
//        // initial principal amount before interest
//        BigDecimal principal = scanner.nextBigDecimal();
//        BigDecimal rate = BigDecimal.valueOf(0.05); // interest rate
//
//        // display headers
//        System.out.printf("%s%20s%n", "Year", "Amount on deposit");
//
//        // calculate amount on deposit for each of ten years
//        for (int year = 1; year <= 10; year++) {
//            // calculate new amount for specified year
//            BigDecimal amount =
//                    principal.multiply(rate.add(BigDecimal.ONE).pow(year));
//
//            // display the year and the amount
//            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
//        }
    }


}


