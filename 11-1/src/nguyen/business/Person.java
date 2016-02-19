/**
 * Created by Ken on 2/18/2016.
 */
package nguyen.business;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String emailAddress;

    public Person() {
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String s) {
        this.firstName = s;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String s) {
        this.lastName = s;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String s) {
        this.emailAddress = s;
    }

    @Override
    public String toString() {
        String message = "Name: " + firstName + " " + lastName +
        "\n" + "Email: " + emailAddress;
        return message;

    }

    public abstract String getDisplayText();

}
