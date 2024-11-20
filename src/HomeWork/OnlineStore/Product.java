package HomeWork.OnlineStore;

import java.time.LocalDate;

public abstract class Product {
//    1. Product деген класс туз. Полелери (name, description, price, createdAt).
//    Product классын мурастаган эки класс тузунуз.
//    Device-тын полелери(brand, color, isNew, memory).
//    Book-тун полелери(authorFullName).
//    Андан сырткары дагы бир User деген класс туз.
//    Полелери (firstName, lastName, email, password, products).

//    2. Сайтты колдонуу үчүн, биринчи колдонуучу (User) катталуусу керек.
//    Төмөндөгү командалар болсун:
//            1. Каттоо. Register
//            2. Кирүү Login
//            3. Чыгyy. Exit
//    Deadline(Мөөнөтү): 19.11.2024 18:00
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
