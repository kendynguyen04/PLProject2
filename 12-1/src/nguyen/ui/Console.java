package nguyen.ui;

/**
 * Created by Ken and Jimmy on 2/19/2016.
 */
import java.util.Scanner;

public class Console {
    private static Scanner sc = new Scanner(System.in);

    public static void displayLine() {
        System.out.println();
    }

    public static void display(String s) {
        System.out.println(s);
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();
        return s;
    }

    public static double getDouble(String prompt) {
        double d = 0;
        while (true) {
            System.out.print(prompt);
            try {
                d = Double.parseDouble(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error! Invalid decimal. Try again.");
            }
        }
        return d;
    }
}
