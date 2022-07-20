package com.techelevator;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class TopMenu extends Computation {

    static Scanner keyboardScanner = new Scanner(System.in);


    public static void introduction() {
        System.out.println("--------------------------------------------------");
        System.out.println(" Welcome to The Savings & Investment Calculator ");
        System.out.println("--------------------------------------------------");
        System.out.println("(1) Calculate your Savings Rate");
        System.out.println("(2) Calculate your Financial Future");
        System.out.println("(3) Plan for your Retirement");
        System.out.println("");
       // System.out.print("Please choose an option: ");

    }

    public static void disclaimer() {
        System.out.println("-----------------------------------------------");
        System.out.println(" DISCLAIMER: This is NOT investment advice");
        System.out.println("  Past performance != Future Performance");
        System.out.println(" Save what you can & Do your own research");
        System.out.println("------------------------------------------------");
        System.out.println("");
       // System.out.print("(1) to Confirm & Continue: ");
    }

    public static void savingsAndInvestments() {
        System.out.println("---------------------------------------------");
        System.out.println("   Savings & Investment Options: ");
        System.out.println("---------------------------------------------");
        System.out.println("(1) Savings Account");
        System.out.println("(2) Savings Account (High Yield)");
        System.out.println("(3) 401K + Employer Match");
        System.out.println("(4) S&P 500 Index Fund");
        System.out.println("(5) 10-Year U.S. Treasury");
        System.out.println("(6) Gold");
        System.out.println("(7) Bitcoin");
        System.out.println("(8) All of the Above");
        System.out.println("(9) Return to Main Menu");

        System.out.println("");
//        System.out.print("What is your selection? ");
    }




    public static void finFutureTopMenu() {

        //// this line will place the investment selection menu. starts code right here
        Scanner keyboardScanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        System.out.println("--------------------------------------------------");
        System.out.println(" Welcome to The Savings & Investment Calculator ");
        System.out.println("--------------------------------------------------");
        System.out.println("(1) Calculate your Savings Rate");
        System.out.println("(2) Calculate your Financial Future");
        System.out.println("(3) Plan for your Retirement");
        System.out.println("");

        System.out.print("Please choose an option: ");
        String input = keyboardScanner.nextLine();//string is always sufficient - convert to anything
        System.out.println("");

        if (Objects.equals(input, "3")) {
            Retirement.retirementClass();
        }
        if (Objects.equals(input, "1")) {
            SavingsRate.prompt();
        }

        if (Objects.equals(input, "2")) {
            System.out.println("-----------------------------------------------");
            System.out.println(" DISCLAIMER: This is NOT investment advice");
            System.out.println("  Past performance != Future Performance");
            System.out.println(" Save what you can & Do your own research");
            System.out.println("------------------------------------------------");
            System.out.println("");
            System.out.print("(1) to Confirm & Continue: ");
            String subInput = keyboardScanner.nextLine();
            System.out.println("");


            if (Objects.equals(subInput, "1")) {

                System.out.println("---------------------------------------------");
                System.out.println("   Savings & Investment Options: ");
                System.out.println("---------------------------------------------");
                System.out.println("(1) Savings Account");
                System.out.println("(2) Savings Account (High Yield)");
                System.out.println("(3) 401K + Employer Match");
                System.out.println("(4) S&P 500 Index Fund");
                System.out.println("(5) 10-Year U.S. Treasury");
                System.out.println("(6) Gold");
                System.out.println("(7) Bitcoin");
                System.out.println("(8) All of the Above");
                System.out.println("(9) Return to Main Menu");

                System.out.println("");
                System.out.print("What is your selection? ");
                int investChoice = Integer.parseInt(keyboardScanner.nextLine());
                System.out.println("");

                System.out.print("How many years do you plan on investing? ");
                int investmentLength = Integer.parseInt(keyboardScanner.nextLine());
                System.out.println("");

                System.out.print("How much do you plan on investing every year? ");
                BigDecimal userContribution = new BigDecimal(keyboardScanner.nextLine());
                System.out.println("");
                System.out.println("-----------------------------------------");
                System.out.println("");
            }
        }
    }
        public static void retirementTop() {

            Scanner keyboardScanner = new Scanner(System.in);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setGroupingUsed(true);
            decimalFormat.setGroupingSize(3);


            System.out.println("-----------------------------------------------");       /// Does this make sense being here
            System.out.println(" DISCLAIMER: This is NOT investment advice");
            System.out.println("  Past performance != Future Performance");
            System.out.println(" Save what you can & Do your own research");
            System.out.println("------------------------------------------------");
            System.out.println("");
            System.out.print("(1) to Confirm & Continue: ");
            String subInput = keyboardScanner.nextLine();
            System.out.println("");

            System.out.println("---------------------------------------------");
            System.out.println("  Retirement Savings & Investment Options: ");
            System.out.println("---------------------------------------------");
            System.out.println("(1) Savings Account");
            System.out.println("(2) Savings Account (High Yield)");
            System.out.println("(3) 401K + Employer Match");
            System.out.println("(4) S&P 500 Index Fund");
            System.out.println("(5) 10-Year U.S. Treasury");
            System.out.println("(6) Gold");
            System.out.println("(7) Bitcoin");
            System.out.println("(8) All of the Above");
            System.out.println("(9) Return to Main Menu");
            System.out.println("");
            System.out.print("What is your selection? ");
            int investChoice = Integer.parseInt(keyboardScanner.nextLine());
            System.out.println("");

            System.out.print("What is your age? ");
            int userAge = Integer.parseInt(keyboardScanner.nextLine());
            System.out.println("");

            System.out.print("How much do you plan on investing every year? ");
            BigDecimal userContribution = new BigDecimal(keyboardScanner.nextLine());
            System.out.println("");
        }


}

