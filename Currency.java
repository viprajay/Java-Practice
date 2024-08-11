import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Currency {

    static String converter(Locale locale, double payment) {
        NumberFormat nFormat = NumberFormat.getCurrencyInstance(locale);
        if (locale.equals(new Locale("en", "IN"))) {
            return "Rs." + nFormat.format(payment).substring(1);
            // Skip the currency symbol
        } else {
            return nFormat.format(payment);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        System.out.println("US: " + converter(Locale.US, payment));
        System.out.println("India: " + converter(new Locale("en", "IN"), payment));
        System.out.println("China: " + converter(Locale.CHINA, payment));
        System.out.println("France: " + converter(Locale.FRANCE, payment));
    }
}