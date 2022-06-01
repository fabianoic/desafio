package solution9;

public class FoodFactory {
    public Food getFood(String food) {
        switch (food.toLowerCase()) {
            case "cake":
                return new Cake();
            case "pizza":
                return new Pizza();
        }
        return null;
    }
}
