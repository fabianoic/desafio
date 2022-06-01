package solution11;

public class Solution {
    public static void main(String[] args) {
        String[] stringArray = {"Value 1", "Value 2", "Value 3"};
        Integer[] integerArray = {5, 4, 3, 2, 1};

        MyArrayPrinter<String> stringPrinter = new MyArrayPrinter<>();
        MyArrayPrinter<Integer> integerPrinter = new MyArrayPrinter<>();

        System.out.println(stringPrinter.printArray(stringArray));
        System.out.println(integerPrinter.printArray(integerArray));
    }
}
