package comparasion03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Carlos.J.Pina
 */
public class Comparasion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Enter First number: ");
        num1 = input.nextInt();
        
        System.out.println("Enter Second number: ");
        num2 = input.nextInt();
        
        if ( num1 == num2 ) {
            System.out.printf("%d == %d\n", num1, num2);
        }
        
        if ( num1 != num2 ) {
            System.out.printf("%d != %d\n", num1, num2);
        }
        
        if ( num1 < num2 ) {
            System.out.printf("%d < %d\n", num1, num2);
        }
        
        if ( num1 > num2 ) {
            System.out.printf("%d > %d\n", num1, num2);
        }
        
        if ( num1 <= num2 ) {
            System.out.printf("%d <= %d\n", num1, num2);
        }
        
        if ( num1 >= num2 ) {
            System.out.printf("%d >= %d\n", num1, num2);
        }
    }
}
