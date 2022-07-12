package com.techelevator;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options {

    Scanner keyboardScanner = new Scanner(System.in);

    public static void main(String args[]) {// w ww  .  ja  va 2s.  com
        System.out.println("hello friend");
        Scanner scanner = new Scanner(System.in);
        // initial principal amount before interest
        BigDecimal principal = scanner.nextBigDecimal();
        BigDecimal rate = BigDecimal.valueOf(0.05); // interest rate

        // display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        // calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10; year++) {
            // calculate new amount for specified year
            BigDecimal amount =
                    principal.multiply(rate.add(BigDecimal.ONE).pow(year));

            // display the year and the amount
            System.out.printf("%4d%20s%n", year, NumberFormat.getCurrencyInstance().format(amount));
        }
    }




}

