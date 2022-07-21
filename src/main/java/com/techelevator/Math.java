package com.techelevator;

import java.math.BigDecimal;
//import java.text.DecimalFormat;
import java.text.DecimalFormat;
import java.util.Scanner;



public class Math {


        Scanner keyboardScanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");



        // How do I make this work here, and not in the main?!?!!
        int investChoice = promptForInt(keyboardScanner, "What is your selection? ");
        int investmentLength = promptForInt(keyboardScanner, "How many years do you plan on investing? ");
        BigDecimal userContribution = promptForBigDecimal(keyboardScanner, "How much do you plan on investing every year? ");



        private static int promptForInt (Scanner keyboardScanner, String prompt){
            boolean goodInput = false;
            int userChoice = 1;
            do {
                try {
                    System.out.print(prompt);
                    userChoice = Integer.parseInt(keyboardScanner.nextLine());
                    goodInput = true;
                } catch (NumberFormatException e) {
                }  //need the empty block after catch
            } while (!goodInput);

            return userChoice;
        }

        private static BigDecimal promptForBigDecimal (Scanner keyboardScanner, String prompt){
            boolean goodInput = false;
            BigDecimal userChoice = new BigDecimal(1);
            do {
                try {
                    System.out.print(prompt);
                    userChoice = new BigDecimal(keyboardScanner.nextLine());
                    goodInput = true;
                } catch (NumberFormatException e) {
                }
            } while (!goodInput);

            return userChoice;
        }

    public static void preTaxSavingsCalc () {
        BigDecimal investedTaxableIncome = BigDecimal.ZERO;

//        Scanner scanner = new Scanner (System.in);
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

//        if (annualIncome.compareTo(incomeTier1) > 0) {
//            System.out.println(annualIncome.multiply(taxTier1));
//        }
    }

        public static void computationRates () {

            BigDecimal savingsInterest = new BigDecimal("0.0001");
            BigDecimal highYieldInterest = new BigDecimal(".01");
            BigDecimal fourZeroOneKWithMatch = new BigDecimal(".11");
            BigDecimal standardAndPoors500 = new BigDecimal(".105");
            BigDecimal tenYearUSTreasury = new BigDecimal(".0313");
            BigDecimal goldRateSinceNixon = new BigDecimal(".106");
            BigDecimal standardAndPoors = new BigDecimal(".105");
            BigDecimal bitcoinReturn = new BigDecimal("230.00");
        }


        public void savingsRateMath () {
            // below is the code to calculate savings rate. Try to use this method in main.
            BigDecimal totalUserStash = BigDecimal.ZERO;
            BigDecimal totalInterest = BigDecimal.ZERO;
            BigDecimal interest = new BigDecimal("0.0001");

            for (int year = 1; year <= investmentLength; year++) {

                totalUserStash = userContribution.add(totalUserStash);
                BigDecimal interestForThisYear = totalInterest.add(totalUserStash).multiply(interest);
                totalInterest = interestForThisYear.add(totalInterest);
            }
            System.out.println("Your total contribution: " + "$" + decimalFormat.format(totalUserStash));
            System.out.println("Total interest earned: " + "$" + decimalFormat.format(totalInterest));
            System.out.println("Contribution + Interest: " + "$" + decimalFormat.format(totalUserStash.add(totalInterest)));
            System.out.println("");
            int selection = promptForInt(keyboardScanner, "Press (1) to learn more about Savings Accounts:\n" +
                    "Press (2) to return to the Main Menu: ");
            // int selection = promptForInt(keyboardScanner, "Press (2) to return to the Main Menu: ");
            System.out.println("");

            if (selection == 1) {
                Glossary.savingsGlossary();
            } else if (selection == 2) {
                TopMenu.introduction();
            }

        }

        public void highYieldSavingsMath () {
            BigDecimal totalUserStash = BigDecimal.ZERO;
            BigDecimal totalInterest = BigDecimal.ZERO;
            BigDecimal highYieldInterest = new BigDecimal(".01");

            for (int year = 1; year <= investmentLength; year++) {

                totalUserStash = userContribution.add(totalUserStash);
                BigDecimal interestForThisYear = totalInterest.add(totalUserStash).multiply(highYieldInterest);
                totalInterest = interestForThisYear.add(totalInterest);
            }
            System.out.println("Your total contribution: " + "$" + decimalFormat.format(totalUserStash));
            System.out.println("Total interest earned: " + "$" + decimalFormat.format(totalInterest));
            System.out.println("Contribution + Interest: " + "$" + decimalFormat.format(totalUserStash.add(totalInterest)));
            System.out.println("");
            int selection = promptForInt(keyboardScanner, "Press (1) to learn more about High-Yield Savings Accounts:\n" +
                    "Press (2) to return to the Main Menu: ");
            System.out.println("");

            if (selection == 1) {
                Glossary.highYieldGlossary();
            } else if (selection == 2) {
                TopMenu.introduction();
            }
        }

        public void fourZeroOneKMath () {
            BigDecimal totalUserStash = BigDecimal.ZERO;
            BigDecimal totalInterest = BigDecimal.ZERO;
            BigDecimal fourZeroOneKWithMatch = new BigDecimal(".11");

            for (int year = 1; year <= investmentLength; year++) {

                totalUserStash = userContribution.add(totalUserStash);
                BigDecimal interestForThisYear = totalInterest.add(totalUserStash).multiply(fourZeroOneKWithMatch);
                totalInterest = interestForThisYear.add(totalInterest);
            }

            System.out.println("Your Total Contribution: " + "$" + decimalFormat.format(totalUserStash));
            System.out.println("Total Compound Growth: " + "$" + decimalFormat.format(totalInterest));
            System.out.println("Contribution + Compound Growth: " + "$" + decimalFormat.format(totalUserStash.add(totalInterest)));
            System.out.println("");
            int selection = promptForInt(keyboardScanner, "Press (1) to learn more about 401Ks:\n" +
                    "Press (2) to return to the Main Menu: ");
            System.out.println("");

            if (selection == 1) {
                Glossary.fourZeroOneKGlossary();
            } else if (selection == 2) {
                TopMenu.introduction();
            }
        }

        public void standardAndPoorsMath () {
            BigDecimal totalUserStash = BigDecimal.ZERO;
            BigDecimal totalInterest = BigDecimal.ZERO;
            BigDecimal standardAndPoors500 = new BigDecimal(".105");

            for (int year = 1; year <= investmentLength; year++) {

                totalUserStash = userContribution.add(totalUserStash);
                BigDecimal interestForThisYear = totalInterest.add(totalUserStash).multiply(standardAndPoors500);
                totalInterest = interestForThisYear.add(totalInterest);
            }
            //*********** the below code is good for showing year over year growth from investment *******************///////////
            /////////  System.out.println(totalUserStash + " " + "$" + totalInterest.setScale(2,
            ///////// // RoundingMode.CEILING) + " " + "$" + totalUserStash.add(totalInterest).setScale(2, RoundingMode.CEILING));

            System.out.println("Your Total Contribution: " + "$" + decimalFormat.format(totalUserStash));
            System.out.println("Total Compound Growth: " + "$" + decimalFormat.format(totalInterest));
            System.out.println("Contribution + Compound Growth: " + "$" + decimalFormat.format(totalUserStash.add(totalInterest)));
            System.out.println("");
            int selection = promptForInt(keyboardScanner, "Press (1) to learn more about S&P 500 Index Funds:\n" +
                    "Press (2) to return to the Main Menu: ");
            System.out.println("");

            if (selection == 1) {
                Glossary.standardAndPoorsGlossary();
            } else if (selection == 2) {
                TopMenu.introduction();
            }
        }

        public void tenYearTreasuryMath () {
            BigDecimal totalUserStash = BigDecimal.ZERO;
            BigDecimal totalInterest = BigDecimal.ZERO;
            BigDecimal tenYearUSTreasury = new BigDecimal(".0313");

            for (int year = 1; year <= investmentLength; year++) {

                totalUserStash = userContribution.add(totalUserStash);
                BigDecimal interestForThisYear = totalInterest.add(totalUserStash).multiply(tenYearUSTreasury);
                totalInterest = interestForThisYear.add(totalInterest);
            }
            //System.out.println(totalUserStash + " " + "$" + totalInterest.setScale(2,
            //      RoundingMode.CEILING) + " " + "$" + totalUserStash.add(totalInterest).setScale(2, RoundingMode.CEILING));

            System.out.println("Your Total Contribution: " + "$" + decimalFormat.format(totalUserStash));
            System.out.println("Total Interest Earned: " + "$" + decimalFormat.format(totalInterest));
            System.out.println("Contribution + Interest: " + "$" + decimalFormat.format(totalUserStash.add(totalInterest)));
            System.out.println("");
            int selection = promptForInt(keyboardScanner, "Press (1) to learn more about 10 Year U.S. Treasuries:\n" +
                    "Press (2) to return to the Main Menu: ");
            System.out.println("");

            if (selection == 1) {
                Glossary.usTreasuryGlossary();
            } else if (selection == 2) {
                TopMenu.introduction();
            }
        }

        public void goldMath () {
            BigDecimal totalUserStash = BigDecimal.ZERO;
            BigDecimal totalInterest = BigDecimal.ZERO;
            BigDecimal goldRateSinceNixon = new BigDecimal(".106");

            for (int year = 1; year <= investmentLength; year++) {

                totalUserStash = userContribution.add(totalUserStash);
                BigDecimal interestForThisYear = totalInterest.add(totalUserStash).multiply(goldRateSinceNixon);
                totalInterest = interestForThisYear.add(totalInterest);
            }
            //System.out.println(totalUserStash + " " + "$" + totalInterest.setScale(2,
            //      RoundingMode.CEILING) + " " + "$" + totalUserStash.add(totalInterest).setScale(2, RoundingMode.CEILING));
            System.out.println("-------- new code new code new code ------");
            System.out.println("Your Total Contribution: " + "$" + decimalFormat.format(totalUserStash));
            System.out.println("Total Compound Growth: " + "$" + decimalFormat.format(totalInterest));
            System.out.println("Contribution + Compound Growth: " + "$" + decimalFormat.format(totalUserStash.add(totalInterest)));
            System.out.println("");
            int selection = promptForInt(keyboardScanner, "Press (1) to learn more about Gold:\n" +
                    "Press (2) to return to the Main Menu: ");
            System.out.println("");

            if (selection == 1) {
                Glossary.goldGlossary();
            } else if (selection == 2) {
                TopMenu.introduction();
            }
        }

        public void bitcoinMath () {
            BigDecimal totalUserStash = BigDecimal.ZERO;
            BigDecimal totalInterest = BigDecimal.ZERO;
            BigDecimal bitcoinReturn = new BigDecimal("2.30");
            BigDecimal btcDivisor = new BigDecimal(".25");
            BigDecimal btcDecrement = bitcoinReturn.multiply(btcDivisor);


            for (int year = 1; year <= investmentLength; year++) {

                totalUserStash = userContribution.add(totalUserStash);
                BigDecimal interestForThisYear = totalInterest.add(totalUserStash).multiply(bitcoinReturn);
                totalInterest = interestForThisYear.add(totalInterest);
                ///// curly brace moved from here
            }
            System.out.println("-------- new code new code new code ------");
            System.out.println("Your Total Contribution: " + "$" + decimalFormat.format(totalUserStash));
            System.out.println("Total Compound Growth: " + "$" + decimalFormat.format(totalInterest.multiply(btcDivisor)));
            System.out.println("Contribution + Compound Growth: " + "$" + decimalFormat.format(totalUserStash.add(totalInterest).multiply(btcDivisor)));
            System.out.println("");
            int selection = promptForInt(keyboardScanner, "Press (1) to learn more about Bitcoin:\n" +
                    "Press (2) to return to the Main Menu: ");
            System.out.println("");

            if (selection == 1) {
                Glossary.btcGlossary();
            } else if (selection == 2) {
                TopMenu.introduction();
            }
//    System.out.println("--------- old stuff. no decrementing going on here ------");
//    System.out.println(totalUserStash + " " + "$" + totalInterest.setScale(2, RoundingMode.CEILING) + " "
//            + "$" + totalUserStash.add(totalInterest).setScale(2, RoundingMode.CEILING));
//
//    System.out.println("----- below is the decrementing count. still working on this ------- ");
//    //********************************************************************************************************//
//    System.out.println(totalUserStash + " " + "$" + totalInterest.multiply(btcDivisor).setScale(2,
//            RoundingMode.CEILING) + " " + "$" + totalUserStash.add(totalInterest.multiply(btcDivisor)).setScale(2, RoundingMode.CEILING));
//    //********************** Return to decrementing interest rate for Bitcoin *********************************** //
//
////                        Add a second loop (or variable) to decrement btc return by 25%
        }




// if annualIncome < incomeTier2, then apply taxTier1
        // MATH: (annualIncome * taxTier1)
// if annualIncome > incomeTier1, then (annualIncome * taxTier1 UP TO incomeTier2) + (annualIncome - incomeTier1) * taxTier2 ????

//        if (incomeTier1 >= annualIncome && incomeTier1 < incomeTier2) {
//        annualIncome.multiply()
//        }

    }





