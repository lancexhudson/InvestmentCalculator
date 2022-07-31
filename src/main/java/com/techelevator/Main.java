package com.techelevator;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main extends TopMenu {


    public static void main(String[] args) {

            Scanner keyboardScanner = new Scanner(System.in);
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            decimalFormat.setGroupingUsed(true);
            decimalFormat.setGroupingSize(3);

        Computation computation = new Computation();
        TopMenu topMenu = new TopMenu();


        TopMenu.introduction();

        int input = promptForInt(keyboardScanner, "Please choose an option: ");
        System.out.println("");

        if (input == 1) {
            SavingsRate.prompt();

        } if (input == 3) {
                Retirement.retirementClass();
            }

            if (input == 2) {
                TopMenu.disclaimer();

               int subinput = promptForInt(keyboardScanner, "(1) to Confirm and Continue: ");
                System.out.println("");

                if (subinput == 1) {
                   TopMenu.savingsAndInvestments();


                    int investChoice = promptForInt(keyboardScanner, "What is your selection? ");
                    System.out.println("");
                    // TopMenu.investmentPrompts();
                    int investmentLength = promptForInt(keyboardScanner,"How many years do you plan on investing? " );
                    System.out.println("");
                    BigDecimal userContribution = promptForBigDecimal(keyboardScanner,"How much do you plan on investing every year? " );
                    System.out.println("");


                    if (investChoice == 1) {

                        BigDecimal interest = new BigDecimal("0.0001");
                        String result = computation.calculateCompoundGrowth(investmentLength, userContribution, interest);
                        System.out.print(result);

                        int selection = promptForInt(keyboardScanner,"Press (1) to learn more about Savings Accounts:\n" +
                                "Press (2) to return to the Main Menu: " );
                        System.out.println("");

                        if (selection == 1) {
                            Glossary.savingsGlossary();
                        } else if (selection == 2) {
                            TopMenu.introduction();
                        }
                   }

                    else if (investChoice == 2) {

                        BigDecimal interest = new BigDecimal("0.01");
                        String result = computation.calculateCompoundGrowth(investmentLength, userContribution, interest);
                        System.out.print(result);

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

                        BigDecimal interest = new BigDecimal("0.11");
                        String result = computation.calculateCompoundGrowth(investmentLength, userContribution, interest);
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

                        ///////////////////////////////// AMATORIZATION BLOCK AMATORIZATION ??????????????????????????????????????????
                        //*********** the below code is good for showing year over year growth from investment *******************///////////
                        /////////  System.out.println(totalUserStash + " " + "$" + totalInterest.setScale(2,
                        ///////// // RoundingMode.CEILING) + " " + "$" + totalUserStash.add(totalInterest).setScale(2, RoundingMode.CEILING));

                        BigDecimal interest = new BigDecimal("0.105");
                        String result = computation.calculateCompoundGrowth(investmentLength, userContribution, interest);
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
                        String result = computation.calculateCompoundGrowth(investmentLength, userContribution, interest);
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
                        String result = computation.calculateCompoundGrowth(investmentLength, userContribution, interest);
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

                        BigDecimal totalUserStash = BigDecimal.ZERO;
                        BigDecimal totalInterest = BigDecimal.ZERO;
                        BigDecimal bitcoinReturn = new BigDecimal("2.30");
                        BigDecimal btcDivisor = new BigDecimal(".60");
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
                        
//                        System.out.println("--------- old stuff. no decrementing going on here ------");
//                        System.out.println(totalUserStash + " " + "$" + totalInterest.setScale(2, RoundingMode.CEILING) + " "
//                                + "$" + totalUserStash.add(totalInterest).setScale(2, RoundingMode.CEILING));
//
//                        System.out.println("----- below is the decrementing count. still working on this ------- ");
//                        //********************************************************************************************************//
//                        System.out.println(totalUserStash + " " + "$" + totalInterest.multiply(btcDivisor).setScale(2,
//                                RoundingMode.CEILING) + " " + "$" + totalUserStash.add(totalInterest.multiply(btcDivisor)).setScale(2, RoundingMode.CEILING));
//                        //********************** Return to decrementing interest rate for Bitcoin *********************************** //

//                        Add a second loop (or variable) to decrement btc return by 25%

                    }

                    if (investChoice == 8) {


                        String result = computation.calculateInflationHalving(userContribution);
                        System.out.print(result);

                        int selection = promptForInt(keyboardScanner,"Press (1) to *************************************:\n" +
                                "Press (2) to return to the Main Menu: " );
                        System.out.println("");

                        if (selection == 1) {
                            Glossary.goldGlossary();
                        } else if (selection == 2) {
                            TopMenu.introduction();
                        }
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
//                    } ___________________________________________________________________________________________________________


//  Computation computation = new Computation();
//          int investChoice = Integer.parseInt(keyboardScanner.nextLine());
//          int investmentLength = Integer.parseInt(keyboardScanner.nextLine());
//        BigDecimal userContribution = new BigDecimal(keyboardScanner.nextLine());      //  Computation computation = new Computation();
////          int investChoice = Integer.parseInt(keyboardScanner.nextLine());
////          int investmentLength = Integer.parseInt(keyboardScanner.nextLine());
////        BigDecimal userContribution = new BigDecimal(keyboardScanner.nextLine());


//__________________________________________________________________________________________________________________________________


// int investChoice = promptForInt(keyboardScanner, "What is your selection? ");
// use for inspiration below to cut down on repitious text


//__________________________________________________________________________________________________________________________________


// String input = keyboardScanner.nextLine();
//System.out.println("");


//__________________________________________________________________________________________________________________________________


/////// THE BELOW BLOCK IS NEW.
//            System.out.println("See how powerful your savings can be:");
//            System.out.println("");
//            System.out.println("(1) for Investing");
//            System.out.print("(2) for Retirement:");
//            if (input == 1) {
//                TopMenu.savingsAndInvestments();
//            }
//            if (input == 2) {
//                TopMenu.retirementTop();
//            }
/////// THE ABOVE BLOCK IS NEW.


//__________________________________________________________________________________________________________________________________


//  String subInput = keyboardScanner.nextLine();


//__________________________________________________________________________________________________________________________________


//System.out.print("What is your selection? ");
//  int investChoice = Integer.parseInt(keyboardScanner.nextLine());


//__________________________________________________________________________________________________________________________________


// System.out.print("How many years do you plan on investing? ");
//                    int investmentLength = Integer.parseInt(keyboardScanner.nextLine());


//__________________________________________________________________________________________________________________________________


// BigDecimal userContribution = new BigDecimal(keyboardScanner.nextLine());


//__________________________________________________________________________________________________________________________________


//                    System.out.println("How would you like to proceed?");                                              // this is a test block
//                            System.out.println("(1) Calculate your financial future based off Income & Savings Rate");
//                            System.out.println("(2) Proceed by inputting values manually");
//                            String selection = String.valueOf(Integer.parseInt(keyboardScanner.nextLine()));
//                            System.out.println("");
//                            if (selection == "2") {
//                            SelectionMenu.savingsRateVsIncome();
//                            }
//
//                            System.out.print("What is your annual income? ");
//                            BigDecimal annualIncome = new BigDecimal(keyboardScanner.nextLine());
//                            System.out.println("");
//                            System.out.println("");

//__________________________________________________________________________________________________________________________________

//                       // computation.highYieldSavingsMath();
//                        BigDecimal totalUserStash = BigDecimal.ZERO;
//                        BigDecimal totalInterest = BigDecimal.ZERO;
//                        BigDecimal highYieldInterest = new BigDecimal(".01");
//
//                        for (int year = 1; year <= investmentLength; year++) {
//
//                            totalUserStash = userContribution.add(totalUserStash);
//                            BigDecimal interestForThisYear = totalInterest.add(totalUserStash).multiply(highYieldInterest);
//                            totalInterest = interestForThisYear.add(totalInterest);
//                        }
//                        System.out.println("Your total contribution: " + "$" + decimalFormat.format(totalUserStash));
//                        System.out.println("Total interest earned: " + "$" + decimalFormat.format(totalInterest));
//                        System.out.println("Contribution + Interest: " + "$" + decimalFormat.format(totalUserStash.add(totalInterest)));
//                        System.out.println("");

//__________________________________________________________________________________________________________________________________




