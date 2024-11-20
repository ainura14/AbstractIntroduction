package PracticeDay.Task2;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer(1l, "Adyl", "adyl@com", LocalDate.of(2024, 12, 03), 700700700);
        Customer customer2 = new Customer(2l, "Kadyr", "Kad12@gmail.com", LocalDate.of(2000, 04,5), 999090090);
        Customer customer3 = new Customer(3l, "Salam", "Kad12@gmail.com", LocalDate.of(2000, 04,5), 999090090);
        Customer customer4 = new Customer(4l, "Takdyr", "Kad12@gmail.com", LocalDate.of(2000, 04,5), 999090090);

        customer1.createCustomer(customer2);
        customer1.createCustomer(customer4);
        System.out.println(Arrays.toString(customer1.getAllCustomers()));
        System.out.println(customer1.updateCustomer(2l, customer3));
        System.out.println(Arrays.toString(customer1.getAllCustomers()));
        customer1.deleteCustomer(4l);

        System.out.println(Arrays.toString(customer1.getAllCustomers()));
    }

}
