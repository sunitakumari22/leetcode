import java.util.Scanner;
public class palindrome{
  public static int reverse(int num1) {
       int originalNum = num1;
        int rev = 0; int palin=0;
        boolean isNegative = num1 < 0;  
        if (isNegative) {
            num1 = -num1;
        }

        while (num1 != 0) {
            int digit = num1 % 10;
            
            rev = rev * 10 + digit;
            num1 = num1 / 10;
        }
        if(rev==originalNum){ 
         palin=1;
        } 

        else{
            palin=0;
        }       
        return palin;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt(); 
        int palinn = reverse(n); 
        if(palinn==1){
            System.out.println(n + " is  a palindrome number: ");
        }
        else{
            System.out.println(n + " is not a  palindrome number: ");
        }
        scanner.close();
    }
}