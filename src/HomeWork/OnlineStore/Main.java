package HomeWork.OnlineStore;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        User user = new User();

        Product device = new Device("Laptop", "for Study", 12000, LocalDate.of(2023, 01, 12), "Mac", "grey", "Yes", 256);
        Product book = new Book("C++", "for learn beginners", 560, LocalDate.of(2020, 03, 24), "Askat Musaev");
        Product[] products = {device, book};
        user.setProducts(products);


        while(true) {
            System.out.println("""
            Enter one of the choice: 
            Press 1 or Register: 
            Press 2 or Login: 
            Press 3 or Exit: 
            """);
            String value = scanner.nextLine();
            switch (value.toLowerCase()) {
                case "1", "register" ->{
                    System.out.println("Write your first name: ");
                    user.setFirstName(scanner.nextLine());
                    System.out.println("Write your last name: ");
                    user.setLastName(scanner.nextLine());
                    System.out.println("Write your email: ");
                    user.setEmail(scanner.nextLine());
                    System.out.println("Write your password");
                    user.setPassword(scInt.nextInt());
                    user.add(user);
                    break;
                }
                case "2", "Login" ->{
                    System.out.println("Enter your email: ");
                    String loginEmail = scanner.nextLine();
                    if(user.getEmail().equals(loginEmail)){
                        System.out.println("Enter your password: ");
                        int loginPassword = scInt.nextInt();
                        if(user.getPassword() == loginPassword){
                            System.out.println("We will show your products...");
                            Product[] products1 = user.getAll();
                            System.out.println(Arrays.toString(products1));
                        }else{
                            System.out.println("Invalid password.");
                        }
                    }else{
                        System.out.println("Email not found.");
                    }
                    break;
                }
                case "3", "Exit" ->{
                    System.out.println("Exiting the program...");
                    return;
                }
                default -> {
                    System.out.println("Invalid choice, please try again.");
                }
            }
        }
    }
}
