public class Book {
    String title;
    String author;
    double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public void updatePrice(double newPrice) {
        if (newPrice < 0) {
            System.out.println("Error: Price cannot be negative.");
            return;
        }
        this.price = newPrice;
    }

    public void applyDiscount(double discountPercent) {
        if (discountPercent > 0.00 && discountPercent < 100.00) {
            double discountAmount = price * (discountPercent / 100.0);
            double newPrice = price - discountAmount;
            updatePrice(newPrice);
            System.out.printf("A discount of %.2f%% has been applied.%n", discountPercent);
            System.out.printf("The new price is: %.2f%n", newPrice);
        } else {
            System.out.printf("Error: Invalid discount percentage %.2f%%.", discountPercent);
        }
    }
}
