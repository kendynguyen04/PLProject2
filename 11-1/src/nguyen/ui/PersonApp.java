/**
 * Created by Ken on 2/18/2016.
 */
package nguyen.ui;

import java.util.Scanner;
import nguyen.business.Customer;
import nguyen.business.Employee;
import nguyen.business.Person;

public class PersonApp {

    public static void print(Person p) {
        System.out.print(p.getDisplayText());
    }

    public static void main(String args[]) {

        System.out.println("Welcome to the Person Tester application");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            System.out.print("Create customer or employee? (c/e): ");
            String appChoice = sc.nextLine();
            Console cs = new Console();

            if(appChoice.equalsIgnoreCase("c")) {

                Customer cust = new Customer();
                cust.setFirstName(cs.getString("Enter first name: "));
                cust.setLastName(cs.getString("Enter last name: "));
                cust.setEmailAddress(cs.getString("Enter email address: "));
                cust.setCustomerNumber(cs.getString("Customer number: "));
                Person per = cust;
                System.out.println();
                print(per);

            } else if(appChoice.equalsIgnoreCase("e")) {

                Employee emp = new Employee();
                emp.setFirstName(cs.getString("Enter first name: "));
                emp.setLastName(cs.getString("Enter last name: "));
                emp.setEmailAddress(cs.getString("Enter email address: "));
                emp.setSNumber(cs.getString("Social security number: "));
                Person per = emp;
                System.out.println();
                print(per);

            }

            System.out.println();
            System.out.println();
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
    }
}
