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

            System.out.print("Create customer or employee? (c/e):");
            String appChoice = sc.nextLine();

            if(appChoice.equalsIgnoreCase("c")) {

                Customer cust = new Customer();
                System.out.print("Enter first name: ");
                String first = sc.nextLine();
                cust.setFirstName(first);
                System.out.print("Enter last name: ");
                String last = sc.nextLine();
                cust.setLastName(last);
                System.out.print("Enter email address: ");
                String email = sc.nextLine();
                cust.setEmailAddress(email);
                System.out.print("Customer number: ");
                String custNumber = sc.nextLine();
                cust.setCustomerNumber(custNumber);
                Person per = cust;

            } else if(appChoice.equalsIgnoreCase("e")) {

                Employee emp = new Employee();
                System.out.print("Enter first name: ");
                String first = sc.nextLine();
                emp.setFirstName(first);
                System.out.print("Enter last name: ");
                String last = sc.nextLine();
                emp.setLastName(last);
                System.out.print("Enter email address: ");
                String email = sc.nextLine();
                emp.setEmailAddress(email);
                System.out.print("Social security number:");
                String socialnum = sc.nextLine();
                emp.setSNumber(socialnum);
                Person per = emp;

            }

            print(per);

            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
    }
}
