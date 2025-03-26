// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
// You may assume the two numbers do not contain any leading zero, except the number 0 itself.
// like [1,2,3] and [4,5,6] output should be [5,7,9] sum of 321 and 654
 
import java.util.Scanner;

public class addTwoNumbers {
    
    public static int[] addTwoNumbers(int[] num1, int[] num2) {
        int first = 0, second = 0;
        for (int i = num1.length - 1; i >= 0; i--) {
            first = first * 10 + num1[i];
        }
        for (int i = num2.length - 1; i >= 0; i--) {
            second = second * 10 + num2[i];
        }
        int sum = first + second;

        String sumStr = Integer.toString(sum);
        int[] result = new int[sumStr.length()];
        
        for (int i = 0; i < sumStr.length(); i++) {
            result[i] = Character.getNumericValue(sumStr.charAt(sumStr.length() - 1 - i));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first list of numbers (separated by spaces): ");
        String[] input1 = scanner.nextLine().split(" ");
        int[] num1 = new int[input1.length];

        for (int i = 0; i < input1.length; i++) {
            num1[i] = Integer.parseInt(input1[i]);
        }

        System.out.print("Enter the second list of numbers (separated by spaces): ");
        String[] input2 = scanner.nextLine().split(" ");
        int[] num2 = new int[input2.length];

        for (int i = 0; i < input2.length; i++) {
            num2[i] = Integer.parseInt(input2[i]);
        }

        int[] result = addTwoNumbers(num1, num2);

        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        scanner.close();
    }
}
