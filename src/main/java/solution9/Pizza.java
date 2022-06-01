package solution9;

public class Pizza implements Food {

    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String getMessage() {
        return "Someone ordered Fast Food!";
    }
}
