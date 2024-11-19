package HomeWork.OnlineStore;

import java.time.LocalDate;

public class Book extends Product{
    private String authorFullName;

    public Book(String name, String description, int price, LocalDate createdAt, String authorFullName) {
        super(name, description, price, createdAt);
        this.authorFullName = authorFullName;
    }

    @Override
    public String toString() {
        return "Book:" +
                "\nauthorFullName: " + authorFullName + super.toString();
    }
}
