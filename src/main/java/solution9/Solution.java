package solution9;

import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Write PIZZA or CAKE to order:");
            Food food = new FoodFactory().getFood(scanner.nextLine());

            System.out.println("The factory returned class " + food.getType());
            System.out.printf(food.getMessage());
        } catch (Exception e) {
            System.out.println("Exception - " + e.getStackTrace());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
