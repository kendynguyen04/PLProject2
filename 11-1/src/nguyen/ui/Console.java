/**
 * Created by Ken on 2/18/2016.
 */
package nguyen.ui;

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
}
