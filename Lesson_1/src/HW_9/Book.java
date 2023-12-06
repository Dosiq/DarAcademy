package HW_9;

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public class Description {
        public void displayBookInfo() {
            System.out.println("Book Title: " + title);
        }
    }
}
