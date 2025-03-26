import java.util.HashSet;
import java.util.Scanner;

public class countLargestReapetedString {
    public static void main(String[] args) {
        int j = 0, maxlen = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String word = scanner.next();
        int n = word.length();
        HashSet<Character> set = new HashSet<>();
    
        for (int i = 0; i < n; i++) {  
            while (set.contains(word.charAt(i))) {
                set.remove(word.charAt(j));  
                j++;
            }
            set.add(word.charAt(i));
            maxlen = Math.max(maxlen, i - j + 1); 
        }

        System.out.println("Highest number is: " + maxlen);
        scanner.close();
    }
}
