/**
 * Created by Ken on 2/18/2016.
 */
package nguyen.business;

public class Employee extends Person {
    private String sNumber;

    public Employee() {
    }

    public void setSNumber(String num) {
        this.sNumber = num;
    }

    public String getsNumber() {
        return this.sNumber;
    }

    public String getDisplayText() {
        return super.toString() +
        "\n" + "Social security number: " + this.sNumber;
    }
}
