import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Write a word to know if is a palindrome:");
            String word = scanner.next();

            System.out.println(isPalindrome(word.toCharArray()) ? "YES" : "NO");

        } catch (Exception e) {
            System.out.println("Exception - " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public static boolean isPalindrome(char[] charArray) {
        Integer foward = 0;
        Integer backward = charArray.length -1;
        while (backward > foward) {
            if (charArray[foward] != charArray[backward]) {
                return false;
            }
            foward++;
            backward--;
        }

        return true;
    }
}
