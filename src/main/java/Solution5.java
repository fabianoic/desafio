import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            Integer loop;
            do {
                System.out.println("First number");
                Integer firstValue = scanner.nextInt();
                System.out.println("Second number");
                Integer secondValue = scanner.nextInt();

                System.out.println(firstValue / secondValue);

                System.out.println("digit 0 to exit or other to continue");
                loop = scanner.nextInt();
            } while (loop != 0);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (ArithmeticException e) {
            System.out.println(String.format("%s: / by zero", e.getClass().getName()));
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
