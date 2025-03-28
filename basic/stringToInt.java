import java.util.Scanner;

class stringToInt {  
    public int myAtoi(String s) {
        int i = 0, n = s.length(), sign = 1, result = 0;
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;
            i++;
        }
        
        return result * sign;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        stringToInt solution = new stringToInt();  
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.println("Converted integer: " + solution.myAtoi(input));
        
        scanner.close();
    }
}
