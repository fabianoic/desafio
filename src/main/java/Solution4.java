import java.util.stream.IntStream;

public class Solution4 {
    interface AdvancedArithmetic {
        int divisorSum(int number);
    }

    protected static class MyCalculator implements AdvancedArithmetic {
        @Override
        public int divisorSum(int number) {
            if (number > 1000) {
                System.exit(1);
            }
            return IntStream.range(1, number).filter(i -> number % i == 0).sum() + number;
        }
    }

    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();
        System.out.println(calculator.divisorSum(1001));
    }
}
