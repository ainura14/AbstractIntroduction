package HomeWork.OnlineStore;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);
        User user = new User();

//        Product device = new Device(1l,"Laptop", "for Study", 12000, LocalDate.of(2023, 01, 12),"Mac", "grey", "Yes", 256);
//        Product book = new Book(1l,"C++", "for learn beginners", 560, LocalDate.of(2020, 03, 24), "Askat Musaev");
//        Product[] products = {device, book};
//        user.setProducts(products);


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
                    user.addUser(user);
                    break;
                }
                case "2", "Login" ->{
                    System.out.println("Enter your email: ");
                    String loginEmail = scanner.nextLine();
                    if(user.getEmail().equals(loginEmail)){
                        System.out.println("Enter your password: ");
                        int loginPassword = scInt.nextInt();
                        if(user.getPassword() == loginPassword){
//                            System.out.println("We will show your products...");
//                            Product[] products1 = user.getAll();
//                            System.out.println(Arrays.toString(products1));
                            boolean loggedIn = true;
                            while(loggedIn){
                                System.out.println("""
                                        Press 0 to logout
                                        Press 1 to add new product
                                        Press 2 to get all products
                                        Press 3 to get all books
                                        Press 4 to get all device
                                        Press 5 to delete product by ID
                                        Press 6 to delete products by ID
                                        Press 7 to exit
                                        """);
                                int num = scInt.nextInt();
                            switch(num) {
                                case 0:
                                    user.setEmail(null);
                                    user.setPassword(0);
                                    break;
                                case 1:
                                    boolean addDeviceTrue = true;
                                    while(addDeviceTrue) {
                                        System.out.println("""
                                                Which product do you want to add: 
                                                Press to 1 to add book
                                                Press to 2 to add device
                                                Press to 3 to exit
                                                """);
                                    int choiceProduct = scInt.nextInt();
                                        switch (choiceProduct) {
                                            case 1:
                                                System.out.println("Write name of the book: ");
                                                String bookName = scanner.nextLine();

                                                System.out.println("Write description of the book: ");
                                                String bookDescription = scanner.nextLine();

                                                System.out.println("Write price of the book: ");
                                                int bookPrice = scInt.nextInt();

                                                System.out.println("Write date of the book: ");
                                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                                                String inputDate = scanner.nextLine();
                                                LocalDate bookDate = LocalDate.parse(inputDate, formatter);

                                                System.out.println("Write author full name: ");
                                                String bookAuthorFullName = scanner.nextLine();

                                                Book book1 = new Book(2l, bookName, bookDescription, bookPrice, bookDate, bookAuthorFullName);
                                                user.addBook(book1);
                                                break;
                                            case 2:
                                                System.out.println("Write name of the device: ");
                                                String deviceName = scanner.nextLine();

                                                System.out.println("Write description of the device: ");
                                                String deviceDescription = scanner.nextLine();

                                                System.out.println("Write price of the device: ");
                                                int devicePrice = scInt.nextInt();

                                                System.out.println("Write date of the device: ");
                                                DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                                                String inputDate1 = scanner.nextLine();
                                                LocalDate deviceDate = LocalDate.parse(inputDate1, formatter1);

                                                System.out.println("Write brand the device: ");
                                                String deviceBrand = scanner.nextLine();

                                                System.out.println("Write color the device: ");
                                                String deviceColor = scanner.nextLine();

                                                System.out.println("Write the device is new(Yes/NO): ");
                                                String deviceIsNew = scanner.nextLine();

                                                System.out.println("Write memory the device: ");
                                                int deviceMemory = scInt.nextInt();

                                                Device device1 = new Device(2l, deviceName, deviceDescription, devicePrice, deviceDate, deviceBrand, deviceColor, deviceIsNew, deviceMemory);
                                                user.addDevice(device1);
                                                break;
                                            case 3:
                                                addDeviceTrue = false;
                                            default:
                                                System.out.println("Can't find this option.");
                                        }
                                    }
                                    break;
                                case 2:
                                    Product[] products1 = user.getAllProducts();
                                    System.out.println(Arrays.toString(products1));
                                    break;
                                case 3:
                                    System.out.println(user.getAllBook());
                                    break;
                                case 4:
                                    System.out.println(user.getAllDevice());
                                    break;
                                case 5:
                                    System.out.println("Write product id which do you want to delete: ");
                                    long id = scanner.nextLong();
                                    System.out.println(User.deleteProduct(id));
                                    break;
                                case 6:
                                    System.out.println("Write how many products id do you want to delete: ");
                                    int n = scInt.nextInt();
                                    long[] ids = new long[n];
                                    for (int i = 0; i < ids.length; i++) {
                                        System.out.println("Write product ID: ");
                                         ids[i] = scanner.nextLong();
                                    }
                                    System.out.println(User.deleteProduct(ids));
                                    break;
                                case 7:
                                    loggedIn = false;
                                }
                            }
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
