package com.techelevator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class Retirement extends Main {

    public static void retirementClass() {

        Scanner keyboardScanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        Computation computation = new Computation();

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

        int investChoice = promptForInt(keyboardScanner,"What is your selection? " );
        System.out.println("");

        int userAge = promptForInt(keyboardScanner,"What is your age? " );
        System.out.println("");

        BigDecimal userContribution = promptForBigDecimal(keyboardScanner,"How much do you plan on investing every year?  " );
        System.out.println("");

        if (investChoice == 1) {

            BigDecimal interest = new BigDecimal("0.0001");
            String result = computation.calculateForRetirement(userContribution, interest, userAge);
            System.out.print(result);

            int selection = promptForInt(keyboardScanner,"Press (1) to learn more about Savings Accounts:\n" +
                    "Press (2) to return to the Main Menu: " );
            System.out.println("");

            if (selection == 1) {
                Glossary.savingsGlossary();
            } else if (selection == 2) {
                TopMenu.introduction();
            }

        } else if (investChoice == 2) {

            BigDecimal interest = new BigDecimal("0.01");
            String result = computation.calculateForRetirement(userContribution, interest, userAge);
            System.out.print(result);

            int selection = promptForInt(keyboardScanner,"Press (1) to learn more about High-Yield Savings Accounts:\n" +
                    "Press (2) to return to the Main Menu: " );
            System.out.println("");

            if (selection == 1) {
                Glossary.highYieldGlossary();
            } else if (selection == 2) {
                TopMenu.introduction();
            }

        } if (investChoice == 3) {

            BigDecimal interest = new BigDecimal("0.11");
            String result = computation.calculateForRetirement(userContribution, interest, userAge);
            System.out.print(result);

            int selection = promptForInt(keyboardScanner,"Press (1) to learn more about 401Ks:\n" +
                    "Press (2) to return to the Main Menu: " );
            System.out.println("");

            if (selection == 1) {
                Glossary.fourZeroOneKGlossary();
            } else if (selection == 2) {
                TopMenu.introduction();
            }
        }

        if (investChoice == 4) {

            BigDecimal interest = new BigDecimal("0.105");
            String result = computation.calculateForRetirement(userContribution, interest, userAge);
            System.out.print(result);

            int selection = promptForInt(keyboardScanner,"Press (1) to learn more about S&P 500 Index Funds:\n" +
                    "Press (2) to return to the Main Menu: " );
            System.out.println("");

            if (selection == 1) {
                Glossary.standardAndPoorsGlossary();
            } else if (selection == 2) {
                TopMenu.introduction();
            }
        }

        if (investChoice == 5) {

            BigDecimal interest = new BigDecimal("0.0313");
            String result = computation.calculateForRetirement(userContribution, interest, userAge);
            System.out.print(result);

            int selection = promptForInt(keyboardScanner,"Press (1) to learn more about 10 Year U.S. Treasuries:\n" +
                    "Press (2) to return to the Main Menu: " );
            System.out.println("");

            if (selection == 1) {
                Glossary.usTreasuryGlossary();
            } else if (selection == 2) {
                TopMenu.introduction();
            }
        }

        if (investChoice == 6) {

            BigDecimal interest = new BigDecimal("0.106");
            String result = computation.calculateForRetirement(userContribution, interest, userAge);
            System.out.print(result);

            int selection = promptForInt(keyboardScanner,"Press (1) to learn more about Gold:\n" +
                    "Press (2) to return to the Main Menu: " );
            System.out.println("");

            if (selection == 1) {
                Glossary.goldGlossary();
            } else if (selection == 2) {
                TopMenu.introduction();
            }
        }

        if (investChoice == 7) {
            int retirementAge = 65;
            BigDecimal totalUserStash = BigDecimal.ZERO;
            BigDecimal totalInterest = BigDecimal.ZERO;
            BigDecimal bitcoinReturn = new BigDecimal("2.30");
            int yearTilRetirement = (retirementAge - userAge);
            BigDecimal btcDivisor = new BigDecimal(".60");
            BigDecimal btcDecrement = bitcoinReturn.multiply(btcDivisor);

            for (int year = 1; year <= yearTilRetirement; year++) {

                totalUserStash = userContribution.add(totalUserStash);
                BigDecimal interestForThisYear = totalInterest.add(totalUserStash).multiply(bitcoinReturn);
                totalInterest = interestForThisYear.add(totalInterest);

                System.out.println(totalUserStash + " " + "$" + totalInterest.multiply(btcDivisor).setScale(2,
                        RoundingMode.CEILING) + " " + "$" + totalUserStash.add(totalInterest.multiply(btcDivisor)).setScale(2, RoundingMode.CEILING));
            }
            System.out.println("Your Total Contribution: " + "$" + decimalFormat.format(totalUserStash));
            System.out.println("Total Compound Growth: " + "$" + decimalFormat.format(totalInterest.multiply(btcDivisor)));
            System.out.println("Contribution + Compound Growth: " + "$" + decimalFormat.format(totalUserStash.add(totalInterest).multiply(btcDivisor)));
            System.out.println("");
            int selection = promptForInt(keyboardScanner,"Press (1) to learn more about Bitcoin:\n" +
                    "Press (2) to return to the Main Menu: " );
            System.out.println("");

            if (selection == 1) {
                Glossary.btcGlossary();
            } else if (selection == 2) {
                TopMenu.introduction();
            }

        }
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
}


