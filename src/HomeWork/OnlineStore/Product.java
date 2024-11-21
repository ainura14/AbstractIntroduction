package HomeWork.OnlineStore;

import java.time.LocalDate;

public abstract class Product {
//    Интернет дүкөн.(Online Store)
//            1. Product деген класс туз. Полелери (name, description, price, createdAt).
//    Product классын мурастаган эки класс тузунуз.
//    Device-тын полелери(brand, color, isNew, memory).
//    Book-тун полелери(authorFullName).
//    Андан сырткары дагы бир User деген класс туз.
//    Полелери (firstName, lastName, email, password, products).
//            2. Сайтты колдонуу үчүн, биринчи колдонуучу (User) катталуусу керек.
//    Төмөндөгү командалар болсун:
//            1. Каттоо. Register
//            2. Кирүү Login
//            3. Чыгyy. Exit
//    Deadline(Мөөнөтү): 19.11.2024 18:00


//            3. Колдонуучу катталгандан кийин Login команда аркылу кирип,
//    төмөнкү функцияларды аткара алсын:
//            0. Logout Чыгуу
//            1. Add new Product Жаңы продукт кошуңуз
//            2. Get all Products Бардык продукталарды алыңыз
//            3. Get all Book Бардык китепти алыңыз
//            4. Get all Device Бардык устройстволарды алыңыз
//            4. Exit команда программаны токтотсун.
//    Deadline(Мөөнөтү): 20.11.2024 18:00


//            5. Product, Device, Book деген класстарга (private long id;) деген жаны
//    поле кошобуз.
//    Ар бир продуктанын id-лери уникалдуу болуп сакталышы керек.
//6. Андан кийин продукталарды өчүрчү эки static overload метод туз:
//    deleteProduct(long id);
//    deleteProduct(long[] ids);
//    Deadline(Мөөнөтү): 21.11.2024 18:00

    private long id;
    private String name;
    private String description;
    private int price;
    private LocalDate createdAt;

    public Product(long id, String name, String description, int price, LocalDate createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nname: " + name +
                "\ndescription:" + description +
                "\nprice: " + price +
                "\ncreatedAt: " + createdAt + "\n";
    }
}
