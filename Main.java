public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Doe", 1000.00);

        book.applyDiscount(-20);
        book.applyDiscount(0);
        book.applyDiscount(100);
        book.applyDiscount(150);

        System.out.println();

        book.applyDiscount(25.00);
        book.displayDetails();

        System.out.println();

        book.applyDiscount(0.5);
        book.applyDiscount(50);
        book.displayDetails();
    }
}
