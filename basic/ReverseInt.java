import java.util.Scanner;

public class ReverseInt {
    public static int reverseNumber(int num1) {
        int rev = 0;
        while (num1 > 0) {
            int temp = num1 % 10;
            rev = (rev * 10) + temp;
            num1 = num1 / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();  

        int reversedNumber = reverseNumber(n);
        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();  
    }
}Solution
