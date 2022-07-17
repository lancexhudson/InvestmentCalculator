package com.techelevator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Investment extends Computation {


    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);

        //  Computation computation = new Computation();
//          int investChoice = Integer.parseInt(keyboardScanner.nextLine());
//          int investmentLength = Integer.parseInt(keyboardScanner.nextLine());
//        BigDecimal userContribution = new BigDecimal(keyboardScanner.nextLine());


        TopMenu.introduction();

//        int input = promptForInt(keyboardScanner, "Please choose an option: ");
//        System.out.println("");


    }
}
