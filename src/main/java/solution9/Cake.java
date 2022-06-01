package solution9;

public class Cake implements Food {

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String getMessage() {
        return "Someone ordered a Dessert!";
    }
}
