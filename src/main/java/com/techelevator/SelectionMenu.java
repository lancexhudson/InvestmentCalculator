package com.techelevator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;
import java.util.Scanner;

public class SelectionMenu extends Retirement {


       //public static void mainSelection() {

            public static void savingsRateVsIncome() {

                Scanner keyboardScanner = new Scanner(System.in);

                System.out.println("How would you like to proceed?");
                System.out.println("(1) Calculate your financial future based off Income & Savings Rate");
                System.out.println("(2) Proceed by inputting values manually");
                String selection = String.valueOf(Integer.parseInt(keyboardScanner.nextLine()));
                System.out.println("");

                if (selection == "1") {

                }

            System.out.println("-----------------------------------------------");
            System.out.println(" DISCLAIMER: This is NOT investment advice");
            System.out.println("  Past performance != Future Performance");
            System.out.println(" Save what you can & Do your own research");
            System.out.println("------------------------------------------------");
            System.out.println("");
            System.out.print("(1) to Confirm & Continue: ");
            String subInput = keyboardScanner.nextLine();
            System.out.println("");



            System.out.println("---------------------------------------------");
            System.out.println("   Savings & Investment Options: ");
            System.out.println("---------------------------------------------");
            System.out.println("(1) Savings Account");
            System.out.println("(2) Savings Account (High Yield)");
            System.out.println("(3) 401K");
            System.out.println("(4) 401K + Employer Match");
            System.out.println("(5) S&P 500 Index Fund");
            System.out.println("(6) U.S. Treasuries");
            System.out.println("(7) Gold");
            System.out.println("(8) Bitcoin");
            System.out.println("(9) All of the Above");
            System.out.println("(0) Return to Main Menu");
            System.out.println("");
            System.out.print("What is your selection? ");
            int investChoice = Integer.parseInt(keyboardScanner.nextLine());

        }
  }




