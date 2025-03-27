import java.util.Scanner;

public class ReverseInt {

    public static int reverse(int num1) {
        int rev = 0;
        boolean isNegative = num1 < 0;  
        if (isNegative) {
            num1 = -num1;
        }

        while (num1 != 0) {
            int digit = num1 % 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; 
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; 
            }
            
            rev = rev * 10 + digit;
            num1 = num1 / 10;
        }

        
        return isNegative ? -rev : rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();  

        int reversedNumber = reverse(n);
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
}
