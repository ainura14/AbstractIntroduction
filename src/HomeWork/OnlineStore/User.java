package HomeWork.OnlineStore;

import java.util.Arrays;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private int password;
    static private Product[] products = new Product[0];
    private User[] users = new User[4];
    private int size = 0;

    public User() {
    }

    public User(String firstName, String lastName, String email, int password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String addUser(User user){
        users = Arrays.copyOf(users, size + 1);
        users[size] = user;
        return "Successfully saved student!";
    }
    public Product[] getAllProducts(){
        return products;
    }
    public String addBook(Book book){
        products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = book;
        return "Book successfully saved!";
    }
    public String addDevice(Device device){
        products = Arrays.copyOf(products, products.length + 1);
        products[products.length - 1] = device;
        return "Book successfully saved!";
    }

    public String getAllBook(){
        String books = "";
        for (int i = 0; i < products.length; i++) {
            if(products[i] instanceof Book){
                books = products[i].toString();
            }
        }
        return books;
    }
    public String getAllDevice(){
        String devices = "";
        for (int i = 0; i < products.length; i++) {
            if(products[i] instanceof Device){
                devices += products[i].toString();
            }
        }
        return devices;
    }
    public static String deleteProduct(long id){
        int productSize = products.length;
        boolean findBook = false;
        for (int i = 0; i < productSize; i++) {
            if(products[i].getId() == id) {
                findBook = true;
                for (int j = i; j < productSize - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[productSize - 1] = null;
            }
            products = Arrays.copyOf(products, products.length - 1);
            productSize--;
        }
        if(!findBook){
            return "Successfully deleted.";
        }else{
            return "Can't find this id";
        }
    }
    public static String deleteProduct(long[] ids){
        boolean findById = false;
        int productSize = products.length;
        for (int i = 0; i < productSize; i++) {
            for (long id : ids) {
                if(products[i].getId() == id){
                    findById = true;
                    for (int j = i; j < productSize - 1; j++) {
                        products[j] = products[j + 1];
                    }
                    productSize -= 1;
                }
                products = Arrays.copyOf(products, products.length - 1);
            }
        }
        if(!findById){
            return "Successfully deleted.";
        }else{
            return "Can't find this ids";
        }
    }





}
