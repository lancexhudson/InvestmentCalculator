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
            //System.out.print("What is your selection? ");
           // int investChoice = Integer.parseInt(keyboardScanner.nextLine());
        int investChoice = promptForInt(keyboardScanner,"What is your selection? " );
        System.out.println("");

        //System.out.print("What is your age? ");
        //int userAge = Integer.parseInt(keyboardScanner.nextLine());
        int userAge = promptForInt(keyboardScanner,"What is your age? " );
        System.out.println("");

        //System.out.print("How much do you plan on investing every year? ");
        //BigDecimal userContribution = new BigDecimal(keyboardScanner.nextLine());
        BigDecimal userContribution = promptForBigDecimal(keyboardScanner,"How much do you plan on investing every year?  " );
        System.out.println("");

        if (investChoice == 1) {
            int retirementAge = 65;
            BigDecimal totalUserStash = BigDecimal.ZERO;
            BigDecimal totalInterest = BigDecimal.ZERO;
            BigDecimal interest = new BigDecimal("0.0001");
            int yearTilRetirement = (retirementAge - userAge);

            for (int year = 1; year <= yearTilRetirement; year++) {

                totalUserStash = userContribution.add(totalUserStash);
                BigDecimal interestForThisYear = totalInterest.add(totalUserStash).multiply(interest);
                totalInterest = interestForThisYear.add(totalInterest);

                // System.out.println(totalUserStash + " " + " " + totalInterest + " " + interestForThisYear);
                //the line about shows amortization values because it is placed inside of the for loop
            }
            System.out.println("Your Total Contribution: " + "$" + decimalFormat.format(totalUserStash));
            System.out.println("Total Interest Earned: " + "$" + decimalFormat.format(totalInterest));
            System.out.println("Contribution + Interest: " + "$" + decimalFormat.format(totalUserStash.add(totalInterest)));
            System.out.println("");
            int selection = promptForInt(keyboardScanner,"Press (1) to learn more about Savings Accounts:\n" +
                    "Press (2) to return to the Main Menu: " );
            System.out.println("");

            if (selection == 1) {
                Glossary.savingsGlossary();
            } else if (selection == 2) {
                TopMenu.introduction();
            }

        } else if (investChoice == 2) {
            int retirementAge = 65;
            BigDecimal totalUserStash = BigDecimal.ZERO;
            BigDecimal totalInterest = BigDecimal.ZERO;
            BigDecimal highYieldInterest = new BigDecimal(".01");
            int yearTilRetirement = (retirementAge - userAge);

            for (int year = 1; year <= yearTilRetirement; year++) {

                totalUserStash = userContribution.add(totalUserStash);
                BigDecimal interestForThisYear = totalInterest.add(totalUserStash).multiply(highYieldInterest);
                totalInterest = interestForThisYear.add(totalInterest);

               // System.out.println(totalUserStash + " " + "$" + totalInterest.setScale(2,
                 //       RoundingMode.CEILING) + " " + "$" + totalUserStash.add(totalInterest).setScale(2, RoundingMode.CEILING));
            }
            System.out.println("Your Total Contribution: " + "$" + decimalFormat.format(totalUserStash));
            System.out.println("Total Interest Earned: " + "$" + decimalFormat.format(totalInterest));
            System.out.println("Contribution + Interest: " + "$" + decimalFormat.format(totalUserStash.add(totalInterest)));
            System.out.println("");
            int selection = promptForInt(keyboardScanner,"Press (1) to learn more about High-Yield Savings Accounts:\n" +
                    "Press (2) to return to the Main Menu: " );
            System.out.println("");

            if (selection == 1) {
                Glossary.highYieldGlossary();
            } else if (selection == 2) {
                TopMenu.introduction();
            }

        } if (investChoice == 3) {
            int retirementAge = 65;
            BigDecimal totalUserStash = BigDecimal.ZERO;
            BigDecimal totalInterest = BigDecimal.ZERO;
            BigDecimal fourZeroOneKWithMatch = new BigDecimal(".11");
            int yearTilRetirement = (retirementAge - userAge);

            for (int year = 1; year <= yearTilRetirement; year++) {

                totalUserStash = userContribution.add(totalUserStash);
                BigDecimal interestForThisYear = totalInterest.add(totalUserStash).multiply(fourZeroOneKWithMatch);
                totalInterest = interestForThisYear.add(totalInterest);

               // System.out.println(totalUserStash + " " + "$" + totalInterest.setScale(2,
                 //       RoundingMode.CEILING) + " " + "$" + totalUserStash.add(totalInterest).setScale(2, RoundingMode.CEILING));
            }
            System.out.println("Your Total Contribution: " + "$" + decimalFormat.format(totalUserStash));
            System.out.println("Total Compound Growth: " + "$" + decimalFormat.format(totalInterest));
            System.out.println("Contribution + Compound Growth: " + "$" + decimalFormat.format(totalUserStash.add(totalInterest)));
            System.out.println("");
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
            int retirementAge = 65;
            BigDecimal totalUserStash = BigDecimal.ZERO;
            BigDecimal totalInterest = BigDecimal.ZERO;
            BigDecimal standardAndPoors500 = new BigDecimal(".105");
            int yearTilRetirement = (retirementAge - userAge);

            for (int year = 1; year <= yearTilRetirement; year++) {

                totalUserStash = userContribution.add(totalUserStash);
                BigDecimal interestForThisYear = totalInterest.add(totalUserStash).multiply(standardAndPoors500);
                totalInterest = interestForThisYear.add(totalInterest);

             //   System.out.println(totalUserStash + " " + "$" + totalInterest.setScale(2,
               //         RoundingMode.CEILING) + " " + "$" + totalUserStash.add(totalInterest).setScale(2, RoundingMode.CEILING));
            }
            System.out.println("Your Total Contribution: " + "$" + decimalFormat.format(totalUserStash));
            System.out.println("Total Compound Growth: " + "$" + decimalFormat.format(totalInterest));
            System.out.println("Contribution + Compound Growth: " + "$" + decimalFormat.format(totalUserStash.add(totalInterest)));
            System.out.println("");
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

            int retirementAge = 65;
            BigDecimal totalUserStash = BigDecimal.ZERO;
            BigDecimal totalInterest = BigDecimal.ZERO;
            BigDecimal tenYearUsTreasury = new BigDecimal(".0313");
            int yearTilRetirement = (retirementAge - userAge);

            for (int year = 1; year <= yearTilRetirement; year++) {

                totalUserStash = userContribution.add(totalUserStash);
                BigDecimal interestForThisYear = totalInterest.add(totalUserStash).multiply(tenYearUsTreasury);
                totalInterest = interestForThisYear.add(totalInterest);

                //   System.out.println(totalUserStash + " " + "$" + totalInterest.setScale(2,
                //         RoundingMode.CEILING) + " " + "$" + totalUserStash.add(totalInterest).setScale(2, RoundingMode.CEILING));

            }
            System.out.println("Your Total Contribution: " + "$" + decimalFormat.format(totalUserStash));
            System.out.println("Total Interest Earned: " + "$" + decimalFormat.format(totalInterest));
            System.out.println("Contribution + Interest: " + "$" + decimalFormat.format(totalUserStash.add(totalInterest)));
            System.out.println("");
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
            int retirementAge = 65;
            BigDecimal totalUserStash = BigDecimal.ZERO;
            BigDecimal totalInterest = BigDecimal.ZERO;
            BigDecimal goldRateSinceNixon = new BigDecimal(".106");
            int yearTilRetirement = (retirementAge - userAge);

            for (int year = 1; year <= yearTilRetirement; year++) {

                totalUserStash = userContribution.add(totalUserStash);
                BigDecimal interestForThisYear = totalInterest.add(totalUserStash).multiply(goldRateSinceNixon);
                totalInterest = interestForThisYear.add(totalInterest);

                //System.out.println(totalUserStash + " " + "$" + totalInterest.setScale(2,
                  //      RoundingMode.CEILING) + " " + "$" + totalUserStash.add(totalInterest).setScale(2, RoundingMode.CEILING));
            }
            System.out.println("Your Total Contribution: " + "$" + decimalFormat.format(totalUserStash));
            System.out.println("Total Compound Growth: " + "$" + decimalFormat.format(totalInterest));
            System.out.println("Contribution + Compound Growth: " + "$" + decimalFormat.format(totalUserStash.add(totalInterest)));
            System.out.println("");
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
            BigDecimal btcDivisor = new BigDecimal(".75");
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


