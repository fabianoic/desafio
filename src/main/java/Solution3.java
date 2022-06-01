public class Solution3 {
    abstract static class Book {
        String title;

        abstract void setTitle(String s);

        String getTitle() {
            return title;
        }
    }

    protected static class MyBook extends Book {
        @Override
        void setTitle(String s) {
            title = s;
        }
    }

    public static void main(String[] args) {
        MyBook myBook = new MyBook();
        myBook.setTitle("A tale of two cities");
        System.out.println("The title is: " + myBook.getTitle());
    }
}
