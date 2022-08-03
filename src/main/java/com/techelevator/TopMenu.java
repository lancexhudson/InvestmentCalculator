package com.techelevator;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class TopMenu extends Computation {

    static Scanner keyboardScanner = new Scanner(System.in);

    public static int investmentLength;
    public static BigDecimal userContribution;

public static void investmentPrompts() {

    int investmentLength = promptForInt(keyboardScanner, "How many years do you plan on investing? ");
    System.out.println("");
    BigDecimal userContribution = promptForBigDecimal(keyboardScanner, "How much do you plan on investing every year? ");
    System.out.println("");
}

public static void cashPrompt() {

    BigDecimal userContribution = promptForBigDecimal(keyboardScanner, "How much cash are you setting aside every year? ");
    System.out.println("");
    int investmentLength = promptForInt(keyboardScanner, "How long do you think ? ");
    System.out.println("");
}

    public static void introduction() {
        System.out.println("--------------------------------------------------");
        System.out.println(" Welcome to The Savings & Investment Calculator ");
        System.out.println("--------------------------------------------------");
        System.out.println("(1) Calculate your Savings Rate");
        System.out.println("(2) Calculate your Financial Future");
        System.out.println("(3) Plan for your Retirement");
        System.out.println("");
    }

    public static void disclaimer() {
        System.out.println("-----------------------------------------------");
        System.out.println(" DISCLAIMER: This is NOT investment advice");
        System.out.println("  Past performance != Future Performance");
        System.out.println(" Save what you can & Do your own research");
        System.out.println("------------------------------------------------");
        System.out.println("");
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
        System.out.println("(8) Cash");
        System.out.println("(9) Return to Main Menu");
        System.out.println("");

    }

    private static int promptForInt(Scanner keyboardScanner, String prompt) {
        boolean goodInput = false;
        int userChoice = 1;
        do {
            try {
                System.out.print(prompt);
                userChoice = Integer.parseInt(keyboardScanner.nextLine());
                goodInput = true;
            } catch (NumberFormatException e) {}  //need the empty block after catch
        } while (!goodInput) ;

        return userChoice;
    }

    private static BigDecimal promptForBigDecimal (Scanner keyboardScanner, String prompt) {
        boolean goodInput = false;
        BigDecimal userChoice = new BigDecimal(1);
        do {
            try {
                System.out.print(prompt);
                userChoice = new BigDecimal(keyboardScanner.nextLine());
                goodInput = true;
            } catch (NumberFormatException e) {}
        } while (!goodInput);

        return  userChoice;
    }

    // THIS BLOCK IS USED FOR REFERENCE IN COMPUTATION CLASS >> PreTax Savings >> Taxable Income
    public static void userContribution(BigDecimal taxableIncome) {
    }



}





