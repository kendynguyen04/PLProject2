/**
 * Created by Ken and Jimmy on 2/19/2016.
 */
package nguyen.business;

import java.text.NumberFormat;

public class CheckingAccount extends Account {

    private double fee = 1.00;

    public void subtractMonthlyFee() {
        super.setBalance(super.getBalance() - this.fee);
    }

    public void setMonthlyFee(double monthlyFee) {
        this.fee = monthlyFee;
    }

    public double getMonthlyFee() {
        return this.fee;
    }

    public String getMonthlyFeeFormatted() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(fee);
    }
}
