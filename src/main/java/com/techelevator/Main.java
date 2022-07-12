package com.techelevator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            //// this line will place the investment selection menu. starts code right here
            Scanner keyboardScanner = new Scanner(System.in);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setGroupingUsed(true);
            decimalFormat.setGroupingSize(3);

      //  Computation computation = new Computation();
//          int investChoice = Integer.parseInt(keyboardScanner.nextLine());
//          int investmentLength = Integer.parseInt(keyboardScanner.nextLine());
//        BigDecimal userContribution = new BigDecimal(keyboardScanner.nextLine());


        TopMenu.introduction();

      // int investChoice = promptForInt(keyboardScanner, "What is your selection? ");
            // use for inspiration below to cut down on repitious text
        int input = promptForInt(keyboardScanner, "Please choose an option: ");
        System.out.println("");
           // String input = keyboardScanner.nextLine();
            //System.out.println("");

        if (input == 1) {
            SavingsRate.prompt();
        } if (input == 3) {
                Retirement.retirementClass();
            }

            if (input == 2) {

                TopMenu.disclaimer();
               int subinput = promptForInt(keyboardScanner, "(1) to Confirm and Continue: ");
              //  String subInput = keyboardScanner.nextLine();
                System.out.println("");


                if (subinput == 1) {

                   TopMenu.savingsAndInvestments();
                    //System.out.print("What is your selection? ");
                  //  int investChoice = Integer.parseInt(keyboardScanner.nextLine());
                    int investChoice = promptForInt(keyboardScanner, "What is your selection? ");
                    System.out.println("");

                   // System.out.print("How many years do you plan on investing? ");
//                    int investmentLength = Integer.parseInt(keyboardScanner.nextLine());
                    int investmentLength = promptForInt(keyboardScanner,"How many years do you plan on investing? " );
                    System.out.println("");

                   // BigDecimal userContribution = new BigDecimal(keyboardScanner.nextLine());
                    BigDecimal userContribution = promptForBigDecimal(keyboardScanner,"How much do you plan on investing every year? " );
                    System.out.println("");

                    if (investChoice == 1)
                    {

                          //  computation.savingsRateMath();
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
                        int selection = promptForInt(keyboardScanner,"Press (1) to learn more about Savings Accounts:\n" +
                                "Press (2) to return to the Main Menu: " );
                       // int selection = promptForInt(keyboardScanner, "Press (2) to return to the Main Menu: ");
                        System.out.println("");

                        if (selection == 1) {
                            Glossary.savingsGlossary();
                        } else if (selection == 2) {
                            TopMenu.introduction();
                        }
                   }

                    else if (investChoice == 2) {

                       // computation.highYieldSavingsMath();
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
                        int selection = promptForInt(keyboardScanner,"Press (1) to learn more about High-Yield Savings Accounts:\n" +
                                "Press (2) to return to the Main Menu: " );
                        System.out.println("");

                        if (selection == 1) {
                            Glossary.highYieldGlossary();
                        } else if (selection == 2) {
                            TopMenu.introduction();
                        }

                    }

                    if (investChoice == 3) {

                     //   computation.fourZeroOneKMath();
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

                      //  computation.standardAndPoorsMath();
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
                        int selection = promptForInt(keyboardScanner,"Press (1) to learn more about S&P 500 Index Funds:\n" +
                                "Press (2) to return to the Main Menu: " );
                        System.out.println("");

                        if (selection == 1) {
                            Glossary.standardAndPoorsGlossary();
                        } else if (selection == 2) {
                            TopMenu.introduction();
                        }
//
                   }

                    if (investChoice == 5) {

                      //  computation.tenYearTreasuryMath();
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

                         //computation.goldMath();
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

                       // computation.bitcoinMath();
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
                        int selection = promptForInt(keyboardScanner,"Press (1) to learn more about Bitcoin:\n" +
                                "Press (2) to return to the Main Menu: " );
                        System.out.println("");

                        if (selection == 1) {
                            Glossary.btcGlossary();
                        } else if (selection == 2) {
                            TopMenu.introduction();
                        }


                        System.out.println("--------- old stuff. no decrementing going on here ------");
                        System.out.println(totalUserStash + " " + "$" + totalInterest.setScale(2, RoundingMode.CEILING) + " "
                                + "$" + totalUserStash.add(totalInterest).setScale(2, RoundingMode.CEILING));

                        System.out.println("----- below is the decrementing count. still working on this ------- ");
                        //********************************************************************************************************//
                        System.out.println(totalUserStash + " " + "$" + totalInterest.multiply(btcDivisor).setScale(2,
                                RoundingMode.CEILING) + " " + "$" + totalUserStash.add(totalInterest.multiply(btcDivisor)).setScale(2, RoundingMode.CEILING));
                        //********************** Return to decrementing interest rate for Bitcoin *********************************** //

//                        Add a second loop (or variable) to decrement btc return by 25%

                    }

                    if (investChoice == 8) {


                    }
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



//                        // display the year and the amount
//                        System.out.printf("%4d%20s%n", year,
//                                NumberFormat.getCurrencyInstance().format(amount));
//                    }

