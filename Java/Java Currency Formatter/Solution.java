import java.util.*;
import java.text.*;
import java.text.NumberFormat;
public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
       Locale india = new Locale("en","in");
        System.out.println("US: " + NumberFormat.getCurrencyInstance().format(payment));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(india).format(payment));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
    }
}
