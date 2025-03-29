// Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
import java.util.Scanner;

public class RegularExpressionMatching {
    
    public static boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2];
                    if (p.charAt(j - 2) == s.charAt(i - 1) || p.charAt(j - 2) == '.') {
                        dp[i][j] |= dp[i - 1][j];
                    }
                }
            }
        }
        
        return dp[m][n];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String word = scanner.next();  
        System.out.print("Enter the pattern: ");
        String pattern = scanner.next(); 

        boolean result = isMatch(word, pattern);
        System.out.println("Match result: " + result);

        scanner.close();
    }
}
