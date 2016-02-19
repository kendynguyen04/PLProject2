/**
 * Created by Ken on 2/18/2016.
 */
package nguyen.business;

public class Customer extends Person {

    private String customerNumber;

    public Customer() {
    }

    public void setCustomerNumber(String num) {
        this.customerNumber = num;
    }

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public String getDisplayText() {
        return super.toString() +
        "\n" + "Customer number: " + this.customerNumber;
    }
}
