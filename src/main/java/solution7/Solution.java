package solution7;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Write the lenght of word:");
            Integer wordLenght = scanner.nextInt();
            System.out.println("Write a word:");
            String word = scanner.next();

            if (word.length() != wordLenght) {
                System.out.println(0);
            }

            WordValidation wordValidation = new WordValidation();

            String biggestWord = wordValidation.validWordperLetters(word);

            System.out.println(biggestWord.length());

        } catch (Exception e) {
            System.out.println("Exception - " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
