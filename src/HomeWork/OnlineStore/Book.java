package HomeWork.OnlineStore;

import java.time.LocalDate;

public class Book extends Product{
    private String authorFullName;
    private int incrementedId = 0;

    public Book(long id, String name, String description, int price, LocalDate createdAt, String authorFullName) {
        super(id, name, description, price, createdAt);
        this.authorFullName = authorFullName;
        this.incrementedId++;
    }

    @Override
    public String toString() {
        return "Book:" +
                "\nauthorFullName: " + authorFullName + super.toString();
    }

}
