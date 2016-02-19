package nguyen.ui;

import nguyen.business.Account;
import nguyen.business.CheckingAccount;

import java.util.Scanner;

/**
 * Created by Ken on 2/19/2016.
 */
public class AccountApp {
    public static void main(String args[]) {

        CheckingAccount acc = new CheckingAccount();
        System.out.println("Welcome to the Account Calculator");
        System.out.println();
        System.out.println("Starting Balance");
        System.out.println(acc.getBalanceFormatted());
        System.out.println();
        System.out.println("Enter the transactions for the month");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            System.out.print("Withdrawal or deposit? (w/d): ");
            String appChoice = sc.nextLine();
            Console cs = new Console();

            if(appChoice.equalsIgnoreCase("w")) {
                Double amt = (cs.getDouble("Amount: "));
                if(amt > acc.getBalance()) {
                    System.out.print("You don't have the sufficient funds.");
                } else {
                    acc.withdraw(amt);
                }
            } else if(appChoice.equalsIgnoreCase("d")) {
                Double amt = (cs.getDouble("Amount: "));
                if(amt > 10000) {
                    System.out.print("You cannot deposit that much at once.");
                } else {
                    acc.deposit(amt);
                }
            }

            System.out.println();
            System.out.println();
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
        }
        System.out.println("Monthly Fees");
        System.out.println("Checking fee: " + acc.getMonthlyFeeFormatted());
        System.out.println();
        System.out.println("Final Balance");
        acc.subtractMonthlyFee();
        System.out.println("Checking: " + acc.getBalanceFormatted());
    }
}
