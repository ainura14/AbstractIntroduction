package HomeWork.OnlineStore;

import java.time.LocalDate;

public class Device extends Product{
    private String brand;
    private String color;
    private String isNew;
    private int memory;

    public Device(String name, String description, int price, LocalDate createdAt, String brand, String color, String isNew, int memory) {
        super(name, description, price, createdAt);
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Device: " +
                "\nbrand: " + brand +
                "\ncolor: " + color +
                "\nisNew: " + isNew +
                "\nmemory: " + memory + "\n";
    }
}
