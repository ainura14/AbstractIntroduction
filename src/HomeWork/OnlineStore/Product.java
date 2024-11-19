package HomeWork.OnlineStore;

import java.time.LocalDate;

public abstract class Product {
    private String name;
    private String description;
    private int price;
    private LocalDate createdAt;

    public Product(String name, String description, int price, LocalDate createdAt) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "\nname: " + name +
                "\ndescription:" + description +
                "\nprice: " + price +
                "\ncreatedAt: " + createdAt + "\n";
    }
}
