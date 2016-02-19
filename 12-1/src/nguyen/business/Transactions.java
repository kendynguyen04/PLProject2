/**
 * Created by Ken and Jimmy on 2/19/2016.
 */

package nguyen.business;

import nguyen.account.interfaces.Withdrawable;
import nguyen.account.interfaces.Depositable;

public class Transactions {
    public static void deposit(Depositable account, double amount) {
        account.deposit(amount);
    }
    public static void withdraw(Withdrawable account, double amount) {
        account.withdraw(amount);
    }
}
