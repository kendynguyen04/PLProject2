/**
 * Created by Ken and Jimmy on 2/19/2016.
 */
package nguyen.business;

import nguyen.account.interfaces.Balanceable;
import nguyen.account.interfaces.Depositable;
import nguyen.account.interfaces.Withdrawable;

import java.text.NumberFormat;

public class Account implements Balanceable, Depositable, Withdrawable {

    private double balance = 0;

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public String getBalanceFormatted() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(this.balance);
    }
}
