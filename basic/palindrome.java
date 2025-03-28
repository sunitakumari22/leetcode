import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(int num1) {
        int originalNum = num1; 
        int rev = 0;       
        boolean isNegative = num1 < 0;  
        if (isNegative) {
            return false; 
        }
        while (num1 != 0) {
            int digit = num1 % 10;
            rev = rev * 10 + digit;
            num1 = num1 / 10;
        }
        return rev == originalNum; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt(); 

        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println(n + " is not a palindrome number.");
        }

        scanner.close();
    }
}
